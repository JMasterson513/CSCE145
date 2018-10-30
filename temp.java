//Joseph Masterson

import java.util.Scanner;

public class temp {
	
	public static void main(String[] args) {
		
		//Creates a scanner to accept user input
		Scanner key = new Scanner(System.in);
		
		//Creates an array to save the temperatures
		double tempArray[] = new double[11];
		
		double sum = 0;
		
		double average = 0;
		
		//Gets the ten temperatures
		for(int i = 1; i < 11; i++)
		{
			System.out.println("Temperature of day " + i + ": ");
			tempArray[i] = key.nextDouble();
			
			
			sum = tempArray[i] + sum;
			
			average = sum / 10;
			
		}
		
		//Prints out the average temperature
		System.out.println("\nThe average temperature was " + average);
		
		System.out.println("\nThe days that were above average were");
		
		//Finds the days where the temperature was higher than the average
		for(int i = 1; i < 11; i++)
		{
			if(tempArray[i] > average)
			{
				System.out.println("Day " + i + " with " + tempArray[i] + "\n");
			}
		}

		
		key.close();
	}

}
