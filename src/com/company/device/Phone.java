package com.company.device;

import com.company.Application;
import com.company.Human;
import org.w3c.dom.ls.LSOutput;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Phone extends Device {
    final String operationSystem;
    private Double screenSize;
    static final String serverAdress = "adresServera.pl";
    static final String protocol = "https";
    static final Double version = 1.0;
    public List<Application> apps = new ArrayList<>();

    public Phone(String producer, String model, String operationSystem, Double screenSize, Integer productionYear) {
        super(producer, model, productionYear);
        this.operationSystem = operationSystem;
        this.screenSize = screenSize;
    }

    String getOSVersion() {
        return "4.23.1";
    }

    public Double getScreenSize() {
        return this.screenSize;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return this.producer + " " + this.model + " " + this.operationSystem + " " + this.screenSize;
    }

    @Override
    public void turnOn() {
        System.out.println("Uruchamianie systemu");
        System.out.println("Szukanie aktualizacji");
        System.out.println("Wszystko aktualne");
        System.out.println("Witaj");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.mobilePhone == null) {
            System.out.println("Brak telefonu");
        } else {
            System.out.println("Sprzedający posiada telefon.");
        }
        if (seller.getCash() < price) {
            System.out.println("Nie stać Cię na srajfona");
        } else {
            System.out.println("Gratuluję teraz możesz się lansować nowym srajfonem.");
            seller.setCash(seller.getCash() - price);
            buyer.setCash(buyer.getCash() + price);
        }
    }

    public void installAnApp(String appName) {

    }

    public void installAnApp(String appName, Double version) {

    }

    public void installAnApp(String appName, Double version, String serverAdress) {

    }

    public void installAnApp(List<String> appsName) {

    }

    public void installAnApp(URL url) {

    }

    public void appInstall(Human owner, Application application) {
        if (owner.getCash() >= application.price) {
            apps.add(application);
            System.out.println("Aplikacja " + application.name + " została zainstalowana.");
            owner.setCash(owner.getCash() - application.price);
            return;
        }
        System.out.println("Masz za mało pieniędzy na zakup aplikacji.");
    }

    public void isApplicationInstalled(Application application) {
        System.out.println(apps.contains(application) ? "Aplikacja  " + application.name + " jest już zainstalowana." : "Nie znaleziono aplikacji: " + application.name);
    }

    public void isApplicationInstalledByName(String name) {
        for (Application app : apps) {
            if (app.name.equals(name)) {
                System.out.println("Aplikacja  " +name + " jest zainstalowana");
                return;
            }
        }
        System.out.println("Nie znaleziono aplikacji: " + name);
    }

    public void allFreeAplications() {
        for (Application app : apps) {
            if (app.price == 0.0) {
                System.out.println(app.name + " Za darmo!");
            }
        }
    }

    public Double allInstalledAplicationsValue() {
        Double sum = 0.0;
        for (Application app : apps) {
            sum += app.price;
        }
        System.out.println("Wartość wszystkich zainstalowanych aplikacji: " + sum);
        return sum;
    }

    public void nameSort() {
        apps.sort((s1, s2) -> s1.name.compareTo(s2.name));
        apps.forEach(p -> System.out.println(p.name));
    }

    public void priceSort() {
        apps.sort((s1, s2) -> s1.price.compareTo(s2.price));
        apps.forEach(p -> System.out.println(p.name + "cena: " + p.price));
    }

}


