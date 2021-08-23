package com.company;
import java.util.Scanner;

public class Console {

    //fix console

    Scanner scanner = new Scanner(System.in);
    Store store = new Store(10000);

    public void userInterface() {
        System.out.println("--------------------");
        System.out.println("[1] Add Products to Inventory");
        System.out.println("[2] Throw Away Old Products");
        System.out.println("[3] Sell Products ");
        System.out.println("[4] Display Inventory ");

        int answer = scanner.nextInt();

        switch (answer) {
            case 1 -> {
                System.out.println("Added");
                store.addInventory();
            }
            case 2 -> {
                System.out.println("Tossed");
                store.tossInventory();
            }
            case 3 -> {
                System.out.println("Sold");
                store.sellInventory();
            }
            default -> {

                store.displayInventory();
            }
        }



    }


}
