public class MoveZero {

  //move all the zero to the end of the array
  //using two pointers approach
  public static void main(String[] args) {
    int j=-1;
    int arr[]={2,0,3,4,0,3,0,0,5,9,0};

    for(int i=0;i<arr.length;i++){
      if(arr[i]==0){
        j=i;
        break;
      }
    }

    for(int i=j+1;i<arr.length;i++){
      if(arr[i]!=0){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        j++;
      }
    }

    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }


  }
}
