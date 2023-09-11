public class SavingAccounts
{
  int balance;
  public SavingAccounts(int initialBalance) 
  {
    balance = initialBalance;
  }
  public void CheckBalance()
  {
    System.out.println("Hello");
    System.out.println("Your balance is" + balance);
  }
  public void deposit(int amountDeposit)
  {
    balance = balance + amountDeposit;
    System.out.println("You just deposit" + amountDeposit);
  }
  public void withdraw(int amountWithdraw)
  {
    balance = balance - amountWithdraw;
    System.out.println("You just withdraw" + amountWithdraw);
  }
  public String toString()
  {
    return "This is a seving account with" + balance + "saved";
  }
  public static void main(String[] args) 
  {
    SavingAccounts saving = new SavingAccounts(2000);
    saving.CheckBalance();
    saving.withdraw(300);
    saving.CheckBalance();
    saving.deposit(600);
    saving.CheckBalance();
    saving.deposit(600);
    saving.CheckBalance();
    System.out.println(saving);
  }
}
