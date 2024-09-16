// Main class
public class Main {
  public static void main(String[] args) {
      // Create an object of the Person class
      Person person = new Person("John", 25);
      person.displayInfo();

      // Create an object of the Car class
      Car car = new Car("Toyota", "Camry", 2022);
      car.displayCarInfo();
  }
}

// First class: Person
class Person {
  private String name;
  private int age;

  // Constructor
  public Person(String name, int age) {
      this.name = name;
      this.age = age;
  }

  // Method to display information
  public void displayInfo() {
      System.out.println("Name: " + name + ", Age: " + age);
  }
}

// Second class: Car
class Car {
  private String brand;
  private String model;
  private int year;

  // Constructor
  public Car(String brand, String model, int year) {
      this.brand = brand;
      this.model = model;
      this.year = year;
  }

  // Method to display car information
  public void displayCarInfo() {
      System.out.println("Car: " + brand + " " + model + ", Year: " + year);
  }
}
