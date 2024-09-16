public class classandobject {

  static class Box{
    int l;
    int b;
    int h;

    public int area(int x,int y,int z){
      l=x;
      b=y;
      h=z;
      return l*b*h;
    }
  }  
  public static void main(String[] args) {
    Box obj=new Box();
    int res=obj.area(1, 2, 3);
    System.out.println(res);
  }
}
