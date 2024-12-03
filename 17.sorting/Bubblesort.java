

public class Bubblesort {
  public static void main(String[] args) {
    int arr[]={2,3,4,1,56,43,22,13};
    int tmp;

    for(int i=0;i<arr.length-1;i++){
      for(int j=0;j<arr.length-1-i;j++){
        if(arr[j]>arr[j+1]){
          tmp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=tmp;
        }
      }
    }

    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}
