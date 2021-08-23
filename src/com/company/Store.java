package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    private int balance;
    private ArrayList<Product> inventory = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Store(int balance){
        this.balance = balance;
    }

    public void addInventory (){

        while(true){
            System.out.println("What type of product?");
            System.out.println("Meat (1) or Diary(2)");

            int answer = scanner.nextInt();

            System.out.println("Name?:");
            String name = scanner.next();
            System.out.println("Price?:");
            double price = scanner.nextDouble();
            System.out.println("Quantity?:");
            int quantity = scanner.nextInt();

            if(answer == 1 ){
                System.out.println(name+price+quantity);
                inventory.add(new Meat(name,price,quantity));
                break;
            }
            if(answer == 2) {
                System.out.println(name+price+quantity);
                inventory.add(new Dairy(name,price,quantity));
                break;

            }
            else{
                System.out.println("\nInvalid Input");
            }
        }
    }

    public void tossInventory (){

        //TODO:change from Product to name, find index()
        if(inventory.size() > 0){
            while(true){
                System.out.println("Type the name of the product to throw away:");
                String answer = scanner.next();

                for(Product p: inventory){
                    if(p.getName().equals(answer)){
                        inventory.remove(p);
                    }else{
                        System.out.println("Product not in Inventory");
                    }
                }
            }
        }else{
            System.out.println("No Products in Inventory");
        }

//        if(inventory.contains(p)){
//            inventory.remove(p);
//            System.out.println(p.getName() + "'s has been thrown away");
//        }else{
//            System.out.println("Product not found in inventory");
//        }

    }

    public void displayInventory(){
        if(inventory.size() > 0){
            for(Product p: inventory){
                p.display();
            }
        }else{
            System.out.println("Inventory Empty");
        }

    }

    public void sellInventory(){
        if(inventory.isEmpty()){
            System.out.println("Inventory Empty");
        }else{
            System.out.println("Type Name of Product to Sell");
            String name = scanner.next();
            while(true){
                for(Product p: inventory){
                    if(p.getName().equals(name)){
                        System.out.println(p.getQuantity() );
                        break;
                    }else{
                        System.out.println("Product not in inventory!");
                    }
                }
            }
        }
    }

}
