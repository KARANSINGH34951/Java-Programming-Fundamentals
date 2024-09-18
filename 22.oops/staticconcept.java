
public class staticconcept {
  public static void main(String[] args) {
    box b1= new box();
    b1.ShowDimensions();
  }
}

class box{
  private int len,breath,height;
  {
    len=23;
    breath=34;
    height=23;
  }
  public void ShowDimensions(){
    System.out.println(len);
    System.out.println(breath); 
    System.out.println(height);
  }

}
