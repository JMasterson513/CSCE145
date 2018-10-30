//Joseph Masterson

import java.util.Scanner;


public class sort {

	public static void main(String[] args) {
		
		//Creates an object of class Scanner to accept user input
		Scanner key = new Scanner(System.in);
		
		//Prompts user for the size of the array
		System.out.println("How many numbers do you want to sort?");
		int size = key.nextInt();
		
		//Creates an array to accept user input
		double[] sortArray = new double[size];
				
		//Loop which promprs the user for the elements of the array
		for(int i = 0; i < size; i++)
		{
			System.out.println("Enter the array value at index " + i + ":");
			sortArray[i] = key.nextDouble();
		}
		
		System.out.println("Array values before sorting:");
		
		//Prints the array before sorting
		for(int i = 0; i < size; i++)
		{
			System.out.print(sortArray[i] + "\t");
		}
		
		//Sorts the array from largest to smallest
		for(int i = 0; i < size; i++)
		{
			int largeIndex = i;
			
			for(int j = i +1 ; j < size; j++)
			{
				if(sortArray[j] > sortArray[largeIndex])
				{
					largeIndex = j;
				}
			}
			
			double temp = sortArray[i];
			sortArray[i] = sortArray[largeIndex];
			sortArray[largeIndex] = temp;
		}
		
		
		System.out.println("\nArray values after sorting:");
		
		//Prints the sorted array
		for(int i = 0; i< size; i++)
		{
			System.out.print(sortArray[i] + "\t");
		}
		
		key.close();

	}

}
