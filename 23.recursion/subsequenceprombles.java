import java.util.ArrayList;

public class subsequenceprombles {
  public static void main(String[] args) {
    ArrayList<Integer> arr= new ArrayList<>();
    arr={1,2,3};

    func(0, arr);
  }

  public static void func(int idx,int []arr) {
    if(idx>=arr.length){
      for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
      }
      return ;
    }


  }
}
