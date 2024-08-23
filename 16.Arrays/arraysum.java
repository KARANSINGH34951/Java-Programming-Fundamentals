public class arraysum {
  public static void main(String[] args) {
    int numbers[]={1,2,3,4,5};
    int start,end;
    int currentsum=0;
    int maxsum=Integer.MIN_VALUE;
   
    for(int i=0;i<numbers.length;i++){
      start=i;
      for(int j=i;j<numbers.length;j++){
        end =j;
        currentsum=0;
        for(int k=start;k<=end;k++){
          // System.out.print(numbers[k]+" ");
          currentsum+=numbers[k];
          System.out.print(currentsum);
        }
        if(maxsum<currentsum){
          maxsum=currentsum;
        }
        System.out.println();
      }
      System.out.println();
    }

    System.out.println(maxsum);
  }
}