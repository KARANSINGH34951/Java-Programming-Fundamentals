public class duplicate {
  public static void main(String[] args) {
    int arr[]={2,2,3,4,4,5,5,5,6};
   
    int j=0;
    for(int i=1;i<arr.length;i++){
      if(arr[j]!=arr[i]){
        arr[j+1]=arr[i];
        j++;
      }
    }
    System.out.println(j+1);
  }
}
