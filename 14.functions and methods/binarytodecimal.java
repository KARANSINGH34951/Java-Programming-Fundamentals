public class binarytodecimal {

  public static void bintodeci(int n) {
    int pow=0;
    int rem=0;
    int deci=0; 
    while (n>0) {
      rem=n%10;
      deci=deci+(rem* (int) Math.pow(2, pow));
      pow++;
      n=n/10;
    }
    System.out.println(deci);
  }

  public static void main(String[] args) {
    int n=101;
    bintodeci(n);
  }
}
