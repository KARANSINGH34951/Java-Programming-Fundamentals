import java.util.Scanner;

public class Strings {
  public static void main(String[] args) {
    String variable="Hello World";
    System.out.println(variable);

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = sc.nextLine();
    System.out.println("You entered: "+str);

    int flag=1;

    for(int i=0;i<str.length()/2;i++){      
        if(str.charAt(i) != str.charAt(str.length()-1-i)){
          flag=0;
          break;
        }
    }
    if(flag==1){
      System.out.println("Palindrome");
    }else{
      System.out.println("Not a Palindrome");
    }
  }
}
