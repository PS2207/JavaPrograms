package DesignPattern.BuilderPattern;


public class MainClient {
//Reasons for using Builder pattern-
//problem1- we have to pass many arguments to create object,
//but we cannot remember its order.
//problem2- some parameters might be optional.
//problem3- Factory class takes all responsibility for creating object.
//if the object is heavy then all complexity wiil be the part of factory class.
    public static void main(String[] args) {
        User user = User.UserBuilder.builder()
                .setEmailId("pragya@gmail.com")
                .setUserName("Pragya")
                .setUserId("101")
                .build();
        System.out.println(user);


    }
   
}
