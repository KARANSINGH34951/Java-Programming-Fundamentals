public class BinarySearch {
  public static void main(String[] args) {
    int arr[]={3,4,5,6,7,8,34,46,58,59,67,99,100};
    int low=0;
    int high=arr.length-1;
    int key=9;
    int flag=0;
   
    for(int i=0;i<arr.length;i++){
      int middle = (low+high)/2;

      if(key==arr[middle]){
        flag=1;
        break;
      }
      else if(arr[middle]>key){
        high=middle-1;
      }
      else{
        low=middle+1;
      }
    }

  if(flag==1){
    System.out.println("Yes found it");
  }
  else{
    System.out.println("Nope");
  }

  }
}
