public class sortingquestions {
  public static void main(String[] args) {
    // int arr[]={1,-2,6,-1,3};

    // int sum=Integer.MIN_VALUE;
    // int cursum=0;

    // for(int i=0;i<arr.length;i++){
    //   cursum=0;
    //   for(int j=i;j<arr.length;j++){
    //     cursum+=arr[j];
    //   }
    //   if(cursum>sum){
    //     sum=cursum;   
    //   }
    // }
    // System.out.println(sum);

    int arr[]={1,-2,6,-1,3};

    int maxsum=Integer.MIN_VALUE;
    int currsum=0;

    for(int i=0;i<arr.length;i++){
      currsum+=arr[i];

      if(currsum<0){
        currsum=0;
      }

      maxsum=Math.max(maxsum, currsum);
    } 
    System.out.println(maxsum);
  }
}
