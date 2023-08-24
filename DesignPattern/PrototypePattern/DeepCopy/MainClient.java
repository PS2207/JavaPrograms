package DesignPattern.PrototypePattern.DeepCopy;

public class MainClient {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        NetworkConnection netCon = new NetworkConnection();
        netCon.setIp("198.43.23.1.1");
        netCon.loadImportantData();
        System.out.println();

        NetworkConnection netCon2 = (NetworkConnection) netCon.clone();
        NetworkConnection netCon3 = (NetworkConnection) netCon.clone();
       
        System.out.println(netCon);
        netCon.getDomains().remove(1);
         System.out.println(netCon);
        System.out.println(netCon2);
        System.out.println(netCon3);
        System.out.println();
    }
}
