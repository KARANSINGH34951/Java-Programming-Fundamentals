public class practise11 {
  public static void main(String[] args) {

//     CONDITIONAL STATEMENTS QUESTIONS
//  Question1: WriteaJavaprogramtogetanumberfromtheuserandprintwhether it is
//  positive or negative.

    int num=34;

    if(num<0){
      System.out.println("Negative num");
    }
    else{
      System.out.println("positive num");
    }

//  Question2: FinishthefollowingcodesothatitprintsYouhaveafeverifyourtemperature
//  is above 100 and otherwise prints You don't have a fever.
//  public class Solution {
//  public static void main(String[] args) {
//  double temp = 103.5;
//  }
//  }

int temp=45;

if(temp<100){
  System.out.println("Yout dont have fever");
}
else{
  System.out.println("you have fever");
}


//  Question3: Writea Javaprogramtoinputweeknumber(1-7)andprintdayofweekname
//  using switch case.

int day=3;
  if(day==1)
    System.out.println("Sunday");
  else if(day==2)
  System.out.println("Monday");
  else if(day==3)
  System.out.println("Tuesday");
  else if(day==4)
  System.out.println("Wednesday");
  else if(day==5)
  System.out.println("Thursday");
  else if(day==6)
  System.out.println("Friday");
  else{
    System.out.println("Saturday");
  }

//  Question 4 :What will be the value of x & y in thefollowing program:
//  public class Solution {
//  public static void main(String args[]) {
 int a = 63, b = 36;
 boolean x;
 int y;
 x = (a < b ) ? true : false;
 y = (a > b ) ? a : b;

 System.out.println(x);
 System.out.println(y);

//  }
//  }


//  Question5: WriteaJavaprogramthattakesayearfromtheuserandprintwhetherthat
//  year is a leap year or not.
int year=2400;

  if(year%400==0 || year%4==0 && year%100!=0)
    System.out.println("Leap year");
  else
    System.out.println("Not a leap year");
  }
}