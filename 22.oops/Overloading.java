public class Overloading {
  public static void main(String[] args) {
    Calculator obj=new Calculator();
    double res=obj.add(2.3,4.5);
    int res1=obj.add(2,4);
    int res2=obj.add(2,4,1);
    System.out.println(res);
    System.out.println(res1);
    System.out.println(res2);
    
  }
}

class Calculator{ 
  int x =10;

   int add(int x, int y){
    return x+y;
  }
  int add(int x, int y,int z){
    return x+y+z;
  }
  double add(double x, double y){
    return x+y;
  }
}
