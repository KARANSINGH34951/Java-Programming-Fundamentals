public class pairs {
  public static void main(String[] args) {
    int arr[]={2,3,4,5,6,7};
    
    int count;
     for(int i=0;i<arr.length;i++){
      count =i;
      for(int j=i+1;j<arr.length;j++){
        System.out.print("("+arr[count]+","+arr[j]+ ") ");
      }
      System.out.println();
    }

    //  int count;
    //  for(int i=0;i<arr.length;i++){
    //   count =arr[i];
    //   for(int j=i+1;j<arr.length;j++){
    //     System.out.print("("+count+","+arr[j]+ ") ");
       
    //   }
    //  }
  }
}
