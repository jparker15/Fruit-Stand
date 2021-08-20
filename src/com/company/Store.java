package com.company;

import java.util.ArrayList;

public class Store {
    private int balance;
    private ArrayList<Product> inventory = new ArrayList<>();

    public Store(int balance){
        this.balance = balance;
    }

    public void addInventory (Product p){
        if(balance >= p.getWholeSale()){
            inventory.add(p);
            System.out.println("added "+p.getQuantity() + " " + p.getName() + " to inventory");
            balance -= p.getWholeSale();
            System.out.println("New Balance: " + balance);
        }else{
            System.out.println("Insufficient Funds");
        }
    }

    public void tossInventory (String name){

        //TODO:change from Product to name, find index()
//        if(inventory.contains(p)){
//            inventory.remove(p);
//            System.out.println(p.getName() + "'s has been thrown away");
//        }else{
//            System.out.println("Product not found in inventory");
//        }

    }

    public void displayInventory(){
        for(Product p: inventory){
            p.display();
            p.setPrice(1);
        }
    }

}
