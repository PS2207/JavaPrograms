package DesignPattern.IteratorPattern;

public class Main {
    public static void main(String[] args) {
     // Iterator design pattern provides a way to access the elements of an object without exposing its underlying implementation.
    //  we want to traverse all the users of UserManagement without knowing its implementation.
     UserManagement userManagement=new UserManagement();
     userManagement.addUser(new User("Pragya", "101"));
     userManagement.addUser(new User("Komal", "102"));
     userManagement.addUser(new User("Priya", "103"));

     MyIterator itr= userManagement.getIterator();
     while(itr.hasNext()){
        User user =(User) itr.next();
        System.out.println(user);
         System.out.println(user.getName()); 
     }


    }
}
