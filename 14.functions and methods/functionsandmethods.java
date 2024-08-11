public class functionsandmethods {
  public static void display1(){
    System.out.println("Hello World");
  }

  public static void display2(int a , int b){
    System.out.println("sum : "+(a+b));
  }

  public static int display3(){
    return 1;
  }

  public static int display4(int a , int b){
    return (a+b);
  }



  public static void main(String[] args) {
    System.out.println("Calling function different function types :");
    display1();
    display2(3,5);
    int result1= display3();
    int result2= display4(4,5);
    System.out.println("Result is :"+result1);
    System.out.println("Result is :"+result2);
  }
}
