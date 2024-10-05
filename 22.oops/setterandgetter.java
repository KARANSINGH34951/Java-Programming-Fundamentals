public class setterandgetter {
 public static void main(String[] args) {
  students student=new students();

  student.setname("karan singh D");
  student.setage(25);
  
 } 
}

class students{
  private String name;
  private int age;

  public void setname(String name){
    if(name != null &&  !name.isEmpty()){
      this.name=name;
    }else{
      System.out.println("Invalid name");
    }
  }

  public void setage(int age){
    this.age=age;
  } 

  public int getage(){
    return age;
  }

  public String getname(){
    return name;
  }

}