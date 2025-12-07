package Encapsulation;
//  Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance. Provide public getter and setter methods to access and modify these variables.

import java.util.*;
public class BankAccount {

    private String accountNumber ;
    private double balance;

    void setAccountNumberandBalance(String accountNumber,double balance){
        if(accountNumber.trim().isEmpty() || accountNumber.matches(".*[^a-zA-Z0-9].*")){
            System.out.println("Invalid account number . Try new one");

        }
        else{
            this.accountNumber = accountNumber;
        }

        this.balance = balance;

    }

     double getBalance(String accountNumber){
        if(this.accountNumber.equals(accountNumber)){
            return balance;
        }

        return 0.0;
     }

     public static void main(String[] rounak){
        Scanner sc = new Scanner(System.in);

        BankAccount p1 = new BankAccount();
        BankAccount p2 = new BankAccount();
        BankAccount p3 = new BankAccount();
        p1.setAccountNumberandBalance("A", 1000);
        p2.setAccountNumberandBalance("B", 2000);
        p3.setAccountNumberandBalance("C", 3000);

        System.out.println(p1.getBalance("A"));
        System.out.println(p2.getBalance("B"));
        System.out.println(p3.getBalance("C"));

        sc.close();

        
     }
    
}
