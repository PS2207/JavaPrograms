package DesignPattern.AdapterPattern;

public class AppleConnectorWire implements AppleCharger{

   private AndroidCharger charger;
   
    public AppleConnectorWire(AndroidCharger charger) {
    this.charger = charger;
}

    @Override
    public void chargePhone() {
      charger.chargeAndroidPhone();
      System.out.println("You Iphone is charging with Apple connector");
    }
    
}
