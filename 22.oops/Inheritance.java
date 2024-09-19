public class Inheritance {
  public static void main(String[] args) {
    sportcars obj = new sportcars();
    obj.showspeed();

    Newsportscar obj2= new Newsportscar();
    obj2.showsub2();
  }
}

class car{
  public int speed=40;

  public void showspeed(){
    System.out.println(speed);
  }
}

class sportcars extends car{
  int Sportscarspeed=300;
  public void showsub(){
    System.out.println("sub calss");
    System.out.println(speed);
  }
}

class Newsportscar extends sportcars{
  public void showsub2(){
    System.out.println("sub calss 2");
    System.out.println("class B : "+Sportscarspeed);
    System.out.println("class A : "+speed);
  }
}