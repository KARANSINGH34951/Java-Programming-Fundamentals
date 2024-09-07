
public class LargestNumber {
  public static void main(String[] args) {
    //brute force - sorting first and then find
    //optimal approach

    int arr[]={1,45,78,98,33,42,1,0};

    int largest=arr[0];

    for(int i=0;i<arr.length;i++){
      if(largest<arr[i]){
        largest=arr[i];
      }
    }
    System.out.println(largest);
  }
}
