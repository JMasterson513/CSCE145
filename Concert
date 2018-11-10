public class Concert {
 
 //Instance Variables
 private String name;
 private int capacity;
 private int numberOfTicketsSoldByPhone;
 private int numberOfTicketsSoldAtTheVenue;
 private double priceByPhone;
 private double priceAtVenue;
 
 //Default Constructor
 public Concert()
 {
  name = "No Name Yet";
  capacity = 0;
  numberOfTicketsSoldByPhone = 0;
  numberOfTicketsSoldAtTheVenue = 0;
  priceByPhone = 0;
  priceAtVenue = 0;
 }
 
 //Parameterized constructor with only 4 parameters
 /**
  * Pre-Condition: values for the band name, capacity of the venue, ticket price by phone, and ticket prize at the venue must be available
  * Post-Condition: the values for the band name, capacity of the venue, ticket price by the phone, and ticket prize at the venue are updated
  * @param xName
  * @param xCapacity
  * @param xPriceByPhone
  * @param xPriceAtVenue
  */
 public Concert(String xName, int xCapacity, double xPriceByPhone, double xPriceAtVenue)
 {
  this.setName(xName);
  this.setCapacity(xCapacity);
  this.setPriceByPhone(xPriceByPhone);
  this.setPriceAtVenue(xPriceAtVenue);
 }
 
 //Parameterized constructor with all 6 parameters
 /**
  * Pre-Condition: values for the band name, capacity of the venue, number of tickets sold by phone, number of tickets sold at the venue, ticket price by phone, and ticket prize at the venue must be available
  * Post-Condition: the values for the band name, capacity of the venue, number of tickets sold by phone, number of tickets sold at the venue, ticket price by the phone, and ticket prize at the venue are updated
  * @param xName
  * @param xCapacity
  * @param xNumberOfTicketsSoldByPhone
  * @param xNumberOfTicketsSoldAtTheVenue
  * @param xPriceByPhone
  * @param xPriceAtVenue
  */
 public Concert(String xName, int xCapacity, int xNumberOfTicketsSoldByPhone, int xNumberOfTicketsSoldAtTheVenue, double xPriceByPhone, double xPriceAtVenue)
 {
  this.setName(xName);
  this.setCapacity(xCapacity);
  this.setNumberOfTicketsSoldByPhone(xNumberOfTicketsSoldByPhone);
  this.setNumberOfTicketsSoldAtVenue(xNumberOfTicketsSoldAtTheVenue);
  this.setPriceByPhone(xPriceByPhone);
  this.setPriceAtVenue(xPriceAtVenue);
 }

 //Accessors
 /**
  * Pre-Condition: an instance of the name of the band must be available
  * Post-Condition: the instance of the name of the band is returned
  * @return name
  */
 public String getName()
 {
  return this.name;
 }
 
 /**
  * Pre-Condition: an instance of the capacity of the venue must be available
  * Post-Condition: the instance of the capacity of the venue is returned
  * @return capacity
  */
 public int getCapacity()
 {
  return this.capacity;
 }
 
 /**
  * Pre-Condition: an instance of the number of tickets sold by phone must be available
  * Post-ConditionL the instance of the number of tickets sold by phone is returned
  * @return numberOfTicketsSoldByPhone
  */
 public int getNumberOfTicketsSoldByPhone()
 {
  return this.numberOfTicketsSoldByPhone;
 }
 
 /**
  * Pre-Condition: an instance of the number of tickets sold at the venue must be available
  * Post-Condition: the instance of the number of tickets sold at the venue is returned
  * @return numberOfTicketsSoldAtTheVenue
  */
 public int getNumberOfTicketsSoldAtVenue()
 {
  return this.numberOfTicketsSoldAtTheVenue;
 }
 
 /**
  * Pre-Condition: An instance of the ticket price by phone must be available
  * Post-ConditionL the instance of the ticket price by phone is returned
  * @return priceByPhone
  */
 public double getPriceByPhone()
 {
  return this.priceByPhone;
 }
 
 /**
  * Pre-Condition: an instance of the ticket price at the venue must be available
  * Post-Condition: the instance of the ticket price at the venue is returned
  * @return priceAtVenue
  */
 public double getPriceAtVenue()
 {
  return this.priceAtVenue;
 }
 
 //Mutators
 
 /**
  * Pre-Condition: the name of the band must be available
  * Post-Condition: the instance of the name of the band is updated
  * @param xName
  */
 public void setName(String xName)
 {
  this.name = xName;
 }
 
 /**
  * Pre-Conditon: the capacity of the venue must be available
  * Post-Condition: the instance of the capacity of the venue is updated
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
   this.capacity = 0;
  }
 }
 
 /**
  * Pre-Condition: the number of tickets sold by phone must be available
  * Post-Condition: the instance of the number of tickets sold by phone is updated
  * @param xNumberOfTicketsSoldByPhone
  */
 public void setNumberOfTicketsSoldByPhone(int xNumberOfTicketsSoldByPhone)
 {
  if(xNumberOfTicketsSoldByPhone >= 0 && xNumberOfTicketsSoldByPhone <= this.capacity)
  {
   this.numberOfTicketsSoldByPhone = xNumberOfTicketsSoldByPhone;
  }
  
  else
  {
   System.out.println("Cannot purchase that number of tickets");
   this.numberOfTicketsSoldByPhone = 0;
  }
 }
 
 /**
  * Pre-Condition: the number of tickets sold at the venue must be available
  * Post-Condition:the instance of the number of tickets sold at the venue is updated
  * @param xNumberOfTicketsSoldAtTheVenue
  */
 public void setNumberOfTicketsSoldAtVenue(int xNumberOfTicketsSoldAtTheVenue)
 {
  if(xNumberOfTicketsSoldAtTheVenue >= 0 && xNumberOfTicketsSoldAtTheVenue <= this.capacity)
  {
   this.numberOfTicketsSoldAtTheVenue = xNumberOfTicketsSoldAtTheVenue;
  }
  
  else
  {
   System.out.println("Cannot purchase that number of tickets");
   this.numberOfTicketsSoldAtTheVenue = 0;
  }
 }
 
 /**
  * Pre-Condition: the price of buying at ticket by the phone must be available
  * Post-Condition: the instance of the price of a ticket by phone is updated
  * @param xPriceByPhone
  */
 public void setPriceByPhone(double xPriceByPhone)
 {
  if(xPriceByPhone > 0)
  {
   this.priceByPhone = xPriceByPhone;
  }
  
  else
  {
   this.priceByPhone = 0;
  }
 }
 
 /**
  * Pre-Condition: the price of buying at ticket at the venue must be available
  * Post-Condition: the instance of the price of a ticket at the venue is returned 
  * @param xPriceAtVenue
  */
 public void setPriceAtVenue(double xPriceAtVenue)
 {
  if(xPriceAtVenue > 0)
  {
   this.priceAtVenue = xPriceAtVenue;
  }
  
  else
  {
   this.priceAtVenue = 0;
  }
 }
 
 /**
  * Pre-Condition: an instance of the number of tickets sold by phone and the number of tickets sold at the venue must be available
  * Post-Condition: returns the sum of the number of tickets sold by phone and the number of tickets sold a the venue
  * @return sum of numberOfTicketsSoldByPhone and numberOfTicjetsSoldAtTheVenue
  */
 public int TotalNumberOfTicketsSold()
 {
   return this.numberOfTicketsSoldByPhone + this.numberOfTicketsSoldAtTheVenue;
 }
 
 /**
  * Pre-Condition: an instance of the capacity of the venue and the total number of tickets sold must be available
  * Post-Condition: the difference between the capacity and the total number of tickets sold is returned
  * @return capacity - TotalNumberOfTicketsSold
  */
 public int  TicketsRemaining()
 {
  return this.capacity - TotalNumberOfTicketsSold();
 }
 
 /**
  * Pre-Condition: the number of tickets being bought at the venue must be available
  * Post-Condition: the instance number of tickets sold at the venue is updated
  * @param numberOfTicketsBeingBought
  */
 public void BuyTicketsAtVenue(int numberOfTicketsBeingBought)
 {
    if(this.numberOfTicketsSoldByPhone + this.numberOfTicketsSoldAtTheVenue + numberOfTicketsBeingBought <= this.capacity)
   {
      this.numberOfTicketsSoldAtTheVenue = this.numberOfTicketsSoldAtTheVenue + numberOfTicketsBeingBought;
   }
    
    else
    {
      System.out.println("The concert is sold out");
    }
 }
 /**
  * Pre-Condition: the number of tickets being bought by phone must be available
  * Post-Condition: the instance of the number of tickets sold by phone is updated
  * @param numberOfTicketsBeingBought
  */
 public void BuyTicketsByPhone(int numberOfTicketsBeingBought)
 {
   if(this.numberOfTicketsSoldByPhone + this.numberOfTicketsSoldAtTheVenue + numberOfTicketsBeingBought <= this.capacity)
   {
     this.numberOfTicketsSoldByPhone = this.numberOfTicketsSoldByPhone + numberOfTicketsBeingBought;
   }
   
   else
   {
     System.out.println("The concert is sold out");
   }
 }
 
 /**
  * Pre-Condition: the price of being tickets at the venue, the number of tickets sold at the venue, the price of being tickets over the phone, and the number of tickets sold over the phone must be available
  * Post-Conditon: the sum of the price of tickets at the venue times the number of tickets sold at the venue and the price of tickets over the phone times the number of tickets sold over the phone is returned
  * @return the sum of priceAtVenue times numberOfTicketsSoldAtTheVenue and priceByPhone + numberOfTicketsSoldByPhone
  */
 public double TotalSales()
 {
  return this.priceAtVenue * this.numberOfTicketsSoldAtTheVenue + this.priceByPhone * this.numberOfTicketsSoldByPhone;
 }
 
 
}
