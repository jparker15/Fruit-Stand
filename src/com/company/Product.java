package com.company;

public class Product {

    private String name;
    private int price;
    private int quantity;
    private int wholeSale;

    public Product(String name){
        this.name = name;
    }

    public Product(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.wholeSale = price * quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getWholeSale() {
        return wholeSale;
    }

    public void setWholeSale(int wholeSale) {
        this.wholeSale = wholeSale;
    }

    public void display(){
        System.out.println("Name: "+getName() + " Price: " + getPrice() + " Quantity:" + getQuantity());
    }
}
