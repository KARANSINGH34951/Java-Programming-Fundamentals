public class Bank{
  public static void main(String[] args) {
    BankInfos rahul=new BankInfos(3494,20000,"rahul");
    BankInfos karan=new BankInfos(3494,20000,"karan");
    rahul.showaccInfo();
    rahul.withdraw(1000);
    rahul.deposit(1000);
    System.out.println(BankInfos.totalAcc);
    BankInfos.showtotalacc();
  }
}

class BankInfos{
  private int accountno;
  private double balance;
  private String name;
  static int totalAcc=0;
  BankInfos(int accountno,double balance,String name){
    this.accountno=accountno;
    this.balance=balance;
    this.name=name;
    totalAcc++;
  }

  public void showaccInfo(){
    System.out.println("Your Account Name:"+ name);
    System.out.println("Your Account number:"+ accountno);
    System.out.println("Your Account Balance:"+ balance);
  }

  public void withdraw(int withdrawAmount){
    if(withdrawAmount>balance && balance-withdrawAmount<0){
      System.out.println("insufficient Balance pls try Again");
    }else{
      balance=balance-withdrawAmount;
      System.out.println("sucessfully withdraw: "+withdrawAmount);
    }
    System.out.println("Your remaining balance : "+ balance);
  }

  public void deposit(int depositamount){
    balance+=depositamount;
    System.out.println("Deposit sucessfully");
    System.out.println("Your Total balance is: " +balance);
  }

  public static void showtotalacc(){
    System.out.println("The total accound is: "+ totalAcc);
  }
}
