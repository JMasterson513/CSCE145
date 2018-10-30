//Joseph Masterson

import java.util.Scanner;


public class matrixSub {

	public static void main(String[] args) {
		
		//Creates object of class Scanner
		Scanner key = new Scanner(System.in);
		
		System.out.println("Welcome to the matrix subtracting program!");
		
		//Gets dimensions of first matrix
		System.out.println("Please enter the length of the first matrix:");
		int matrix1_length = key.nextInt();
		
		System.out.println("Please enter the height of the first matrix:");
		int matrix1_height = key.nextInt();
		
		//Gets dimensions of second matrix
		System.out.println("Please enter the length of the second matrix");
		int matrix2_length = key.nextInt();
				
		System.out.println("Please enter the height of the second matrix:");
		int matrix2_height = key.nextInt();
		
		//Checks to make sure the matrices can be subtracted
		if(matrix1_length != matrix2_length || matrix1_height != matrix2_height)
		{
			System.out.println("Cannot subtract these matrices. Dimensions mismatch!");
		}
		
		//Defines the matrices
		int[][] matrix1 = new int[matrix1_length][matrix1_height];
		int[][] matrix2 = new int[matrix2_length][matrix2_height];
		int[][] matrixSub = new int[matrix1_length][matrix2_height];
		
		//Gets elements of the first matrix
		for(int i = 0; i < matrix1_length; i++)
		{
			for(int j = 0; j < matrix1_height; j++)
			{
				int x = i + 1;
				int y = j + 1;
				System.out.println("Please enter a value for matrix 1 at1 position (" + x + "," + y + ")");
				matrix1[i][j] = key.nextInt();
			}
		}
		
		//Gets elements of the second matrix
		for(int i = 0; i < matrix2_length; i++)
		{
			for(int j = 0; j < matrix2_height; j++)
			{
				int x = i + 1;
				int y = j + 1;
				System.out.println("Please enter a value for matrix 2 at position (" + x + "," + y + ")");
				matrix2[i][j] = key.nextInt();
			}
		}
		
		//Prints the first matrix
		for(int i = 0; i < matrix1_length; i++)
		{
			for(int j = 0; j < matrix1_height; j++)
			{
				System.out.print(matrix1[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		System.out.print("-\n");
		
		//Prints the second matrix
		for(int i = 0; i < matrix2_length; i++)
		{
			for(int j = 0; j < matrix2_height; j++)
			{
				System.out.print(matrix2[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		System.out.println("=");
		
		//Subtracts the two matrices and print the values
		for(int i = 0; i < matrix1_length; i++)
		{
			for(int j = 0; j < matrix2_height; j++)
			{
				matrixSub[i][j] = matrix1[i][j] - matrix2[i][j];
				System.out.print(matrixSub[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		//Closes the scanner
		key.close();
	}

}
