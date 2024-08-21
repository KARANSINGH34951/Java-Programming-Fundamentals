public class Duplicateselements {
  public static void main(String[] args) {
    int num[]={23,4,5,6,43,6,23,5};

    for(int i=0;i<num.length;i++){
      for(int j=i+1;j<num.length;j++){
        if(num[i]==num[j]){
          System.out.println(num[j]);
        }
      }
    }
  }
}
