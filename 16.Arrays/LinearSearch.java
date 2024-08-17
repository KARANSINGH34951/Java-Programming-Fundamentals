

public class LinearSearch {
  public static void main(String[] args) {
   int arr[]={23,44,2,45,87,9,5,23};
   int key=54;
   int flag =0;

   for(int i=0;i<arr.length;i++){
    if(arr[i]==key){
      flag=1;
    }
   }
   if(flag==1){
    System.out.println("Found in the array");
   }
   else{
    System.out.println("Not found in the array");
   }
  }
}
