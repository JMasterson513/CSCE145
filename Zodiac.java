//Joseph Masterson

import java.util.Scanner;
public class Zodiac {

	public static void main(String[] args) {
		
		//Creates a Scanner Class to Accept User Input
		Scanner key = new Scanner(System.in);
		
		//Accepts the User's Input Year
		System.out.println("Enter Birth Year: ");
		int year = key.nextInt();
		
		//Checks that the input is greater than 1924
		if(year <= 1924)
		{
			System.out.println("You have entered an invalid number.");
			System.exit(0);
		}
		
		//Stores initial Value for the variable used in the switch
		String sign = "No Zodiac Sign";
		
		//Calculates the number 0-11 used for zodiac year
		int zodiac = (year - 1924) % 12;
		
		//Sorts the proper zodiac
		switch(zodiac)
		{
		case 0 :
			sign = "Water Rat";
			break;
			
		case 1 :
			sign = "Earth Ox";
			break ;
			
		case 2 :
			sign = "Wood Tiger";
			break;
		
		case 3 :
			sign = "Wood Rabbit";
			break;
			
		case 4 :
			sign = "Earth Dragon";
			break;
			
		case 5 :
			sign = "Fire Snake";
			break;
			
		case 6 :
			sign = "Fire Horse";
			break;
			
		case 7 :
			sign = "Earth Goat";
			break;
			
		case 8 :
			sign = "Metal Monkey";
			break;
			
		case 9 :
			sign = "Metal Rooster";
			break;
			
		case 10 :
			sign = "Earth Dog";
			break;
			
		case 11 :
			sign = "Water Pig";
			break;
			
		}
		
		//Prints out zodiac result
		System.out.println("You are a " + sign);
		
		//Close scanner
		key.close();
	}

}
