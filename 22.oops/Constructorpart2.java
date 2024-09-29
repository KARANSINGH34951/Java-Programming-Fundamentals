public class Constructorpart2 {

  public static void bubble(int arr[]){
    for(int i=0;i<arr.length-1;i++){
      for(int j=0;j<arr.length-1-i;j++){
        if(arr[j]>arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }

    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }

  public static void selectionsort(int arr[]){

    for(int i=0;i<arr.length-1;i++){
      int smallpos=i;
      for(int j=i+1;j<arr.length;j++){
        if(arr[smallpos]>arr[j]){
          smallpos=j;
        }
      }
      int temp=arr[i];
      arr[i]=arr[smallpos];
      arr[smallpos]=temp;  
    }
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void main(String[] args) {
    int arr[]={10,4,2,3,1,5,0};
   
    selectionsort(arr);

  }
} 

