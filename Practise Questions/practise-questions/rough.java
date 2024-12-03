import java.io.*;
import java.net.*;

public class rough {
  public static void main(String[] args) throws IOException{
   System.out.println(powers(2,4));
  }

  public static int powers(int a,int b){
    if(b==0){
      return 1;
    }

    return a*powers(a,b-1);
  }
}
