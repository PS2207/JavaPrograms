package DesignPattern.AdapterPattern;

public class Iphone15 {
    private AppleCharger appleCharger;

    public Iphone15(AppleCharger appleCharger) {
        this.appleCharger = appleCharger;
    }

    public void chargeIphone() {
        appleCharger.chargePhone();
    }
}
