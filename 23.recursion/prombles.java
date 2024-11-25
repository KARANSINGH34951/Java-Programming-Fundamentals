public class prombles {
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6};
    // func1(arr,0,arr.length-1);

    func2(arr,0);

    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }

  public static void func1(int []arr,int l,int r) {
    if(l>=r){
      return ;
    }

    int temp=arr[l];
    arr[l]=arr[r];
    arr[r]=temp;

    func1(arr, l+1, r-1);

  }

  public static void func2(int []arr,int i) {
    if(i>=(arr.length-1)/2){
      return;
    }

    int temp=arr[i];
    arr[i]=arr[arr.length-1-i];
    arr[arr.length-1-i]=temp;

    func2(arr, i+1);
  }
}
