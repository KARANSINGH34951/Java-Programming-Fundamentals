import java.util.Scanner;
public class arrays2d {
  public static void main(String[] args) {
    int n=3,m=3;
    int matrix[][]=new int[n][m];
     Scanner sc= new Scanner(System.in);

    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        System.out.print("Enter the value : ");
       matrix[i][j]=sc.nextInt();
      }
      System.out.println();
    }

    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }
  }
}
