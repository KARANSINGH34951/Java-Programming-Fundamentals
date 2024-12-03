public class Replaceascii {
  public static void main(String[] args) {

    String str=new String("helHWa");
    String res=replacestr(str);
    System.out.println(res); 
  }

  public static String replacestr(String strs) {
      StringBuilder strbr=new StringBuilder(strs);

      for(int i=0;i<strbr.length();i++){

        char ch=strbr.charAt(i);
        if(i%2==0){
          ch=(char) (ch+1);
          strbr.setCharAt(i, ch);
        }
        else{
          ch=(char)(ch-1);
          strbr.setCharAt(i, ch);
        }
      }

      return strbr.toString();
  }
}
