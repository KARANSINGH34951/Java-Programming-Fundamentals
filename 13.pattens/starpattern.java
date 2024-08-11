public class starpattern {
  public static void main(String[] args) {
    int n=5;
    char ch='A';

    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(ch);
        ch++;
      }
      System.out.println();
    }


    // for(int i=1;i<=n;i++){
    //   for(int j=1;j<i;j++){
    //     System.out.print(j);
    //   }
    //   System.out.println();
    // }

    // for(int i=0;i<n;i++){
    //   for(int j=i;j<n;j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    // for(int i=1;i<=n;i++){
    //   for(int j=1;j<=i;j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

  }
}
