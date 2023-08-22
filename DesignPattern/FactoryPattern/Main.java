package DesignPattern.FactoryPattern;

public class Main {
    // When there is superclass & multiple sub-classes & we want to get object of subclasses based on input & requirement.
    // Factory class takes the responsibility of creating object of class based on input.
    // Advantages- Focus on creating object of interface rather than implementation. Loose coupling more robus code.
    public static void main(String[] args) {
        Employee e1= EmployeeFactory.getEmployee(" Android developer");
        // System.out.println(e1);
        System.out.println(e1.salary());

        Employee e2= EmployeeFactory.getEmployee("Web developer");
        System.out.println(e2.salary());
    }
}
