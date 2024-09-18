public class Initializeblock {
 public static void main(String[] args) {
  Car obj=new Car();
  
 } 
}
//The initialize block always set to the constructor when its run by default
class Car { 
  
  int speed; 
  
  Car() 
  { 

      System.out.println("Speed of Car: " + speed); 
  } 
  
  { 
      speed = 60; 
  } 
 
}