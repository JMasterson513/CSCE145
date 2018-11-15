//Joseph Masterson

public class Car extends Vehicle {

 //Instance variables
 private double mileage;
 private int passengers;
 
 //Default constructor
 public Car()
 {
  super();
  this.mileage = 0;
  this.passengers = 0;
 }
 
 //Parameterized Constructor
 
 /**
  * Pre-Condition: values for the manufacture name, number of cylinders, owner name. gas mileage, and number of passengers must be available
  * Post-Conditon: the instances of the manufacture name, number of cylinders, owner name. gas mileage, and number of passengers are updated
  * @param xManuName xCylinders xOwnersName xMileage xPassengers
  **/
 public Car(String xManuName, int xCylinders, String xOwnersName, double xMileage, int xPassengers)
 {
  super(xManuName, xCylinders, xOwnersName);
  this.setMileage(xMileage);
  this.setPassengers(xPassengers);
 }
 
 //Accessors
 
 /**
  * Pre-Condition: an instance of the gas mileage must be available
  * Post-Condition: the gas mileage is returned
  * @return mileage
  **/
 public double getMileage()
 {
  return this.mileage;
 }
 
 /**
  * Pre-Condition: an instance of the number of passengers must be available
  * Post-Conditon: the number of passengers is returned
  * @return passengers
  **/
 public int getPassengers()
 {
  return this.passengers;
 }
 
 //Mutators
 
 /**
  * Pre-Condition: a value for gas mileage must be available
  * Post-Condition: the instance of gas mileage is updated
  * @param xMileage
  **/
 public void setMileage(double xMileage)
 {
  if(xMileage > 0)
  {
   this.mileage = xMileage;
  }
 }
 
 /**
  * Pre-Conditon: the number of passengers must be available
  * Post-Condition: the instance of the number of passengers is updated
  * @param xPassengers
  **/
 public void setPassengers(int xPassengers)
 {
  if(xPassengers >= 0)
  {
   this.passengers = xPassengers;
  }
 }
 
 //Methods
 
 /**
  * Pre-Conditon:an object of class car must be available
  * Post-Condition: returns a boolean based on whether the two objects are equal or not
  * @param cr
  **/
 public boolean equals(Car cr)
 {
  if(this.mileage == cr.mileage && this.passengers == cr.passengers && super.equals(cr))
  {
   return true;
  }
  
  else
  {
   return false;
  }
 }
 
 /**
  * Pre-Condition: instances of the gas mileage and number of passengers must be available
  * Post-Condition: a statement containing the values of the gas mileage and passengers is printed
  **/
 public String toString()
 {
  return super.toString() + "\nGas Mileage: " + this.mileage + "\nNumber of Passengers: " + this.passengers;
 }
 
}


