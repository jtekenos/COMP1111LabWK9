package p1;

import java.util.Scanner;

public class Factorials {
    
    public static void main (String[] args) {
        
        int numInput;
        int result = 1;
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a positive integer.");
        
        numInput = scan.nextInt();
        
        while (numInput < 0)
        {
            System.out.println("Invalid number, please enter a positive integer");
            numInput = scan.nextInt();
        }
        
        for (int i = 1; i <= numInput; i++)
        {
            result*= i;
        }
        
        System.out.print("The result is for " + numInput + " is " + result);
        
        scan.close();
        
    }

}
