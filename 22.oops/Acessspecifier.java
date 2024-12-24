public class Acessspecifier {
  public static void main(String[] args) {
    A obj=new A(34,"KARAN",12,20000);
  }
}

class A{
  private int Id;
//only acess with in class and through encapsulation it can able to acess with methods

  public String name;
//Can able to acess anywhere  


  protected int age;
//can able to acess outside of the packages but only for subclass of superclass

  double Salary;
//Deafult can able to acess anywhere within the package

  A(int Id,String name,int age,double Salary){
    this.Id=Id;
    this.name=name;
    this.age=age;
    this.Salary=Salary;
  }

}
