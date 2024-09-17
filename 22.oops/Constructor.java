public class Constructor {
  public static void main(String[] args) {
    demo obj = new demo();
    demo obj2  = new demo();
  }
}


class demo{
  demo(){
    System.out.println("Default Constructor is created !!");
  }
}