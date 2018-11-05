//Joseph Masterson

public class SavingsAccount extends BankAccount {

 //Instance variable
 private boolean status;
 
 //Default Constructor
 public SavingsAccount()
 {
  super();
  this.status = false;
 }
 
 //Parameterizied Constructor
 public SavingsAccount(double xBalance, int xDeposit, int xWithdraw, double xService, boolean xStatus)
 {
  super(xBalance, xDeposit, xWithdraw, xService);
  this.setStatus(xStatus);
 }
 
 //Accessor
 
 /**
  * Pre-Condition: an instance of the status must be available
  * Post-Condition: returns the status of the savings account
  * @return status
  */
 public boolean getStatus()
 {
  return this.status;
 }
 
 //Mutator
 
 /**
  * Pre-Condition: the status of the savings account must be available
  * Post-Condition: updates the values of status
  * @param xStatus
  */
 public void setStatus(boolean xStatus)
 {
  this.status = xStatus;
 }
 
 double accountBalance = this.getAccountBalance();
 
 //Creates a method deposit
 public void deposit(double depositAmount)
 {
   if(accountBalance < 25 && accountBalance + depositAmount > 25)
   {
    this.status = true;
    super.deposit(depositAmount);
    accountBalance = accountBalance + depositAmount;
   }
   
   else if(accountBalance < 25 && accountBalance + depositAmount < 25)
   {
     this.status = false;
     super.deposit(depositAmount);
     accountBalance = accountBalance + depositAmount;
   }
   
   else
   {
     this.status = true;
     super.deposit(depositAmount);
     accountBalance = accountBalance + depositAmount;
   }
 }
 
 //Creates a method withdrawal
 public void withdrawal(double withdrawAmount)
 {
   if(status && accountBalance - withdrawAmount >= 25)
   {
     this.status = true;
     super.withdrawal(withdrawAmount);
     accountBalance -= withdrawAmount;
   }
   
   else
   {
     System.out.println("Unable to Complete Withdrawal");
   }
 }
   
int numberWithdraw = this.getNumberOfWithdrawals();
double serviceCharge = this.getServiceCharge();
 
//Creates a methd monthly charges
public void monthlyCharges()
{
  if(numberWithdraw >= 4)
  {
    serviceCharge++;
    super.monthlyCharges();
    
    if(accountBalance < 25)
    {
      this.status = false;
    }
    else
    {
      this.status = true;
    }
  }
     
  else
  {
    super.monthlyCharges();
    
    if(accountBalance -serviceCharge < 25)
    {
      this.status = false;
    }
    else
    {
      this.status = true;
    }
  }
     
 }


}
