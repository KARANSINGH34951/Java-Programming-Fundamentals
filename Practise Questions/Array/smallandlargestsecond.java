public class smallandlargestsecond {
  public static void main(String[] args) {
  
    int arr[]={12,2,25,32,18,5,32,75,82,99,85,100,1};
    int largest=arr[0];
    int slargest=-1;

    for(int i=1;i<arr.length;i++){
      if(arr[i]>largest){
        slargest=largest;
        largest=arr[i];
      }
      else if(arr[i]<largest && arr[i]>slargest){
        slargest=arr[i];
      }
    }
    System.out.println(slargest);

    int smallest=arr[0];
    int ssmallest=Integer.MAX_VALUE;

    for(int j=1;j<arr.length;j++){
      if(arr[j]<smallest){
        ssmallest=smallest;
        smallest=arr[j];
      }
      else if(arr[j]!=smallest && ssmallest<arr[j]){
        ssmallest=arr[j];
      }
    }
    System.out.println(smallest);
    System.out.println(ssmallest);

  }
}
