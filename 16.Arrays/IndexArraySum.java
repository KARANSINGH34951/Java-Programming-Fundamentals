public class IndexArraySum {
  public static void main(String[] args) {
    int arr[]={1,2,3,4};
    int start,end;
    int currentsum=0;
    int maxsum=0;
    
    int arrfix[]=new int[arr.length];
    arrfix[0]=arr[0];
    for(int i=1;i<arr.length;i++){
      arrfix[i]=arr[i-1]-arr[i];
    }

    for(int i=0;i<arr.length;i++){
      start=i;
      for(int j=0;j<arr.length;j++){
        end=j;

        currentsum=arrfix[end]-arrfix[start-1];

      }
    }
  }
}
