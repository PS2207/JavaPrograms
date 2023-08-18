package DesignPattern.AdapterPattern;

public class Iphone15Charger implements AppleCharger {

    @Override
    public void chargePhone() {
       
       System.out.println("Your Iphone is charging");
    }

}
