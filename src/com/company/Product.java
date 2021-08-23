package com.company;

public class Product {

    private String name;
    private double price;
    private int quantity;
    private int wholeSale;

    public Product(String name){
        this.name = name;
    }

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.wholeSale =(int) price * quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void display(){
        System.out.println("Name: "+getName() + " Price: " + getPrice() + " Quantity:" + getQuantity());
    }
}
