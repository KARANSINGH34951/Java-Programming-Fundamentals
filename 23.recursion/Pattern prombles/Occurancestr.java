public class Occurancestr {

  public static void printstr(String str,int idx){
    if(idx>=str.length()) return ;

    if(str.charAt(idx)!='x'){
        System.out.print(str.charAt(idx));
    }

    printstr(str, idx+1);
  }
 public static void main(String[] args) {
  printstr("kaxexxfsxfsfxfxxf",0);
 } 
}
