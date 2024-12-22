// package assignment;

public class SchoolManagement {
  public static void main(String[] args) {
    person rahul=new person("rahul", 12, "street 1");
    rahul.displayinfo();

    student karan=new student("karan", 18, "3rd street", "12th", 98);
    karan.displayinfo();
  }
}

class person{

  private String name;
  private int age;
  private String Address;

  public void setname(String name){
    this.name=name;
  }

  public String getname(){
    return name;
  }

  person(String name,int age,String Address){
    this.name=name;
    this.age=age;
    this.Address=Address;
  }

  void displayinfo(){
    System.out.println("Name :"+name);
    System.out.println("Age :"+age);
    System.out.println("Address :"+Address);
  }
}


class student extends person{
  int Marks;
  String grade;

  student(String name,int age,String Address,String grade,int Marks){
    super(grade, Marks, grade);
    this.Marks=Marks;
    this.grade=grade;
  }

  @Override
  void displayinfo(){
    super.displayinfo();
    System.out.println("Grade of the student: "+grade);
    System.out.println("Marks of the student: "+Marks);
  }

}