package com.company;

public class Product {

    public String name;
    public int price;
    public int quantity;
    public int wholeSale;

    public Product(String name){
        this.name = name;
    }

    public Product(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.wholeSale = price * quantity;
    }
}
