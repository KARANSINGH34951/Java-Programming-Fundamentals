public class compare {
  public static void main(String[] args) {
    //compare string
    String str[] ={"KARAN","ASHISH","RAJ","XRT"};

    String largest=str[0];

    for(int i=1;i<str.length;i++){
      if(largest.compareTo(str[i])<0){
        largest=str[i];
      }
    }
    System.out.println(largest);

  }
}
