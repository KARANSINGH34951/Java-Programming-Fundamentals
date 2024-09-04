/**
 * prombleonstring
 */
public class prombleonstring {
  public static void main(String[] args) {
    String str= "WNEENESENNN";
    int x=0;
    int y=0;

    for(int i=0;i<str.length();i++){
      if(str.charAt(i)=='W'){
        x--;
      }
      else if(str.charAt(i)=='E'){
        x++;
      }
      else if(str.charAt(i)=='N'){
        y++;
      }
      else{
        y--;
      }
    }
      int q1=x*x;
      int q2=y*y;

      System.out.println(Math.sqrt(q1+q2));

  }
  
}