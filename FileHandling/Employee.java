package FileHandling;

public class Employee {
  
private int empId;
   private String empName;
   private int salary;
@Override
public String toString() {
    return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
}
public int getEmpId() {
    return empId;
}
public String getEmpName() {
    return empName;
}
public int getSalary() {
    return salary;
}
public Employee(int empId, String empName, int salary) {
    this.empId = empId;
    this.empName = empName;
    this.salary = salary;
}

   
}
