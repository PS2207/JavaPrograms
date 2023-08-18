package DesignPattern.AdapterPattern;

public class AppleConnector implements AppleCharger{

   private AndroidCharger charger;
   
    public AppleConnector(AndroidCharger charger) {
    this.charger = charger;
}

    @Override
    public void chargePhone() {
      charger.chargeAndroidPhone();
      System.out.println("You Iphone is charging with Apple connector");
    }
    
}
