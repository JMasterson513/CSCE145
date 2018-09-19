//Joseph Masterson

import java.util.Scanner;

public class discount {

	public static void main(String[] args) {
		
		//Creates a Scanner to accept user input
		Scanner key = new Scanner(System.in);

		//Prompts and get user input
		System.out.println("How many licenses do you want to purchase "
				+ "from SoftLabs");
		int lisc = key.nextInt();
		
		//Checks to make sure a valid number is entered
		if(lisc <= 0)
		{
			System.out.println("This is not a valid number to purchase");
		}
		
		//Calculates discount for 1-9 licenses
		else if(lisc >= 1 && lisc<=9)
		{
			double cost = 89.95 * lisc;
			
			System.out.println("Amount of Discount = $0");
			System.out.println("Total Bill Amount = $ " + cost);
			
			System.exit(0);
		}
		
		//Checks discount for 10-24 licenses
		else if(lisc >= 10 && lisc <= 24)
		{
			double total = 89.95 * lisc;
			double discount = total * 0.2;
			double cost = total - discount;
			
			System.out.println("Amount of Discount = $" + discount);
			System.out.println("Total Bill Amount = $ " + cost);
			
			System.exit(0);
		}
		
		//Checks discount for 25-49 licenses
		else if(lisc >= 25 && lisc <= 49)
		{
			double total = 89.95 * lisc;
			double discount = total * 0.3;
			double cost = total - discount;
			
			System.out.println("Amount of Discount = $" + discount);
			System.out.println("Total Bill Amount = $ " + cost);
			
			System.exit(0);
		}
		
		//Checks discount for 50-99 licenses
		else if(lisc >= 50 && lisc <= 99)
		{
			double total = 89.95 * lisc;
			double discount = total * 0.4;
			double cost = total - discount;
			
			System.out.println("Amount of Discount = $" + discount);
			System.out.println("Total Bill Amount = $ " + cost);
			
			System.exit(0);
		}
		
		//Checks discount for 100 or more licenses
		else if(lisc >= 100)
		{
			double total = 89.95 * lisc;
			double discount = total * 0.5;
			double cost = total - discount;
			
			System.out.println("Amount of Discount = $" + discount);
			System.out.println("Total Bill Amount = $ " + cost);
			
			System.exit(0);
		}
		
		//In case something slips through the first check
		else
		{
			System.out.print("Something went wrong. Please try again");
			
			System.exit(0);
		}
		
	}

}













