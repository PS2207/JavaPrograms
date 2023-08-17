package DesignPattern.SingletonPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    //  In singleton pattern ->
    // (i) We don't want to call constructor of one class into another to create object using new keyword like "Book b1=new Book()",
    // (ii)we want to create object once & reuse that object again & again when needed.
   
    //  There are 2 ways to create singleton- (1)Lazy(better than Eager) (2)Eager 
    //  (1)Lazy- 
    //  (i)Create private constructor- we can not call constructor to create object of the class using new keyword.
    //  (ii)create static method- if we create non-static method, we have to call again by calling constructor which we don't want.
    //  (iii)create static field for static method- non-static field cannot be used in static method.   
    //  (iv)Make thread-safty -use (1)synchronized keyword before method (2)synchronized block(better that keyword)
    //     beacuse if multiple threads T1,T2,T3... works to create object at the same time, 
    //     all threads will get null value of class object, hence will create objects multiple times by calling constructor,
    //     that's what we don't want. so make it thread-safty
    //  (2)Eager- when class loads object will be created whether we use object or not,(so this is not good way)
   
    //  Note- In Lazy,(i) if using class => then follow these 4-steps , 
    //                (ii)if using enum in place of class => use a variable like INSTANCE,remove all these.
    
    //  There are 3 ways to break singleton -(1)Reflection api (2)Deserialization (3)clone method.
    //  but we can avoid such singleton break, after some changing in singleton code like below-
       
        System.out.println("Singleton design pattern works here...");
        Book b1 = Book.getBook();
        System.out.println(b1.hashCode());
        Book b2 = Book.getBook();
        System.out.println(b2.hashCode());
        // ************************************************************************************************************************************
        //For singleton - if using class then(i)check a condition object is not null if not null then throws exception from within constructor,
        //(ii) create object like upper.
        //For singleton - if using enum in place of class, then declare a variable like INSTANCE,
        //then create object like below not like upper
        //  Book b2 = Book.INSTANCE;
        //  System.out.println(b2.hashCode());
       
        // ##################################################################################################################
        // ********************************************************************************************
        // 1. Reflection api code to break singleton
        // these throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
        Constructor<Book> cons= Book.class.getDeclaredConstructor();
        cons.setAccessible(true);
        Book b3=cons.newInstance();
        System.out.println(b3.hashCode());
        // sol(i):-in construtor, if there is already an object =>throw RuntimeException() from inside costructor
        // sol(i):-use enum & declare a variable such as INSTANCE & remove singleton pattern code
       
        // *********************************************************************************************************************
        // 2. deserialization - if class implements Serializable interface, this code can break singleton pattern.
        // these codes throws FileNotFoundException, IOException, ClassNotFoundException,
         // ObjectOutputStream oos=new ObjectOutputStream(new
         // FileOutputStream("abc.ob"));
         // oos.writeObject(b2);
         // ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.ob"));
         // Book b3= (Book) ois.readObject();
         // System.out.println(b3.hashCode());
        // soln- In that class ,create readResolve() method whose return type should be Object & will be returning class object.
        // ***************************************************************************************************************************
    //  3. clone() method - if class implements Cloneable, & implementing clone() method & returns super.clone(), this code can break singleon.
        // these throws  CloneNotSupportedException 
        // Book b3 = (Book) b1.clone();
        // System.out.println(b3.hashCode());
        // soln- return class object
        // ****************************************************************************************************
    }
}
