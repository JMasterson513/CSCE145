import java.util.Scanner;

public class VelocityAndDistance {
	
	
	public static void main(String[] args) {
		//Creates a scanner to accept keyboard input
		Scanner key = new Scanner(System.in);
	
		
		//Prompts the user to enter the initial velocity of the ball and then saves the value
		System.out.println("Enter the initial velocity of the ball (m/s) at point A:");
		double initialVelocity = key.nextDouble();

		//Prompts the user to enter the time taken and then saves the value
		System.out.println("Enter how long (s) it take the ball to reach Point B:"); 
		double time = key.nextDouble();
		
		
		//Calculates the final velocity of the ball
		double velocity = initialVelocity + 9.8 * time;
		
		//Calculates the distance traveled by the ball
		double distance = initialVelocity * time + 0.5 * 9.8 * Math.pow(time, 2);
		
		//Prints the final velocity and distance traveled 
		System.out.println("Final velocity of the ball: " + velocity + " m/s");
		System.out.println("Distance traveled by the ball: " + distance + " meters");
		
		key.close();
	}

}
