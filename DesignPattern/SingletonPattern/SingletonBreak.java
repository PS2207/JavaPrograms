package DesignPattern.SingletonPattern;

import java.io.Serializable;

public class SingletonBreak implements Serializable, Cloneable {
   // sol(ii):- use enum to avoid reflection api
   // public enum SingletonBreak {
   // INSTANCE;

   // *****************************************************
   private static SingletonBreak singletonBreak;

   private SingletonBreak() {
      // (sol(i):- if first time object creates, this condition does not let you call constructor again
      // if(singletonBreak!=null){
      // throw new RuntimeException();
      // }
   }

   public static SingletonBreak doSingletonBreak() {
      if (singletonBreak == null) {
         synchronized (SingletonBreak.class) {
            singletonBreak = new SingletonBreak();
         }
      }
      return singletonBreak;
   }

   // sol:- implement method => for avoiding singleton break from deserialization.
   public Object readResolve() {
      return singletonBreak;
   }

   @Override
   public Object clone() throws CloneNotSupportedException {
      // return super.clone();
      return singletonBreak; //sol:- return class object => for avoiding singleton break from clone() method
   }
   // *****************************************************
}
