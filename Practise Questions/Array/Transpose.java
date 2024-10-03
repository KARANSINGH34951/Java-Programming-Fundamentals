public class Transpose {
  public static void main(String[] args) {
    int arr[][] = {
      {10, 20, 30, 40},
      {15, 25, 35, 45},
      {27, 29, 37, 48},
      {32, 33, 39, 50}
    };

    transposeclass obj=new transposeclass();
    obj.transposefunc(arr);

  }
}

class transposeclass {cle
  int transpose[][]=new int[4][4];
  public void transposefunc(int arr[][]){
    
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        transpose[i][j]=arr[j][i];
      }
    }

    System.out.println("The Normal Array : ");

    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }

    System.out.println("The Transpose Array : ");

    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        System.out.print(transpose[i][j]+" ");
      }
      System.out.println();
    }

    
  }
}
