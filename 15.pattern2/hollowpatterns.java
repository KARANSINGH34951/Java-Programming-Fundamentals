public class hollowpatterns {
  public static void main(String[] args) {
    int n=5;

    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        if(i==1||i==5 || j==1 || j==5){
          System.out.print("* ");
        }
        else{
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  
    for(int i=0;i<n;i++){
      for(int j=0;j<n-i;j++){
        System.out.print(" ");
      }
      for(int k=0;k<=i;k++){
        System.out.print("*");
      }
      System.out.println();
    }

    for(int i=0;i<=n;i++){
     for(int j=1;j<=n-i;j++){
      System.out.print(j+" "); 
     }
     System.out.println();

    }
    
    int sum=0;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        sum+=1;
        System.out.print(sum+" ");
      }
      System.out.println();
    }
  
    for(int i=0;i<n;i++){
      for(int j=0;j<=i;j++){
        if((j+i)%2==0){
          System.out.print(1);
        }
        else{
          System.out.print(0);
        }
      }
      System.out.println();
    }
  
  }
}
