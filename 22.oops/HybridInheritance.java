
interface Drivable {
  void drive();
}

class Vehicle {
  String name;

  Vehicle(String name) {
      this.name = name;
  }

  void start() {
      System.out.println(name + " is starting.");
  }

  void stop() {
      System.out.println(name + " is stopping.");
  }
}


class Car extends Vehicle implements Drivable {
  
  Car(String name) {
      super(name);
  }

  @Override
  public void drive() {
      System.out.println(name + " is driving.");
  }
}

public class HybridInheritance {
public static void main(String[] args) {
   
    Car car = new Car("Honda");

    
    car.start();      
    car.drive();      
    car.stop();       
}
}
