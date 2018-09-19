package homework;
// Joseph Masterson


import java.util.Scanner;
public class homework {
	public static void main(String[] args) {
		
		 Scanner key = new Scanner(System.in);
		 
		 //Saves the users' name
		    System.out.println("Your Name:");
		    String name = key.nextLine();
		    
		 //Saves the users' age
		 	System.out.println("Your Age:");
		 	int age = key.nextInt();
		 	
		//Saves the users' height in meter
		 	System.out.println("Your height in meters:");
		 	double height = key.nextDouble();
	
			//Allows the blood type to be stored
		 	key.nextLine(); 
		 	
		//Saves the users' blood type
		 	System.out.println("Your blood type:");
		 	String bloodType = key.nextLine();
		 	
		//Saves the users' preference towards cats
		 	System.out.println("Are you a cat person? True or False:");
		 	boolean cat = key.nextBoolean();
		 	
		//Saves the users' preference towards dogs
		 	System.out.println("Are you a dog person? True or False:");
		 	boolean dog = key.nextBoolean();
		 	
		//Saves whether or not the user is a shape shifting reptilian
		 	System.out.println("Are you a shape shifting reptilian? True or False:");
		 	boolean reptilian = key.nextBoolean();
		 	
		//Saves the amount of gold, in kg, buried on the users' land
		 	System.out.println("Amount of gold buried on your land (in kg):");
		 	double gold = key.nextDouble();
		 	
		//Prints all of the saved information
		 	System.out.println("Name: " + name + "\nAge: " + age + "\nHeight: " + height + "\nBlood Type: " + bloodType + "\nCat Person: " + cat + "\nDog Person: " + dog + "\nReptilian Shape Shifter:" + reptilian + "\nAmount of Gold Buried on Land: " + gold);
		 	
		 	
	}
}
