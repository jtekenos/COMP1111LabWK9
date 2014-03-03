package p1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Panel for the GUI that tallies votes for the two candidates,
 * Joe and Sam.
 * @author Jessica Tekenos set 1C.
 *
 */
public class VoteCounterPanel extends JPanel{
    
    /**
     * Generated ID. 
     */
    private static final long serialVersionUID = -8925928100064655115L;
    private int votesForJoe;
    private int votesForSam;
    private JButton joe;
    private JButton sam;
    private JLabel labelJoe;
    private JLabel labelSam;
    private JLabel labelWinner;
    
    /**
     * Constructor sets up GUI.
     */
    public VoteCounterPanel() {
        
        votesForJoe = 0;
        votesForSam = 0;
        
        joe = new JButton("Vote for Joe");
        joe.addActionListener(new VoteButtonListener());
        sam = new JButton("Vote for Sam");
        sam.addActionListener(new VoteButtonListener());
        
        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
        labelSam = new JLabel("Votes for Same " + votesForSam);
        labelWinner = new JLabel("Winning candidate is ");
        
        add(joe);
        add(sam);
        add(labelJoe);
        add(labelSam);
        add(labelWinner);
        
        setPreferredSize(new Dimension(300, 100));
        setBackground(Color.BLUE);
    }
    
    private class VoteButtonListener implements ActionListener {
        
        public void actionPerformed(ActionEvent event) {
            
            if (event.getSource() == joe)
            {
                votesForJoe++;
                labelJoe.setText("Votes for Joe: " + votesForJoe);
            }
            if (event.getSource() == sam)
            {
                votesForSam++;
                labelSam.setText("Votes for Sam: " + votesForSam);
            }
            if (votesForSam > votesForJoe)            
                labelWinner.setText("Winning candidate is Sam with " + votesForSam + " votes.");  
            else
                labelWinner.setText("Winning candidate is Joe with " + votesForJoe + " votes.");

        }
        
    }
    

}
