//Joseph Masterson

import java.util.Scanner;

public class HealthDemo {
  
  
  public static void main(String[] args) { 
    
    //Creates an object of class Scanner to accept user input
    Scanner key = new Scanner(System.in);
    
    //Creates an empty varaible end for the do-while loop
    String end = " ";
    
    do{
      //Creates the first object of class Patient
      Patient one = new Patient();
  
   
      //Prompts user for the name of the patient
      System.out.println("Enter the name of the patient:");
      one.setPatientName(key.nextLine());
    
      //Prompts user for the name of the health insrance provider
      System.out.println("Enter the name of the health insurance provider:");
      one.setProvider(key.nextLine());
    
      //Creates a loop for the lab tests
      int test = 0;
      while(test >= 0)
      {
        System.out.println("ID \tName of Lab Test \n1 \tX-rays \n2 \tAllergy testing" 
                             + "\n3 \tCholesterol \n4 \tVitamin D \n5 \tIron Profile");
       
        System.out.println("From the list above, select one or more lab tests. Enter"
                             + " the lab test ID and enter a negative value once done:");
        test = key.nextInt();
        double before = one.getCostBefore();
       
        //Sets the cost according to the lab tests done
        switch(test){
          case 1:
            one.setCostBefore(before + 95);
            break;
          case 2:
            one.setCostBefore(before + 60);
            break;
          case 3:
            one.setCostBefore(before + 72);
            break;
          case 4:
            one.setCostBefore(before + 85);
          case 5: 
            one.setCostBefore(before + 67);
            break;
          default: 
            System.out.println("Invalid Test ID entered");  
        }
      }
    
      //Calculates the cost after taxes and the copay
      one.calculateTaxes();
      one.calculateCopayAmount();
  
      //Prints out all the values
      System.out.println("Final Bill:");
      one.print();
      
      //Done so that user input can be accepted in the lines following
      key.nextLine(); 
      
      //Asks the user whether to loop again or not
      System.out.println("Do you want to enter a patient's data? Enter \"yes\" or \"no\":");
      end = key.nextLine();
      
    }while(end.equalsIgnoreCase("yes"));
    
    //Closes the object of class Scanner
    key.close();
  }
}
