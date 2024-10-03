public class Sumarrays {
  public static void main(String[] args) {
    int arr[][] = {
      {10, 20, 30, 40},
      {5, 5, 5, 5},
      {27, 29, 37, 48},
      {32, 33, 39, 50}
    };

    sumarrayssubset obj = new sumarrayssubset();
    obj.sumarraysarrays(arr);
    
  }
}

class sumarrayssubset{
  public void sumarraysarrays(int arr[][]){
    int sum=0;
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        if(i==1){
          sum += arr[i][j];
        }
      }
    }

    System.out.print("The Sum of the 2 rows will be  :"+ sum);
  } 
}