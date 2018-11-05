//Joseph Masterson

public class BankAccount {

 //Instance Varaibles
 private double accountBalance;
 private int numberOfDeposits;
 private int numberOfWithdrawals;
 private double serviceCharge;
 
 //Default constructor
 public BankAccount()
 {
  this.accountBalance = 0;
  this.numberOfDeposits = 0;
  this.numberOfWithdrawals = 0;
  this.serviceCharge = 0;
 }
 
 //Parameterizied Constrcutor
 /** 
  * Pre-Condition: the account balance, number of deposits, number of withdrawals, and the monthly service charge of an object must be available
  * Post-Condition: The values of account balance, number of deposits, number of withdrawals, and the monthly service charge are updated
  * @param xBalance
  * @param xDeposit
  * @param xWithdraw
  * @param xService
  */
 public BankAccount(double xBalance, int xDeposit, int xWithdraw, double xService)
 {
  this.setAccountBalance(xBalance);
  this.setNumberOfDeposists(xDeposit);
  this.setNumberOfWithdrawals(xWithdraw);
  this.setServiceCharge(xService);
 }
 
 //Accessors
 
 /**
  * Pre-Condition: an instance of the account balance must be available
  * Post-Condition: the instance of the account balance is returned
  * @return accountBalance
  */
 public double getAccountBalance()
 {
  return this.accountBalance;
 }
 
 /**
  * Pre-Condition: an instance of the number of deposits must be available
  * Post-Condition: the instance of the number of deposits is returned
  * @return numberOfDeposits
  */
 public int getNumberOfDeposists()
 {
  return this.numberOfDeposits;
 }

 /**
  * Pre-Condition: an instance of the number of withdrawals must be available
  * Post-Condition: the instance of the number of withdrawals is returned
  * @return numberOfWithdrawals
  */
 public int getNumberOfWithdrawals()
 {
  return this.numberOfWithdrawals;
 }
 
 /**
  * Pre-Condition: an instance of the monthly service charge must be available
  * Post-Condition: the instance of the monthly service charge is returned
  * @return serviceCharge
  */
 public double getServiceCharge()
 {
  return this.serviceCharge;
 }
 
 //Mutators
 
 /**
  * Pre-Condition: the balance of the account must be available
  * Post-Condition: the instance of the account balance is updated 
  * @param xBalance
  */
 public void setAccountBalance(double xBalance)
 {
  if(xBalance >= 0)
  {
   this.accountBalance = xBalance;
  }
  
  else
  {
   System.out.println("Invalid Account Balance");
   this.accountBalance = 0;
  }
 }
 
 /**
  * Pre-Condition: the number of deposits to the account must be available
  * Post-Condition: the instance of the number of deposits is updated
  * @param xDeposit
  */
 public void setNumberOfDeposists(int xDeposit)
 {
  if(xDeposit >= 0)
  {
   this.numberOfDeposits = xDeposit;
  }
  
  else
  {
   System.out.println("Invalid Number Of Deposits");
   this.numberOfDeposits = 0;
  }
 }
 
 /**
  * Pre-Condition: the number of withdrawals to the account must be available
  * Post-Condition: the instance of the number of withdrawals is updated
  * @param xWithdraw
  */
 public void setNumberOfWithdrawals(int xWithdraw)
 {
  if(xWithdraw >= 0)
  {
   this.numberOfWithdrawals = xWithdraw;
  }
  
  else
  {
   System.out.println("Invalid Number of Withdrawals");
   this.numberOfWithdrawals = 0;
  }
 }
 
 /**
  * Pre-Condition: the monthly service charge must be available
  * Post-ConditionL the instance of the monthly serivce charge is updated
  * @param xService
  */
 public void setServiceCharge(double xService)
 {
  if(xService >= 0)
  {
   this.serviceCharge = xService;
  }
  
  else
  {
   System.out.println("Invalid Monthly Serive Charge");
   this.serviceCharge = 0;
  }
 }
 
 /**
  * Pre-Condition: the amount of the deposit and the account balance must be available
  * Post-Condition: the account balance and number of deposits are updated
  * @param depositAmount
  */
 public void deposit(double depositAmount)
 {
  if(depositAmount > 0)
  {
   this.accountBalance = accountBalance + depositAmount;
  
   this.numberOfDeposits++;
  }
  
  else
  {
   System.out.println("Invalid Deposit Amount");
  }
 }
 
 /**
  * Pre-Condition: the amount of the withdrawal and the account balance must be available
  * Post-Conditon: the balance of the account and number of withdrawals are updated
  * @param withdrawAmount
  */
 public void withdrawal(double withdrawAmount)
 {
  if(withdrawAmount > 0 && withdrawAmount < this.accountBalance)
  {
   this.accountBalance = accountBalance - withdrawAmount;
   
   this.numberOfWithdrawals++;
  }
  
  else
  {
   System.out.println("Invalid Withdrawal Amount");
  }
 }

 /**
  * Pre-Conditon: the account balance and monthly service charge must be available
  * Post-Condition: updates the account balance, resets the monthly service charge, number of deposts, and number of withdrawals
  */
 public void monthlyCharges()
 {
  this.accountBalance = accountBalance - this.serviceCharge;
  this.serviceCharge = 0;
  this.numberOfDeposits = 0;
  this.numberOfWithdrawals = 0;
 }
 
}
