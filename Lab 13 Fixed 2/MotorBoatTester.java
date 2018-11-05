//Joseph Masterson

import java.util.Scanner;

public class MotorBoatTester {

 public static void main(String[] args) {
 
  Scanner key = new Scanner(System.in);
  
  //First object of class MotorBoat
  MotorBoat mb1 = new MotorBoat(45, 50, 0.03);
  System.out.println("MotorBoat 1:");
  System.out.println(mb1.toString());
  
  //Gets the time taken to reach the destination for the first boat
  System.out.println("What is the current speed of the boat (in knotts)?");
  double speed = key.nextInt();
  
  //Gets the distance to the destination for the first boat
  System.out.println("How many more nautical miles do you need to travel?");
  double distance = key.nextInt();
  
  //Calculates the time to reach the destination and the amount of fuel
  double time = mb1.timeTaken(distance, speed);
  double eff = mb1.getEff();
  double fuel = mb1.amountOfFuelUsed(eff, speed, time);
  System.out.println("Time taken to reach the destination: " + time + " hours");
  System.out.println("Amount of fuel used to travel " + distance + 
    " nautical miles at " + speed + " knotts with a motor " + 
    "efficiency of " + eff + " is: " + fuel + " gallons");
  
 
  //Second object of class MotorBoat - uses copy instructor
  MotorBoat mb2 = new MotorBoat(mb1);
  System.out.println("\nMotorBoat 2:");
  System.out.println(mb2.toString());
  
  //Update fuel efficiency of mb2
  mb2.setEff(0.001);
  
  //Gets the time taken to reach the destination for the second boat
  System.out.println("What is the current speed of the boat (in knotts)?");
  double speed2 = key.nextInt();
    
  //Gets the distance to the destination for the second boat
  System.out.println("How many more nautical miles do you need to travel?");
  double distance2 = key.nextInt();
    
  //Calculates the time to reach the destination and the amount of fuel
  double time2 = mb2.timeTaken(distance2, speed2);
  double eff2 = mb2.getEff();
  double fuel2 = mb2.amountOfFuelUsed(eff2, speed2, time2);
  System.out.println("Time taken to reach the destination: " + time2 + " hours");
  System.out.println("Amount of fuel used to travel " + distance2 + 
    " nautical miles at " + speed2 + " knotts with a motor " + 
    "efficiency of " + eff2 + " is: " + fuel2 + " gallons");
  
  key.close();
 }
}
