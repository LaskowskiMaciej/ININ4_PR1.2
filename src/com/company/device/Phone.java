package com.company.device;

import com.company.Human;

import java.net.URL;
import java.util.List;

public class Phone extends Device {
    final String operationSystem;
    private Double screenSize;
    static final String serverAdress =  "adresServera.pl";
    static final String protocol = "https";
    static final Double version = 1.0;

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
        if (seller.getCar() == null) {
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
    public void installAnApp(String appName){

    }
    public void installAnApp(String appName, Double version){

    }
    public void installAnApp(String appName, Double version, String serverAdress){

    }
    public void installAnApp(List<String> appsName){

    }
    public void installAnApp(URL url){

    }
}
