public class Reverse {
  public static void main(String[] args) {
    int arr[]= {1,2,3,4,5,6,7};

    //Two points approach
    int first=0,last=arr.length-1,temp;

    while (first<last) {
      temp=arr[first];
      arr[first]=arr[last];
      arr[last]=temp;
      first++;
      last--;
    }

    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    // for(int i=arr.length-1;i>=0;i--){
    //   System.out.print(arr[i]+" ");
    // }  
  }
}
