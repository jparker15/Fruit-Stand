package com.company;
import java.util.Scanner;

public class Console {

    Scanner scanner = new Scanner(System.in);
    Store store = new Store(1000000000);

    public void greeting(){
        System.out.println("LMOAS");
    }

    public void add (){
        System.out.println("Add a product!");
        System.out.println("Meat (1) or Dairy (2)");
        int yn = scanner.nextInt();
        if(yn == 1){
            System.out.println("enter Name of product:");
            String name = scanner.next();
            System.out.println("enter Price of product:");
            int price = scanner.nextInt();
            System.out.println("enter Quantity of product:");
            int quantity = scanner.nextInt();

            new Meat(name,price,quantity);
        }else{
            System.out.println("enter Name of product:");
            String name = scanner.next();
            System.out.println("enter Price of product:");
            int price = scanner.nextInt();
            System.out.println("enter Quantity of product:");
            int quantity = scanner.nextInt();

            new Dairy(name,price,quantity);
        }

    }


}
