public class squarepattern {

  // public static void squarepatterns(int n,int totalstars){
  //   if(n<=0) return;

  //   for(int i=0;i<totalstars;i++){
  //     System.out.print("*");
  //   }
  //   System.out.println();
  //   squarepatterns(n-1,totalstars);
  // }


  //Approach 2 with fully recusion
  public static void squarepatterns(int row,int col,int n){
    if(row>n) return;

    if(col>n){
      System.out.println();
      squarepatterns(row+1, 1, n);
      return;
    }

    System.out.print("*");
    squarepatterns(row, col+1, n);
  }
  public static void main(String[] args) {
    squarepatterns(1,1,5);
  }
}
