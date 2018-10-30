//Joseph Masterson

import java.util.Random;
import java.util.Scanner;

public class DiceRoll {
  
  
  public static void main(String[] args) { 
    
   //Creates a scanner class to accept user input
   Scanner key = new Scanner(System.in);
   
   //Gets the user input
   System.out.println("Enter the number of times a 6 sided die should be rolled: ");
    int roll = key.nextInt();
   
    //Checks to make sure the entered is positive
   if(roll < 0)
   {
     System.out.println("Invalid Number Entered");
     System.exit(0);
   }
   
   //Initializes the dice roll value
   int one = 0;
   int two = 0;
   int three = 0;
   int four = 0;
   int five = 0;
   int six = 0;
   
   //Loops the random rolls 
   for(int i = 0; i < roll; i++)
   {
     Random result = new Random();
     int die = result.nextInt(6) + 1;       
     System.out.println(die + " was rolled");
   
     //Tallies how many times each number was rolled
     switch(die){
       case 1:
         int a = one++;
         break;
         
       case 2:
         int b = two++;
         break;
         
       case 3:
         int c = three++;
         break;
         
       case 4:
         int d = four++; 
         break;
         
       case 5:
         int e = five++;
       break;
         
       case 6:
         int f = six++;
        break;
        
       default:
         System.out.println("Try again");
         break;
     }
          
   }
   
   //Prints the tally
   System.out.println("One: " + one);
   System.out.println("Two : " + two);
   System.out.println("Three : " + three);
   System.out.println("Four : " + four);
   System.out.println("Five: " + five);
   System.out.println("Six: " + six);
   
  }
  

  
}
