package DesignPattern.AdapterPattern;

public class Main {
    // Adapter Pattern- Charge apple phone with an android charger using an AppleConnecter.
    public static void main(String[] args) {
        System.out.println("Adapter pattern works here!!");
        // AppleCharger charger =new ChargerXYZ(); //iphone charger
        AppleCharger charger =new AppleConnector(new DKCharger()); //Android charger+apple connector
        Iphone iPhone = new Iphone(charger);
        iPhone.chargeIphone();
       
    }
}