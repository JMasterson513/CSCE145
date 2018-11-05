//Joseph Masterson

public class BankTester {

 public static void main(String[] args) {
  
   //Creates an object of class BankAccount
  BankAccount bank = new BankAccount(45, 0, 0, 0);
  
  //Deposits 100 dollars into the bank object
  bank.deposit(100);
  System.out.println("Bank Account Balance after Deposit: $" + bank.getAccountBalance());
  
  //performs two withdrawals from the bank object
  for(int i = 0; i < 2; i++)
  {
    int j = i + 1;
    bank.withdrawal(15);
    System.out.println("Bank Account Balance after " + j + " withdrawals: $" + bank.getAccountBalance());
  }
 
 System.out.println();
  
  //Creates an object of class SavingsAccount
 SavingsAccount saving = new SavingsAccount(100, 0, 0, 10, true);
  
 //Performs a withdrawal from the savings account five times
 int i = 0;
 while(i < 5)
 {
   int j = i + 1;
  saving.withdrawal(30);
  System.out.println("Savings Account Balance after " + j + " withdrawals: $" + saving.getAccountBalance());
  i++;
 }
  
 //Deposits 50 dollars into the savings account
 saving.deposit(50);
 System.out.println("\nSavings Account Balance after Deposit: $" + saving.getAccountBalance());
 
 //Subtracts the monthly charges from the bank account
 saving.monthlyCharges();
 System.out.println("\nSavings Account Balance after Monthly Charge: $" + saving.getAccountBalance());
 System.out.println("New Savings Account Monthly Charge Cost: $" + saving.getServiceCharge());
 
 
 }

}
