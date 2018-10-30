//Joseph Masterson

import java.util.Scanner;


public class Payroll {

	public static void main(String[] args) {
		
		//Creates an object of class Scanner
		Scanner key = new Scanner(System.in);
		
		//Prompts user for the size of the arrays
		System.out.println("Enter the number of employees whose gross wages you wish to calculate:");
		int size = key.nextInt();
		
		//Initializes the arrays
		String[] employeeName = new String[size];
		double[] hoursWorked = new double[size];
		double[] hourlyWage = new double[size];
		double[] GrossWages = new double[size];
		
		//Loop which prompts the user for the elements of the arrays
		for(int i = 0; i < size; i++)
		{
			int next = i + 1;
			
			System.out.println("Enter name of employee " + next + ":");
			employeeName[i] = key.next();
			
			System.out.println("How many hours did " + employeeName[i] + " work this week?");
			hoursWorked[i] = key.nextDouble();
			
			System.out.println("What is " + employeeName[i] + "\'s hourly wage?");
			double wage = key.nextDouble();
			
			//Checks to make sure the hourlyWage is greater than 8
			if(wage >= 8.0)
			{
				hourlyWage[i] = wage;
			}
			
			else 
			{
				System.out.println("Invalid hourly wage entered");
				System.exit(0);
			}
			
		}
		
		//Calculates the gross wage for each person
		for(int i = 0; i < size; i++)
		{
			GrossWages[i] = hoursWorked[i] * hourlyWage[i];
		}
		
		//Sets up the chart
		System.out.println("Name\t Hours Worked\t Hourly Pay Rate\t Gross Wages Earned");
		
		//Prints the elements of the arrays
		for(int i = 0; i < size; i++)
		{
			System.out.print(employeeName[i] + "\t");
			System.out.print(hoursWorked[i] + "\t\t");
			System.out.print("$" + hourlyWage[i] + "\t\t\t");
			System.out.print("$" + GrossWages[i]);
			System.out.println();
		}
		
		//Closes the scanner
		key.close();
	}

}
