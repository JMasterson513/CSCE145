//Joseph Masterson

public class Truck extends Vehicle{

 //Instance Variables
 private double loadCap;
 private double towCap;
 
 //Default Constructor
 public Truck()
 {
  super();
  this.loadCap = 0;
  this.towCap = 0;
 }
 
 //Parameterized Constructor
 
 /**
  * Pre-Condition: the manufacture name, number of cylinders, owners name, load capacity, and tow capacity must be available
  * Post-Condition: the instances of the manufacture name, number of cylinders, owners name, load capacity, and tow capacity are updated
  * @param xManuName, xCylinders, xOwnersName, xLoadCap, xTowCap
  **/
 public Truck(String xManuName, int xCylinders, String xOwnersName,double xLoadCap, double xTowCap)
 {
  super(xManuName, xCylinders, xOwnersName);
  this.setLoadCap(xLoadCap);
  this.setTowCap(xTowCap);
  
 }
 
 //Acessors
 
 /**
  * Pre-Condition: an instance of the load capacity must be available
  * Post-Condition: the value of the load capacity is returned
  * @return loadCap
  **/
 public double getLoadCap()
 {
  return this.loadCap;
 }
 
 /**
  * Pre-Condition: an instance of the tow capacity must be available
  * Post-Condition: the value of tow capacity is returned
  * @return towCap
  **/
 public double getTowCap()
 {
  return this.towCap;
 }
 
 //Mutators
 
 /**
  * Pre-Condition: the load capacity of the truck must be available
  * Post-condition: the instance of the load capacity is updated
  * @param xLoadCap
  **/
 public void setLoadCap(double xLoadCap)
 {
  if(xLoadCap > 0)
  {
   this.loadCap = xLoadCap;
  }
 }
 
 /**
  * Pre-Condition: the tow capacity of the truck must be available
  * Post-Conditon: the instance of the tow capacity is updated
  * @param xTowCap
  **/
 public void setTowCap(double xTowCap)
 {
  if(xTowCap > 0)
  {
   this.towCap = xTowCap;
  }
 }
 
 //Methods
 
 /**
  * Pre-Condition: a object of class Truck must be available
  * Post-Condition: returns a booleaqn based on whether the two objects are equal
  * @param tk
  **/
 public boolean equals(Truck tk)
 {
  
  if(this.loadCap == tk.loadCap && this.towCap == tk.towCap && super.equals(tk))
  {
   return true;
  }
  
  else
  {
   return false;
  }
  
 }
 
 /**
  * Pre-Condition: an instnace of each variable is available
  * Post-Condition: A statement containg the value of each instance varaible is printed
  **/
 public String toString()
 {
  return super.toString() + "\nLoad Capacity: " + this.loadCap + "\nTow Capacity: " + this.towCap;
 }
 
}
