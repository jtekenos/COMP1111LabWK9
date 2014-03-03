package p1;

import javax.swing.JFrame;

/**
 * Demonstrates a graphical user interface and event
 * listeners to tally votes for two candidates, joe and sam.
 * @author Jessica Tekenos set 1C.
 *
 */

public class VoteCounter {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame ("Vote Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(new VoteCounterPanel());
        
        frame.pack();
        frame.setVisible(true);
    }

}
