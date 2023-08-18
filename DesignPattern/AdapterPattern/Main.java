package DesignPattern.AdapterPattern;

public class Main {
    // Adapter Pattern- Charge apple phone with an android charger using an AppleConnecter.
    public static void main(String[] args) {
        System.out.println("Adapter pattern works here!!");
        // AppleCharger charger =new ChargerXYZ(); //iphone charger
        AppleCharger charger =new AppleConnectorWire(new SamsungCharger()); //Android charger+apple connector
        Iphone15 iPhone = new Iphone15(charger);
        iPhone.chargeIphone();
       
    }
}