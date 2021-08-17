package com.company;

import java.util.ArrayList;

public class Store {
    public int balance;
    public ArrayList<Product> inventory = new ArrayList<>();
    public Console c;

    public Store(int balance){
        this.balance = balance;
    }

    public void addInventory (Product p){

        if(balance >= p.wholeSale){
            inventory.add(p);
            System.out.println("added "+p.quantity + " " + p.name + " to inventory");
            balance -= p.wholeSale;
            System.out.println("New Balance: " + balance);
        }else{
            System.out.println("Insufficient Funds");
        }
    }

    public void tossInventory (Product p){
        if(inventory.contains(p)){
            inventory.remove(p);
            System.out.println(p.name + "'s has been thrown away");
        }else{
            System.out.println("Product not found in inventory");
        }

    }


}
