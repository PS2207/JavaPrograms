package DesignPattern.AdapterPattern;

// Android charger implementation class
public class SamsungCharger implements AndroidCharger{

    @Override
    public void chargeAndroidPhone() {
      System.out.println("Your android is charging");
    }
    
}
