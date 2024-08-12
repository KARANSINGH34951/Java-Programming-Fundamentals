public class isprime {
  public static void isprimenum(int n){
    int flag=0;
    for(int i=2;i<n-1;i++){
      if(n%i==0){
        flag=1;
      }
    }
    if(flag==1)
    System.out.println("Not Prime");
    else{
      System.out.println("Prime");
    }
  }
  public static void main(String[] args) {
    int n =7;
    isprimenum(n);
  }
  
}
