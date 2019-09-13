package activity;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman 
{
	static {
		System.out.println("Welcome to Hangman!");
		System.out.println("You have 6 tries to guess the correct word.");
		System.out.println("Good Luck!\n");
	}
	
	public static String getRandomPhrase() {
		ArrayList<String> rWord = WordList.getWord();
		int min = 0;
		int max = rWord.size();
		Random r = new Random();
		int pos = r.ints(min, (max + 1)).findFirst().getAsInt();
		return rWord.get(pos);
	}
	
	public static void main(String[] args) {
		String wordToGuess = getRandomPhrase();
		char [] answer = wordToGuess.toUpperCase().toCharArray();
		ArrayList<Character> ans = new ArrayList<Character>();
		
		for(Character c : answer) {
			ans.add(c);
		}
		
		int numOfTries = 6;
		Character guess = ' ';
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<answer.length; i++) {
			if (answer[i] == ' ') {
				sb.append(" ");
			} else {
				sb.append("*");
			}
		}
		
		System.out.println("The secret word: " + sb.toString());
		System.out.print("Guess a letter: ");
		Scanner in = new Scanner(System.in);
		while(0 < numOfTries) {
			guess = in.next().toUpperCase().toCharArray()[0];
			if (ans.contains(guess)) {
				for (int i=0; i<answer.length; i++) {
					if (answer[i] == guess) {
						sb.setCharAt(i, guess);
						continue;
					}
				}
				String finish = sb.toString();
				if (!finish.contains("*")) {
					System.out.println(finish);
					System.out.println("Congratulations! You solved the puzzle!");
					break;
				}
			} else {
				numOfTries--;
			}
			
			System.out.println("The secret word: " + sb.toString());
			System.out.println("Number of guesses left = " + numOfTries);
		}
		
		in.close();
	}
}
