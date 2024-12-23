// package assignment;

public class EmployeeManagement {
  public static void main(String[] args) {
    Employee employee1=new Employee();
    employee1.setSalary(-1);
    employee1.setSalary(10000);
    System.out.println(employee1.getSalary());
  }
}

class Employee{
  private String EmployeeName;
  private int EmployeeID;
  private int Salary;

  public String getEmployeeName() {
    return EmployeeName;
  }
  public void setEmployeeName(String employeeName) {
    EmployeeName = employeeName;
  }
  public int getEmployeeID() {
    return EmployeeID;
  }
  public void setEmployeeID(int employeeID) {
    EmployeeID = employeeID;
  }
  public int getSalary() {
    return Salary;
  }
  public void setSalary(int Salary) {
    if(Salary>0){
      this.Salary = Salary;
    }else{
      System.out.println("Enter a valid Amount");
    }
  }

  

  
}
