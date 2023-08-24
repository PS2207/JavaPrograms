package DesignPattern.PrototypePattern.DeepCopy;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {
    private String ip;
    private String importantData;
    List<String> domains = new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    @Override
    public String toString() {
        return "NetworkConnection [ip=" + ip + ", importantData=" + importantData + ", domains=" + domains + "]";
    }

    public void loadImportantData() throws InterruptedException {
        this.importantData = "very very important data";
        domains.add("www.google.com");
        domains.add("www.youtube.com");
        domains.add("www.facebook.com");
        domains.add("www.instagram.com");
        Thread.sleep(5000);

    }

    public Object clone() throws CloneNotSupportedException {

        // return super.clone();
        // custom logic for cloning
        NetworkConnection netCon = new NetworkConnection();
        netCon.setIp(this.getIp());
        netCon.setImportantData(this.getImportantData());
        for (String d : this.getDomains()) {
            netCon.getDomains().add(d);
        }
        return netCon;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }
}
