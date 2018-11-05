//Joseph Masterson
public class MotorBoat {

 //Instance variable
 private int capacity;
 private int speed;
 private double eff;
 
 //Default constructor
 public MotorBoat()
 {
  this.capacity = 0;
  this.speed = 0;
  this.eff = 0;
 }
 
 //Parameteriizied constructor
 public MotorBoat(int xCapacity, int xSpeed, double xEff)
 {
  this.setCapacity(xCapacity);
  this.setSpeed(xSpeed);
  this.setEff(xEff);
 }
 
 //Copy Constructor
 public MotorBoat(MotorBoat mb)
 {
  this.setCapacity(mb.getCapacity());
  this.setSpeed(mb.getSpeed());
  this.setEff(mb.getEff());
 }
 
 //Accessors
 
 /**
  * Pre-Condition: an instance of the fuel tank capacity must be available
  * Post-Condition: the instance of the fuel tank capacity is returned
  * @return capacity
  * @param none
  */
 public int getCapacity()
 {
  return this.capacity;
 }
 
 /**
  * Pre-Condition: an instance of the speed of the motor boat must be available
  * Post-Condition: the instance of the speed of the boat is returned
  * @return speed
  * @param none
  */
 public int getSpeed()
 {
  return this.speed;
 }
 
 /**
  * Pre-Conditon: an instance of the efficiency of the boat's engine must be available
  * Post-Condition: the instance of the efficiency of the engine is returned
  * @return eff
  * @param none
  */
 public double getEff()
 {
  return this.eff;
 }
 
 //Mutators
 
 /**
  * Pre-Condition: the fuel tank capacity of the motor boat must be available
  * Post-Condition: the instance of the engine capacity is updated
  * @param xCapacity
  */
 public void setCapacity(int xCapacity)
 {
  if(xCapacity > 0)
  {
   this.capacity = xCapacity;
  }
  
  else
  {
   System.out.println("Invalid capacity");
   this.capacity = 0;
  }
 }
 
 /**
  * Pre-Condition: the speed of the motor boat must be available
  * Post-Condition: the instance of the speed is updated
  * @param xSpeed
  */
 public void setSpeed(int xSpeed)
 {
   if(xSpeed > 0)
   {
     this.speed = xSpeed;
   }
   
   else
   {
     System.out.println("Invalid Speed");
     this.speed = 0;
   }
 }
 
 /**
  * Pre-Condition: the efficiency of the boat's motor must be available
  * Post-Condition: the instance of the motor's efficiency is updated
  * @param xEff
  */
 public void setEff(double xEff)
 {
  if(eff >= 0)
  {
   this.eff = xEff;
  }
 
  else
  {
   System.out.println("Invalid efficiency");
   this.eff = 0;
  }
 }
 /**
  * Pre-Condition: the capacity of the engine, speed of the boat and efficiency of the motor must be available
  * Post-Condition: the string which lists off the values of each variable is returned
  * @return string listing the values
  * @param none
  */
 public String toString()
 {
  return "Capacity of fuel tank: " + capacity + " gallons\nMaximum speed of the boat: " + speed + " knots\nEfficiency of the boat\'s motor: " + eff;
 }
 
 /**
  * Pre-Condition: the distance the motorBoat needs to travel and the speed of the boat must be available
  * Post-Condition: the time it takes the boat to travel to the destination is returned
  * @return time it takes the boat to travel the destination
  * @param the distance needed to travel adn the speed of the boat
  */
 public double timeTaken(double distance, double curSpeed)
 {
   if(curSpeed <= speed && curSpeed > 0 && distance > 0)
   {
     double timeTaken = distance / curSpeed;
     return timeTaken;
   }
   
   else
   {
     System.out.println("Invalid value entered");
     System.exit(0);
     return 0;
   }                          
 }
 /**
  * Pre-Condition: The efficiency of the motor, speed of the boat, and the time it takes to reach the destination must be available
  * Post-Condition: the amount of fuel used is returned
  * @return the amount of fuel used
  * @param efficiency of the engine, speed of the boat, time it takes to reach the destination
  */
 public double amountOfFuelUsed(double eff,double curSpeed, double time)
 {
  if(curSpeed <= speed)
  {
   double amountOfFuelUsed = eff * time * Math.pow(curSpeed, 2);
   return amountOfFuelUsed;
  }
  
  else
  {
    System.out.println("Current Speed exceeds Maximum speed of the boat");
    System.exit(0);
    return 0;
  }
 }
 
}
