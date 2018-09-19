//Joseph Masterson

import java.util.Scanner;

public class ChangeMachine {
	public static void main(String[] args) {
		
		//Creates a Scanner to accept user input
		Scanner key = new Scanner(System.in);
		
		//Prompts the user for an input and then saves it
		System.out.println("Enter a whole number");
		int cash = key.nextInt();
		
		//Defines the values of each coin
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		
		//Finds how many quarters go into the value and the remainder
		int quarterChange = cash / quarter;
		int remainder1 = cash % quarter;
		
		//Finds how many dimes go into the first remainder and the subsequent remainder
		int dimeChange = remainder1 / dime;
		int remainder2 = remainder1 % dime;
				
		//Finds how many nickels go into the second remainder and the remaining pennies
		int nickelChange = remainder2 / nickel;
		int remainder3 = remainder2 % nickel;
		
		//Prints out the calcualted values
		System.out.println(cash + " in coins:\n");
		System.out.println(quarterChange + " quarters");
		System.out.println(dimeChange + " dimes");
		System.out.println(nickelChange + " nickels");
		System.out.println(remainder3 + " pennies");
		
		//Closes the key
		key.close();
	}
}
