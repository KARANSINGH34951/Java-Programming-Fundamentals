// package JavaFundamentals;

public class practise12 {
  public static void main(String[] args) {
    //     LOOPS QUESTIONS

    //  Question 1 : How many times 'Hello' is printed?
    //  public class Solution {
    //  public static void main(String[] args){
    // int i;
    //  for( i=0; i<5; i++) {
    //  System.out.println("Hello");
    //  i+=2;
    //  System.out.println(i);
    //  }
    //  }
    //  }

    //  Question2: Writeaprogramthatreadsasetof integers,andthenprintsthesumofthe
    //  even and odd integers.

   
    int evencount=0,oddcount=0;

    int num=9;
    int user=0;
    do{
      if(num%2==0){
        evencount+=1;
      }
      else{
        oddcount+=1;
      }

     
    }
    while(user==1);

    System.out.println(evencount);
    System.out.println(oddcount);

    //  Question 3 :Write a program to find the factorialof any number entered by the user.
    //  (Hint : factorialofanumbern=n*(n-1)*(n-2)*(n-3)*……*1andexistsforpositivenumbers
    //  only. We write factorial as n!
    //  So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.
    //  Note - Please do not confuse factorial with NOT EQUAL TO operator, they are not the same)

    int input=5;
    int fact=1;

    for(int i=1;i<=input;i++){
      fact*=i;
    }
    System.out.println(fact);


    //  Question4: WriteaprogramtoprintthemultiplicationtableofanumberN,enteredbythe
    //  user.



    //  Question 5 :
    //  What is wrong in the following program?
    //  public class Solution {
    //  public static void main(String args[]) {
    //  for(int i = 0; i <= 5; i++ ) {
    //  System.out.println("i = " + i );
    //  }

    //  System.out.println("i after the loop = " + i );
    //  }
    //  }
  } 
}
