// package JavaFundamentals.Day12;
import java.util.Scanner;
public class loops {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int n= s.nextInt();
    int total=0;

    // for(int i=1;i<=n;i++){
    //   total+=i;
    // }
    // System.out.println("total sum of :"+total);


    // for(int i=0;i<n;i++){
    //   for(int j =0;j<n;j++){
    //     System.out.print("*");
    //   }
    //   System.out.println("");
    // }

   //reverse a number;
    int ls;
   int r=0;
   for(int i=0;n>0;i++){
    r=n%10;
    System.out.print(r);
    n=n/10;
   }

   //reverse the given number
  

  }
}
