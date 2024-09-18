public class Constructor {
  public static void main(String[] args) {
    demo obj = new demo();
    demo1 obj2  = new demo1(34);
    demo2 obj3 = new demo2(23);
    demo2 obj4 = new demo2(23,34);
    demo2 obj5 = new demo2(78,99);
    
  }
}

class demo{
  demo(){
    System.out.println("Default Constructor is created !!");
  }
}
class demo1{
  demo1(int x){
    System.out.println("print x value: "+ x);
  }
}
class demo2{
  demo2(int x){
    System.out.println("print x value: "+ x);
  }
  demo2(int x,int y){
    System.out.println("print x value: "+ x);
    System.out.println("print y value: "+ y);
  }
}