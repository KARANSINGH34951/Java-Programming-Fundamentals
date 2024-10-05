interface Animal {
  void sound();
}

class Mammal {
  void hasHair() {
      System.out.println("Mammals have hair.");
  }
}

class Bird {
  void hasFeathers() {
      System.out.println("Birds have feathers.");
  }
}

class Bat extends Mammal implements Animal {
  public void sound() {
      System.out.println("Bat makes a screeching sound.");
  }
}

class Penguin extends Bird implements Animal {
  public void sound() {
      System.out.println("Penguin makes a honking sound.");
  }
}

public class HybridInheritance2 {
  public static void main(String[] args) {
      Bat bat = new Bat();
      bat.hasHair();
      bat.sound();

      Penguin penguin = new Penguin();
      penguin.hasFeathers();
      penguin.sound();
  }
}
