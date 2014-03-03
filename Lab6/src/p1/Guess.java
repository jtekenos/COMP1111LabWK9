package p1;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    
    public static void main(String[] args) {
        
        final int MAX_GUESS = 10;
        int numToGuess; //Number the user tries to guess 
        int guess;  //The user's guess 
        int count = 1;
        int countErrors = 0;
        
        Scanner scan = new Scanner(System.in); 
        Random generator = new Random(); 
        
        
        //randomly generate the number to guess 
        numToGuess = generator.nextInt(MAX_GUESS) + 1; //corrects range of guesses
        System.out.println(numToGuess);

        //print message asking user to enter a guess 
        System.out.println("I'm thinking of a number between 1 and 10. Enter your guess!");
        //read in guess 
        
        guess = scan.nextInt();
        
        while (guess != numToGuess ) //keep going as long as the guess is wrong            
            {
            if (guess > MAX_GUESS || guess < 0)
            {
                System.out.println("Invalid number, retry");
                guess = scan.nextInt();
                countErrors++;
             }
                else
                {
                    System.out.println("Nope! Guess again."); 
                    guess = scan.nextInt();
                    count++;
                }

            }
        //print message saying guess is right
        System.out.println("You got it! The number was " + numToGuess + ".");
        System.out.println("It took you " + count + " guesses.");
        System.out.println("Your guess was out of bounds " + countErrors + " times.");
        scan.close();
        }

}
