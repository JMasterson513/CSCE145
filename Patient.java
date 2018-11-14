//Joseph Masterson

public class Patient {
  
  //Intsance Variables
  private String patientName;
  private String provider;
  private double costBefore;
  private double costAfter;
  private double copay;
  
  //Default Constructor
  public Patient()
  {
    this.patientName = "No Name";
    this.provider = "No Provider";
    this.costBefore = 0;
    this.costAfter = 0;
    this.copay = 0;
  }
  
  //Parametized Constructor
  public Patient(String xPatientName, String xProvider, double xCostBefore, double xCostAfter, double xCopay)
  {
    this.setPatientName(xPatientName);
    this.setProvider(xProvider);
    this.setCostBefore(xCostBefore);
    this.setCostAfter(xCostAfter);
    this.setCopay(xCopay);
  }
  
  //Copy Constructor
  public Patient(Patient pt)
  {
    this.setPatientName(pt.getPatientName());
    this.setProvider(pt.getProvider());
    this.setCostBefore(pt.getCostBefore());
    this.setCostAfter(pt.getCostAfter());
    this.setCopay(pt.getCopay());
  }
  
  //Acessors
  
  /**
   * Pre-Condition: an instance of the name of the patient exsists
   * Post-Condition: the name of the patient is returned
   * @return patientName
   **/
  public String getPatientName()
  {
    return this.patientName;
  }
  
  /**
   * Pre-Conditoin: an instance of the insurance provider exsists
   * Post-Condition: the insurance provider is returned
   * @return provider
   **/
  public String getProvider()
  {
    return this.provider;
  }
  
 /**
  * Pre-Condition: an instance of the cost before tax must exsist
  * Post-Conditon: the cost before tax is returned
  * @return costBefore
  **/
  public double getCostBefore()
  {
    return this.costBefore;
  }
  
  /**
   * Pre-Conditon: an instance of the cost after tax must exsist
   * Post-Conditon: the cost after tax is returned
   * @return costAfter
   **/
  public double getCostAfter()
  {
    return this.costAfter;
  }
  
  /**
   * Pre-Condition: an instance of the copay must exsist
   * Post-Condtion: the copay is returned
   * @return copay
   **/
  public double getCopay()
  {
    return this.copay;
  }
  
  //Mutator for Patient Name
  
  /**
   * Pre-Conditon: the name of the patient must be available
   * Post-Condition: the instance of the patient name is updated
   * @param xPatientName
   **/
  public void setPatientName(String xPatientName)
  {
    this.patientName = xPatientName;
  }
  
  //Mutator for provider
  
  /**
   * Pre-Conditon: the name of the provider must be available
   * Post-Conditon: the instance of the provider is updated
   * @param xProvider
   **/
  public void setProvider(String xProvider)
  {
    if(xProvider.equalsIgnoreCase("BCBS") || xProvider.equalsIgnoreCase("Aetna")
         || xProvider.equalsIgnoreCase("Cigna") || xProvider.equalsIgnoreCase("Humana")
         || xProvider.equalsIgnoreCase("United Health One"))
    {
      this.provider = xProvider;
    }
  }
  
  //Mutator for cost before insurance
  
  /**
   * Pre-Conditon: the cost before tax must be available
   * Post-Conditon: the instance of the cost before tax is updated
   * @param xCostBefore
   **/
  public void setCostBefore(double xCostBefore)
  {
    if(xCostBefore > 0)
    {
      this.costBefore = xCostBefore;
    }
  }
  
  //Mutator for cost after insurance
  
  /**
   * Pre-Condition: the cost after tax must be available
   * Post-Conditon: the instance of the cost after tax is updated
   * @param xCostAfter
   **/
  public void setCostAfter(double xCostAfter)
  {
    if(xCostAfter >= 0)
    {
      this.costAfter = xCostAfter;
    }
  }
  
  //Mutator for copay
  
  /**
   * Pre-Condition: the cost of the copay must be available
   * Post-Condition: the instance of the copay is updated
   * @param xCopay
   **/
  public void setCopay(double xCopay)
  {
    if(xCopay > 0)
    {
      this.copay = xCopay;
    }
  }
  
  //Print method- prints all the attributes of the patient class
  
  /**
   * Pre-Condition: values for all of the instance varaibles must be available
   * Post-Conditon: Prints the value of each instance variable
   **/
  public void print()
  {
    System.out.println("Name of the patient: " + this.patientName + "\tInsurance Provider: " 
                         + this.provider + "\tCost Before Insurance: " + this.costBefore 
                         + "\tCost After Insurance: " + this.costAfter + "\tCost of Copay: "
                         + this.copay);
  }
  
  //equals - takes object of patient class
  
  /**
   * Pre-Condition: an object of class Patient must be available
   * Post-Condition: returns a boolean based on whether the objects compared are the same
   * @param pt
   **/
  public boolean equals(Patient pt)
  {
    if(this == pt)
    {
      return true;
    }
    
    else
    {
      return false;
    }
  }
  
  //Calculate Taxes - 8% of total cost
  
  /**
   * Pre-Condition: An instance of the cost before tax must be available
   * Post-Condition: The value of the cost after tax is updated
   **/
  public void calculateTaxes()
  {
    double newTax = this.costBefore + this.costBefore * 0.08;
    this.setCostAfter(newTax);
  }
  
  //Calculates the copay
  
  /**
   * Pre-Conditon: an instance of the cost after tax must be available
   * Post-Condition: the value of the cost of the copay is updated
   **/
  public void calculateCopayAmount()
  {
    if(this.costAfter >= 0 && this.costAfter <= 99)
    {
      this.setCopay(0);
    }
    else if(this.costAfter >= 100 && this.costAfter <= 199)
    {
      this.setCopay(this.costAfter * 0.1);
    }
    else if(this.costAfter >= 200 && this.costAfter <= 399)
    {
      this.setCopay(this.costAfter * 0.2);
    }
    else if(this.costAfter >= 400 && this.costAfter <= 499)
    {
      this.setCopay(this.costAfter * 0.25);
    }
    else
    {
      this.setCopay(this.costAfter * 0.3);
    }
  }
}
