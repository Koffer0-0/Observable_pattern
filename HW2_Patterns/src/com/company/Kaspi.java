package com.company;

import java.util.ArrayList;
import java.util.List;

public class Kaspi implements Observable {
    private List<Observer> clients = new ArrayList<>();
    private List<String> promotions = new ArrayList<>();

    public void addPromo(String promo) {
        this.promotions.add(promo);
        notifyAllClients();
    }

    public void removePromo(String promo) {
        this.promotions.remove(promo);
        notifyAllClients();
    }

    @Override
    public void notifyAllClients() {
        this.promotions = promotions;
        for (Observer heroes : this.clients) {
            heroes.add(this.promotions);
        }
    }

    @Override
    public void addClient(Observer client) {
        this.clients.add(client);
        System.out.println("You are added!");
    }

    @Override
    public void removeClient(Observer client) {
        this.clients.remove(client);
    }


}
