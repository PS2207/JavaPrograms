package FileHandling;

import java.io.Serializable;

public class Employee implements Serializable {

    int empId;
    String empName;
    int salary;

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
    }

    public Employee(int empId, String empName, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

}
