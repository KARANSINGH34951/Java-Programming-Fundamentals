public class decitobin {
  public static void decitobinary(int n){
    int r=0,digit=1;
    int num=1;
    while(n>0){
      r=n%2;
      digit=digit+r*(int)Math.pow(10, num);
      n=n/10;
      num++;
    }
    System.out.println(digit);
  }
  public static void main(String[] args) {
    decitobinary(7);
  }
}
