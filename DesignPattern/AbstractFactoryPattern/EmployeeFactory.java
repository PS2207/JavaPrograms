package DesignPattern.AbstractFactoryPattern;



public class EmployeeFactory {
    
    public static Employee getEmployee(EmployeeAbstractFactory factory){
       return factory.createEmployee();
    }
}
