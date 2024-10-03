public class Sortedarra {
  public static void main(String[] args) {
    int arr[][] = {
      {10, 20, 30, 40},
      {15, 25, 35, 45},
      {27, 29, 37, 48},
      {32, 33, 39, 50}
    };
    int key = 33;

    if (staircaseSearch(arr, key)) {
      System.out.println("Yup, Found It!");
    } else {
      System.out.println("Nope, Not Found.");
    }
  }

 
  public static boolean staircaseSearch(int matrix[][], int key) {
    int row = 0, col = matrix[0].length - 1;

    while (row < matrix.length && col >= 0) {
      if (matrix[row][col] == key) {
        return true;
      } else if (matrix[row][col] < key) {
        row++;
      } else {
        col--;
      }
    }
    return false;  
  }
}
