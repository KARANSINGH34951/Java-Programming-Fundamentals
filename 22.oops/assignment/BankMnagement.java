// package assignment;

public class BankMnagement {
  public static void main(String[] args) {
    Account account1=new SavingAccount(3495, "karan", 20000);
    account1.CalculateInterest();
    account1.Balance();

    Account account2=new CurrentAccount(3496, "Arjun", 30000);
    account2.CalculateInterest();
    account2.Balance();
  }
}

abstract class Account{
  private int AccountNo;
  private String Name;
  private int Balance;

  public Account(int AccountNo,String Name,int Balance){
    this.AccountNo=AccountNo;
    this.Balance=Balance;
    this.Name=Name;
  }

  abstract void CalculateInterest();

  public void deposit(int depositAmount){
    if(depositAmount<Balance){
      Balance+=depositAmount;
    }else{
      System.out.println("something went wrong");
    }
  }

  public void widthdraw(int widthdrawAmount){
    if(widthdrawAmount<=Balance){
      Balance-=widthdrawAmount;
    }else{
      System.out.println("widthdraw is not sufficient");
    }
  }

  public void Balance(){
    System.out.println("Your balance is :"+ Balance);
  }
}

class SavingAccount extends Account{
  private static int INTRESTRATE=5;

  public SavingAccount(int AccountNo,String Name,int Balance){
    super(AccountNo, Name, Balance);
  }

  @Override
  public void CalculateInterest(){
    System.out.println("saving account interest rate:"+INTRESTRATE);
  }

}

class CurrentAccount extends Account{
  private static int INTRESTRATE=7;

  public CurrentAccount(int AccountNo,String Name,int Balance){
    super(AccountNo, Name, Balance);
  }

  @Override
  public void CalculateInterest(){
    System.out.println("Current account interest rate:"+INTRESTRATE);
  }

}