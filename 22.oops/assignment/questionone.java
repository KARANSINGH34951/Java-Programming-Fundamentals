

public class questionone {
  public static void main(String[] args) {
    Complex obj = new Complex();
    obj.setcomplex(23, 445);
    obj.displaycomplex();

    Time obj2= new Time();
    obj2.settime(10, 34, 55);
    obj2.displaytime();
  }
}

class Time{
  private int hr,min,sec;

  public void settime(int h,int m,int s){
    hr=h;
    min=m;
    sec=s;
  }

  public void displaytime(){
    System.out.print(hr+":"+min+":"+sec);
    
  }

}

class Complex{
  private int real ,img;

  public void setcomplex(int r,int i){
    real=r;
    img=i;
  }

  public void displaycomplex(){
    System.out.println(real);
    System.out.println(img);
  }
}