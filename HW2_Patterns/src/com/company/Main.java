package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kaspi kaspi = new Kaspi();

        String title = "Kaspi kz";

        while (true) { //бесконечный луп
            System.out.println("Welcome to the Kaspi kz!");
            int choose = mainMenu(input);
            switch (choose) { //меню типа входа админ или обычный юзер
                case 1: //если выберет как админа то он может добавлять новые "акций"
                    int adminChoise = admin(input);
                    switch (adminChoise) {
                        case 1: //тут уже он добавляет
                            String text = "Add a new promo below:";
                            String newPromo = JOptionPane.showInputDialog(null, text, title, JOptionPane.PLAIN_MESSAGE);
                            kaspi.addPromo(newPromo);
                            break;
                        case 2: //тут удаляет
                            String text2 = "Remove a existing promo";
                            String removePromo = JOptionPane.showInputDialog(null, text2, title, JOptionPane.PLAIN_MESSAGE);
                            kaspi.removePromo(removePromo);
                            break;
                    }
                    break;
                case 2: //если выберет два то он зайдет обычный юзер
                    String text = "Welcome to the Kaspi kz, write your name below:";
                    String message = JOptionPane.showInputDialog(null, text, title, JOptionPane.PLAIN_MESSAGE);
                    Client client = new Client(message);
                    int choise1 = sub(input);
                    switch (choise1) {
                        case 1: // здесь он подписывается на промоакций
                            kaspi.addClient(client);
                            break;
                        case 2: //просто игнорит и выходит назад в меню
                            break;
                    }

                    int choise2 = unsub(input);
                    switch (choise2) {
                        case 1: // здесь он подписывается на промоакций
                            kaspi.removeClient(client);
                            break;
                        case 2: //просто игнорит и выходит назад в меню
                            break;
                    }
                    break;
            } //конец главного свитч
        } //конец лупа
    }

    public static int mainMenu(Scanner input) {
        int option;
        System.out.println("Sign as Admin");
        System.out.println("New user");

        option = input.nextInt();
        return option;
    }

    public static int sub(Scanner input) {
        int option;
        System.out.println("Do you wanna subscribe to promotions?");
        System.out.println("1. Yes, of course");
        System.out.println("2. No, thanks");

        option = input.nextInt();
        return option;
    }

    public static int unsub(Scanner input) {
        int option;
        System.out.println("Do you wanna unsubscribe?");
        System.out.println("1. Yes, of course");
        System.out.println("2. No, thanks");

        option = input.nextInt();
        return option;
    }

    public static int admin(Scanner input) {
        int option;
        System.out.println("1. Add promotions");
        System.out.println("2. Remove promotions");

        option = input.nextInt();
        return option;
    }
}
