//Joseph Masterson

import java.util.Scanner;
import java.util.Random;


public class RockPaperScissor {

	public static void main(String[] args) {
		
		//Create Scanner to accept user input
		Scanner key = new Scanner(System.in);
		
		//Initializes the winning tally
		int user = 0;
		int computer = 0;
		int tie = 0;
		String yes = "hi there";
	
	do {
		
		//Loop for the matches
		for(int i = 0; i < 3; i++) {
			
		//Accepts the user input
		System.out.println("Enter \"Rock\", \"Paper\", or \"Scissors\"");		
		String entry = key.nextLine();
		
		//Results is user choses rock
		if(entry.equalsIgnoreCase("Rock")) {
			Random game = new Random();
			int play = game.nextInt(3);
			
			if(play == 0) {
				System.out.println("Rock vs Rock! Tie Game");
				int c = tie++;
			}
			
			else if(play == 1) {
				System.out.println("Rock vs Scissors! Player Wins");
				int a = user++;
			}
			
			else if(play == 2) {
				System.out.println("Rock vs Paper! Computer Wins");
				int b = computer++;
			}
			
			else {
				System.out.println("Something Went Wrong, Try Again");
			}
		}
		
		else if(entry.equalsIgnoreCase("Paper")) {
			Random game = new Random();
			int play = game.nextInt(3);
			
			if(play == 0) {
				System.out.println("Paper vs Rock! Player Wins");
				int a = user++;
			}
			
			else if(play == 1) {
				System.out.println("Paper vs Scissors! Computer Wins");
				int b = computer++;
			}
			
			else if(play == 2) {
				System.out.println("Paper vs Paper! Tie Game");
				int c = tie++;
			}
			
			else {
				System.out.println("Something Went Wrong, Try Again");
			}
		}
		
		else if(entry.equalsIgnoreCase("Scissors")) {
			Random game = new Random();
			int play = game.nextInt(3);
			
			if(play == 0) {
				System.out.println("Scissors vs Rock! Computer Wins");
				int b = computer++;
			}
			
			else if(play == 1) {
				System.out.println("Scissors vs Scissors! Tie Game");
				int c = tie++;
			}
			
			else if(play == 2) {
				System.out.println("Scissor vs Paper! Player Wins");
				int a = user++;
			}
			else {
				System.out.println("Something Went Wrong, Try Again");
				}
			}
			
		else {
			System.out.println("Invalid Entry. Computer Wins");
			int b = computer++;
			}
		
	System.out.println("Player has won " + user + " times and the computer has won " + computer + " times. Along with " + tie + " ties.");	
	
		}
	
		if(user > computer) {
			System.out.println("The Player Wins");
		}
		
		else if(user < computer) {
			System.out.println("The Computer Wins");
		}
		
		else if(user == computer) {
			System.out.println("Tie Game");
		}
		
		else {
			System.out.println("Something Went Wrong, Please Try Again");
		}
		
		System.out.println("Would you like to play again? Enter \"Yes\" or \"No\"");
		yes = key.nextLine();
		
	} while(yes.equalsIgnoreCase("Yes"));
	
	key.close();
	System.exit(0);
	
	}

}
