//Joseph Masterson

import java.util.Scanner;

public class CoffeeTester {

	public static void main(String[] args) {
		//Creates an object of class Scanner
		Scanner key = new Scanner(System.in);

		//Creates two objects of class Coffee
		Coffee firstCup = new Coffee();
		Coffee secondCup = new Coffee();
		
		//Prompts user for the name of the first object
		System.out.println("What’s the name of the first coffee?");
		String xName = key.nextLine();
		firstCup.setName(xName);
		
		//Prompts user for the amount of caffeine in the first object
		System.out.println("What’s the caffeine content?");
		int xCaffContent = key.nextInt();
		firstCup.setCaffContent(xCaffContent);
		key.nextLine();
		
		//Prompts user for the name of the second object
		System.out.println("What’s the name of the second coffee?");
		String cupTwoName = key.nextLine();
		secondCup.setName(cupTwoName);
				
		//Prompts user for the amount of caffeine in the second object
		System.out.println("What’s the caffeine content?");
		int xCaffContent2 = key.nextInt();
		secondCup.setCaffContent(xCaffContent2);

		//Prints the information saved in each object
		System.out.println(firstCup.RiskyAmount());
		System.out.println(secondCup.RiskyAmount());
		
		key.close();
		
	}

}
