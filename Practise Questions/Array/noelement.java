public class noelement {
  public static void main(String[] args) {
    int arr[][]={
      {4, 7, 8},
      {8, 8, 7}
    };
    int key = 7;
    actualarray obj= new actualarray();
    obj.arrays(arr,key);
  }
}

class actualarray{
  public void arrays(int arr[][],int key){
    int count=0;
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        if(arr[i][j]==key){
          count++;
        }
      }
    }
    System.out.print("The "+key+" is occurs "+count);
  }
}
