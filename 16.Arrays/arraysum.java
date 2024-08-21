public class arraysum {
  public static void main(String[] args) {
    int numbers[]={1,2,3,4,5};
    int start,end;

    for(int i=0;i<numbers.length;i++){
      start=i;
      for(int j=i;j<numbers.length;j++){
        end=j;
        for(int k=start;k<=end;k++){
          System.out.print(numbers[k]);
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}