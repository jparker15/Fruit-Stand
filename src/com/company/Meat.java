package com.company;

public class Meat extends Product{

    private String expiration;

    public Meat(String name, int price, int quantity){
        super(name,price,quantity);

    }

    public String getExpiration (){
        return expiration;
    }

    public void setExpiration(String expiration){
        this.expiration = expiration;
    }

}
