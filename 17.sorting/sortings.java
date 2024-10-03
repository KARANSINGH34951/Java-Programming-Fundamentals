public class sortings {
  public static void main(String[] args) {
    int arrays[]={3,6,2,1,8,7,4,5,3,1};
    // Bubble ob =new Bubble();
    // ob.sorting(arrays);

    selection ob1=new selection();
    ob1.selectionsorting(arrays);

  }
}

class Bubble {
   void sorting(int arr[]){

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
}

class selection {
  void selectionsorting(int arr[]){

    for(int i=0;i<arr.length-2;i++){
      int minpos=i;
      for(int j=i+1;j<arr.length;j++){
          if(arr[minpos]>arr[j]){
            minpos=j;
          }
      }
      int temp=arr[minpos];
      arr[minpos]=arr[i];
      arr[i]=temp;
    }

    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
