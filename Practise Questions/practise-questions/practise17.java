
public class practise17 {

  

  public static boolean duplicate(){
    int arr[]={23,45,67,12};

    for(int i=0;i<arr.length-1;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
          return true;
        }
      }   
    }
    return false;
    
  }
  public static void main(String[] args) {
    boolean ans=duplicate();
    System.out.println(ans);
  }
}
