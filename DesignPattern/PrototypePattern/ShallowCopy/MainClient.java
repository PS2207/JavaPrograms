package DesignPattern.PrototypePattern.ShallowCopy;

public class MainClient {
//Prototype design pattern- 
// this concept is to copy an existing object rather than creating a new instance from scratch,
// beacuse creating a new object may be costly.
// This approach saves costly resources & time, especially when object creation is heavy process.
// There  are 2 ways of cloning - (i)Shallow copy(ii)Deep copy
// this is shallow copy
    public static void main(String[] args) {
        NetworkConnection netCon=new NetworkConnection();
        netCon.setIp("196.124.3.7");
        netCon.loadVeryImportantData();
        System.out.println("\n");
        System.out.println(netCon);

        try {
            NetworkConnection netCon2= (NetworkConnection) netCon.clone();
            System.out.println(netCon2);
            NetworkConnection netCon3= (NetworkConnection) netCon.clone();
            System.out.println(netCon3);
        } catch (CloneNotSupportedException e) {
            
            e.printStackTrace();
        }
    }
}
