import java.util.Scanner;


public class weightConverter {
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Welcome to the weight and height converter!");
		
		//gets user's weight in pounds
		System.out.println("Enter weight in pounds:");
		double weight = key.nextDouble();
		
		//gets user's height in feet
		System.out.println("Enter height in feet:");
		double height = key.nextDouble();
		
		//Weight as different units
		System.out.println("Weight in Kilograms: " + weight * 0.456);
		System.out.println("Weight in Stone: " + weight * 0.071 );
		System.out.println("Weight in Slug: " + weight * 0.031);
		System.out.println("Weight in Pennyweight: " + weight * 291.667);
		System.out.println("Weight in Grain: " + weight * 7000);
		
		//Height as different units
		System.out.println("\nHeight in Meter: " + height * 0.305);
		System.out.println("Height in Hand: " + height * 3);
		System.out.println("Height in Furlong: " + height * 0.002);
		System.out.println("Height in Cubit: " + height * 0.667);
		System.out.println("Height in Rack Unit: " + height * 6.857);
		
	}
}