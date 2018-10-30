//Joseph Masterson

import java.util.Scanner;


public class LeastHighest {

	public static void main(String[] args) {
		
	//Creates an object of class Scanner to accept input
	Scanner key = new Scanner(System.in);

	//Prompts the user for the size of the array
	System.out.println("Welcome to the NFL game score keeper! "+
	"\n\nHow many game scores to you want to enter?");	
	int size = key.nextInt();
	
	//Creates the array
	int[] scoreArray = new int[size];
	
	//Gets input for the array
	for(int i = 0; i < size; i++)
	{
		int game = i + 1;
		System.out.println("Please enter the score of game " + game + ":");
		scoreArray[i] = key.nextInt();
	}
	
	//Initializes highest and lowest score
	int highest = scoreArray[0];
	int lowest = scoreArray[0];
	
	//For loop to find the highest and lowest scores
	for(int i = 0; i < size; i++)
	{
		if(scoreArray[i] > highest)
		{
			highest = scoreArray[i];
		}
		
		else if(scoreArray[i] < lowest)
		{
			lowest = scoreArray[i];
		}
	}
	
	//Prints out the highest and lowest game scores
	System.out.println("\nHighest Game Score: " + highest +"\n");
	System.out.println("Lowest Game Score: " + lowest);
	
	//Closes the key
	key.close();
	
	}

}
