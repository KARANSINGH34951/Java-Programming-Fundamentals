public class insertion {
  public static void main(String[] args) {
    int arr[]={2,6,1,4,3};

    for(int i=0;i<arr.length-1;i++){
      int min=i;
      for(int j=i+1;j<arr.length;j++){
        if(arr[min]>arr[j]){
          min=j;
        }
        int tmp=arr[min];
        arr[min]=arr[i];
        arr[i]=tmp;
      }
    }

    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}
