package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Console console = new Console();
        Store store = new Store(1000000000);

        console.greeting();

        store.addInventory(new Product("Mango",20,100));

        store.tossInventory(new Product("Mango"));


    }
}
