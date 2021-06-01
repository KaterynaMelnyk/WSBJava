package devices;

import com.company.salleable;
import creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device implements salleable {

    final Double screenSize;
    final String operationSystem;

    static final String serverAddress = "https://google.com";
    static final String protocolName = "Some Name";
    static final String version = "2.3";

    public Phone(String producer, String model, Double screenSize, String operationSystem) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
    }

    public String toString() {
        return producer + " " + model + " " + screenSize + " " + operationSystem;
    }

    @Override
    public void turnOn() {
        System.out.println("You have turned on your phone!");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.mobilePhone != null && buyer.cash > price) {
            buyer.mobilePhone = seller.mobilePhone;
            seller.mobilePhone = null;
            buyer.cash -= price;
            seller.cash += price;
            System.out.println("Congratulations! Now your phone has another owner!");
        } else {
            System.out.println("Sorry, there is something wrong with this operation...");
        }
    }

    public void installAnApp(String appName) {
        this.installAnApp(appName);
        System.out.println("You have installed " + appName);
    }

    public void installAnApp(String appName, String version) {
        this.installAnApp(appName, version);
        System.out.println("You have installed " + appName + "Version: " + version);
    }

    public void installAnApp(String appName, String version, String serverAddress) {
        try {
            URL url = new URL("https", serverAddress, version);
            this.installAnApp(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void installAnApp(List<String> apps) {
        for (String app : apps) this.installAnApp(app);
        System.out.println("You have installed a few apps");
    }

    public void installAnApp(URL url) {
        System.out.println("Download application from " + url.getHost());
    }
}
