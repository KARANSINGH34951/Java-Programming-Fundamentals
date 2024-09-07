// package practise-questions;

import java.util.Scanner;

public class practise9 {
//   VARIABLES & DATA TYPES QUESTIONS
//  Question 1 : In a program, input 3 numbers: A, B andC. Youhave to output the average of
//  these 3 numbers.
//  (Hint : Average of N numbers is sum of those numbers divided by N)

public static void main(String[] args) {
  int num1=16;
  int num2=12;
  int num3=14;

  System.out.println((num1+num2+num3)/3);

  
//  Question 2: In a program, input the side of a square. You have to output the area of the
//  square.
//  (Hint : area of a square is (side x side))

  int num4=4;
  System.out.println("square of num is : "+num4*num4);

//  Question 3: Enter cost of 3 items from the user (using float data type)- a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill.
//  (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
    Scanner s= new Scanner(System.in);
    System.out.print("PENCIL PRICE: ");
    int num5 = s.nextInt();
    System.out.print("PEN PRICE: ");
    int num6 = s.nextInt();
    System.out.print("ERASER PRICE: ");
    int num7 = s.nextInt();

    System.out.println("YOUR PENCIL : "+num5);
    System.out.println("YOUR PEN : "+num6);
    System.out.println("YOUR ERASER : "+num7);

    int total= num5+num6+num7;
    System.out.println("Total with GST : "+(total+(total*18)/100));

}










//  Question 4: What will be the type of result in the following Java code?
//  (Hint : Look at the largest data type among these)
//  Question 5: (Advanced) Will the following statement give any error in Java?
//  int $ = 24;
//  Note- These questions are only to help you practice the concepts of this chapter. These are
//  not designed to test your mathematical skills, just to understand logic building using Java.
}
