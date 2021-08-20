package com.company;

public class Dairy extends Product{

    private String expiration;

    public Dairy(String name, int price, int quantity){
        super(name,price,quantity);

    }

    public String getExpiration (){
        return expiration;
    }

    public void setExpiration(String expiration){
        this.expiration = expiration;
    }


}
