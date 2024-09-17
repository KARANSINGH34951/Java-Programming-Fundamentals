public class staticconcept {
  public static void main(String[] args) {
      Bankacc obj1= new Bankacc();
      obj1.setAccno(1);
      obj1.setBalance(1000);
      obj1.setCustomername("KARAN SINGH");
      obj1.setInterestrate(10);
      double res=obj1.getsimpleinterest(1);
      System.out.println("Interest on your amount : "+res);
      double total=res+obj1.balance;
      System.out.println("Total amount after interest : "+total);
      
      

  }
}

class Bankacc{
  private int accno;
  public double balance;
  private String customername;
  private static int interestrate;

  public void setAccno(int accno) {
    this.accno = accno;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setCustomername(String customername) {
    this.customername = customername;
  }

  public static void setInterestrate(int interestrate) {
    Bankacc.interestrate = interestrate;
  }

  public double getsimpleinterest(int time){
    return (balance*time*interestrate)/100;
  }

}