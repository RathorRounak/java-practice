package Encapsulation;

//  Write a Java program to create a class called Product with private instance variables productName, productCode, and price. Provide public getter and setter methods to access and modify these variables. 

// i used for loop for everything i will try to use while loop with switch case as i don't know the exact number of product . Please help me improve furthur by reviewing the code.

import java.util.*;
public class Product {

    private String productName ;
    private int productCode;
    private double price;

    public void setData(String productName , int productCode , double price){

        this.productName = productName;
        this.productCode = productCode;
        this.price = price;

    }

    public String getProductName(){
        
            return productName;


    }
    public int getProductCode(){

        return productCode;
        
    }
    public double getPrice(){

            return price;

    }

    public static void main(String[] rounak){
        Scanner sc = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();

        System.out.println("Enter the number of product : ");
        int a = sc.nextInt();


        for(int i =0;i<a;i++){

            System.out.print("Product : ");
            System.out.println(i+1);;

            System.out.print("Enter the product name : ");
            String productName = sc.next();

            System.out.print("Enter product Id : ");
            int productCode = sc.nextInt();
            
            System.out.print("Enter the product price: ");
            double price = sc.nextDouble();

            System.out.println("----------*----------------------------");

            Product  p = new Product();

            p.setData(productName, productCode , price );

            products.add(p);
        }
        System.out.println("Enter the product id to be searched: ");
        int productCode = sc.nextInt();

        boolean found = false;


        for(int i =0 ;i<a;i++){
            Product p = products.get(i);
            if(p.getProductCode() == productCode){
                System.out.println("Product Code : " + p.getProductCode());
                System.out.println("Product Name : " + p.getProductName());
                System.out.println("Product Price : " + p.getPrice());
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Product Not Found");
        }
        sc.close();
    }
    
}
