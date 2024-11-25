public class duplicate {
  public static void main(String[] args) {
    int arr[]={2,2,3,4,4,5,5,5,6};

    int left=0;
    int right=arr.length-1;
    int flag=0;

    while(left<=right){
      if(arr[left]==arr[right]){
        flag=1;
      }
      left++;
      right--;
    }

    System.out.println(flag);
   
   }
}
