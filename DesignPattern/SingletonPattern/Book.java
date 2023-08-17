package DesignPattern.SingletonPattern;

import java.io.Serializable;
 
// ************Implementing (1)Lazy way to create singleton pattern code********************************

// we can break singleton pattern followed in this class in 3 ways by using-
// (1)Reflection api (2)deserializable (3)clone() method
// BUt we have some solutions to avoid these singleton break.
public class Book {
   
    // For static method -field should be static
    private static Book book;

    // constructor should be private here
    private Book() {
        //check object is null or not to avoid singleton break from refelction api
        if(book!=null){
          throw new RuntimeException("You are trying to break singleton!!");
        }
    }

    // for thread safty use (i)synchronized keyword or (ii)synchronized block(better that keyword)
    // public synchronized static Book getBook() {
    public static Book getBook() {
        if (book == null) {
            synchronized (Book.class) {
                if (book == null) {
                    book = new Book();
                }
            }
        }
        return book;
    }


 
}
