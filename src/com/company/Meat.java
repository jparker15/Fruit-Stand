package com.company;

public class Meat extends Product{

    private String expiration;

    public Meat(String name, double price, int quantity){
        super(name, (int) price,quantity);

    }

    public String getExpiration (){
        return expiration;
    }

}
