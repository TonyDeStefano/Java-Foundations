import java.util.Random;
import java.util.Scanner;

/**
 * This program will let people pay the guessing game between 0 and 100.
 * @author Tony DeStefano
 *
 */
public class GuessingGame {

	/**
	 * A random number generator method
     * @return a random integer between 0 and 100
	 */
    public static int getRandomNum() {
        int min = 0;
        int max = 100;
        System.out.println("Guess a number between " + min + " and " + max);
        Random r = new Random();
        return r.ints(min, (max + 1)).findFirst().getAsInt();
    }
    
    /**
     * The starting point
     * @param args
     */
    public static void main(String[] args) {    
    	
    	int num; // our random number
    	int guess; // user's guess
    	int guesses; // number of guesses
    	Double games = 0.0; // number of games played
    	Double totalGuesses = 0.0; // total number of guesses across all games
    	int bestScore = 0; // best score
    	int worstScore = 0; // worst score
    	Double averageScore = 0.0; // average score
    	String response; // user's response
    	int thisDif; // difference between this guess and answer
    	int lastDif = 0; // difference between last guess and answer
    	boolean isCorrect = false; // was the answer correct
    	String hiLo; // is the guess high or low
    	
    	Scanner in = new Scanner(System.in);
    	
    	// Do this loop until player chooses not to play again:
    	do {
    	
    		games++;
    		guesses = 0;
        	isCorrect = false;
    		
	        num = getRandomNum(); //our random number
	        
	        do {
	        	
	        	guess = in.nextInt(); // user input
	        	guesses++;
	        	
	        	if (guess == num) {
	        		System.out.println("Congrats! You guessed correctly! It only took you " + guesses + " " + ((guesses == 1) ? "try" : "tries") + ".");
	        		isCorrect = true;
	        	} else {
	        		
	        		// Get the difference between their guess and the answer:
	        		thisDif = Math.abs(num - guess);
	        		
	        		// Determine if they are too high or too low:
	        		hiLo = guess > num ? "high" : "low";
	        		
	        		if (guesses > 1) {
	        			
	        			// Check to see if they are closer than their last guess:
	        			if (thisDif <= lastDif) {
	        				System.out.printf("You are getting warmer! ");
	        			} else {
	        				System.out.printf("You are getting colder! ");
	        			}
	        		}
	        		
	        		System.out.println("Your guess is too " + hiLo + ". Try again!");
	        		lastDif = thisDif;
	        	}
	        	
	        } while(!isCorrect);
	        
	        // Determine if it's the best score:
	        if (games == 1 || guesses < bestScore) {
	        	bestScore = guesses;
	        }
	        
	        // Determine if it's the worst score:
	        if (games == 1 || guesses > worstScore) {
	        	worstScore = guesses;
	        }
	        
	        totalGuesses += guesses;
	        averageScore = totalGuesses/games;
    		
    		System.out.println("Would you like to play again? (y/n)");
    		response = in.next();
	        
    	} while (response.toLowerCase().equals("y"));
    	
    	System.out.println("Thank you for playing!");
    	
    	// If user plays more than one game, show game stats:
    	if (games > 1) {
    		System.out.println(" - Games Played: " + games.intValue());
    		System.out.println(" - Best Score: " + bestScore);
    		System.out.println(" - Worst Score: " + worstScore);
    		System.out.printf(" - Average Score: %.2f", averageScore);
    		System.out.println("");
    	}
    	
    	in.close();
    }

}
