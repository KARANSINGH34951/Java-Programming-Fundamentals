public class checkthearryssorted {
  public static void main(String[] args) {
    int arr[]={1,23,45,2,767,346,875,3};
    int arr2[]={1,2,3,4,5,6,7,8,9,10};

    int flag=0;

    for(int i=0;i<arr2.length-1;i++){
      if(arr2[i]>arr2[i+1]){
        flag=1;
        break;
      }
    }
    if(flag==0){
      System.out.println("In Order");
    }
    else{
      System.out.println("Not In Order");
    }
  }
}
