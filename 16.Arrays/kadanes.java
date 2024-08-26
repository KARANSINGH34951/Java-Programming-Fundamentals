public class kadanes {
  public static void main(String[] args) {
    int currentsum=0;
    int maxsum=Integer.MIN_VALUE;
    int arr[]={-2,-3,4,-1,-2,1,5,-3};

    for(int i=0;i<arr.length;i++){
      currentsum+=arr[i];
      if(currentsum<0){
        currentsum=0;
      }
      maxsum=Math.max(currentsum,maxsum);
    }
    System.out.println(maxsum);
  }
}
