//Joseph Masterson

public class Vehicle {
 
 //Instance Variables
 private String manuName;
 private int cylinders;
 private String ownersName;
 
 //Default Constructir
 public Vehicle()
 {
  this.manuName = "No Manufacturer Name";
  this.cylinders = 0;
  this.ownersName = "No Owner Name";
 }
 
 //Parameterized Constructor
 
 /**
  * Pre-Conditoin: the name of the manufacture, number of cylinders, and name of the owner must be available
  * Post-Condition: the instance of the manufacture name, number of cylinders, and owner name are updated
  * @param xManuName xCylinders xOwnersName
  **/
 public Vehicle(String xManuName, int xCylinders, String xOwnersName)
 {
  this.setManuName(xManuName);
  this.setCylinders(xCylinders);
  this.setOwnersName(xOwnersName);
 }
 
 //Accesors
 
 /**
  * Pre-Condition: an instance of the name of the manufacture must be available
  * Post-Condition: the instance of the manufacture name is returned
  * @param manuName
  **/
 public String getManuName()
 {
  return this.manuName;
 }
 
 /**
  * Pre-Condition: an instance of the number of cylinders must be available
  * Post-Condition: the instance of the number of cylinders is returned
  * @param cylinders
  **/
 public int getCylinders()
 {
  return this.cylinders;
 }
 
 /**
  * Pre-Condition: an instance of the owner name must be available
  * Post-Condition: the instance of owner name is returned
  * @return ownersName
  **/
 public String getOwnersName()
 {
  return this.ownersName;
 }
 
 //Mutators
 
 /**
  * Pre-Condition: the name of the manufacture must be available
  * Post-Conditon: the instance of the manufacture name is updated
  * @param xManuName
  **/
 public void setManuName(String xManuName)
 {
  this.manuName = xManuName;
 }
 
 /**
  * Pre-Condition: the number of cylinders must be available
  * Post-Condition: the instance of the number of cylinders is updated
  * @param xCylinders
  **/
 public void setCylinders(int xCylinders)
 {
  if(xCylinders > 0)
  {
   this.cylinders = xCylinders;
  }
 }

 /**
  * Pre-Conditon: the owner name must be available
  * Post-Condition: the instance of the owner name is updated
  * @param xOwnersName
  **/
 public void setOwnersName(String xOwnersName)
 {
  this.ownersName = xOwnersName;
 }
 
 /**
  * Pre-Condition: an object of class vehicle must be available
  * Post-Condition: returns a boolean value based on whether or not the objects are equal
  * @param vh
  **/
 public boolean equals(Vehicle vh)
 {
  if(vh.manuName.equalsIgnoreCase(this.manuName) && vh.cylinders == this.cylinders 
       && vh.ownersName.equalsIgnoreCase(this.ownersName))
  {
   return true;
  }
  
  else
  {
   return false;
  }
 }

 /**
  * Pre-Condition: instances of the manufacture name, number of cylinders, and owner name must be available
  * Post-Condition: a statement contaning the values of the manufacture name, number of cylinders, and owner name is printed out
  **/
 public String toString()
 {
  return "Manufacture's Name: " + this.manuName + "\nNumber of Cylinders: " + this.cylinders + "\nOwner's Name: " + this.ownersName;
 }
}

