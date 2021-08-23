package com.company;

public class Dairy extends Product{

    private String expiration;

    public Dairy(String name, double price, int quantity){
        super(name, (int) price,quantity);

    }

    public String getExpiration (){
        return expiration;
    }


}
