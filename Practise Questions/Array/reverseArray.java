public class reverseArray {
 
  public static void main(String[] args) {
    //reverse an arry
    int arr[]={1,2,3,4,5,6,7,8,9,0};
    int temp;

    for(int i=0;i<arr.length/2;i++){
      temp=arr[i];
      arr[i]=arr[arr.length-1-i];
      arr[arr.length-1-i]=temp;
    }

    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
