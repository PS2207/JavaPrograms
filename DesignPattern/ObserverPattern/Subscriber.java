package DesignPattern.ObserverPattern;

public class Subscriber implements Observer{

    String name;
   String title;
    public Subscriber(String name){
        this.name=name;
    }
    @Override
    public void getNotified(String title) {
      System.out.println("Hello "+this.name+" New video uploaded "+ title);
    }
    
}
