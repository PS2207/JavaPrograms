package DesignPattern.FactoryPattern;

// Factory class takes the responsibility of creating object of class based on input.
public class EmployeeFactory {
    public static Employee getEmployee(String empType){
       if(empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")){ //trim() ignores spaces
        return new AndroidDeveloper();
       }
       else if(empType.trim().equalsIgnoreCase("WEB DEVELOPER")){
        return new WebDeveloper();
       }
       else{
        return null;
       }
    }
}
