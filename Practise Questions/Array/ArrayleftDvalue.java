public class ArrayleftDvalue {
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9};
    int d=3%arr.length;
    int temp[]=new int[d];
 
    for(int i=0;i<d;i++){
      temp[i]=arr[i];
    }

    for(int j=d;j<arr.length;j++){
      arr[j-d]=arr[j];
    }

    // int z=0;
    for(int k=arr.length-d;k<arr.length;k++){
      arr[k]=temp[k-(arr.length-d)];
      // z++;
      
    }

    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    // }

    //optimal solution

    

  }
}
