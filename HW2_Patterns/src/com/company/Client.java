package com.company;

import java.util.List;

public class Client implements Observer{
    private String name;
    public Client(String name) {
        this.name = name;
    }

    @Override
    public void add(List<String> promo) {
        if (promo.isEmpty()) {
            System.out.println("Извините " + this.name + " , " + "на данный момент нет никакиз акций\n");
        } else {
            System.out.println("Здраствуйте " + this.name + " , " + "У нас действует акция " + promo + "\n");
        }

    }
}
