// Write a Java program to create a class called Account with instance variables accountNumber and balance. Implement a parameterized constructor that initializes these variables with validation:

// accountNumber should be non-null and non-empty.
// balance should be non-negative.
// Print an error message if the validation fails.

import java.util.*;
class Account {

    String accountNumber;
    double balance;

    Account(String accountNumber , double balance){
        if(accountNumber != null && !accountNumber.isEmpty()){
            this.accountNumber = accountNumber;


            if(balance <0) { 
                System.out.print("Balance should be non-negative ");
            }
        
            else { 
                this.balance = balance;
            }
        }
        else{
            System.out.println("Account number should not be empty");
            this.accountNumber = "Invalid";
        }
    }

    void displayDetails(){
        System.out.println("Account number = "+ accountNumber);
        System.out.println("Balance = "+ balance );
    }

    public static void main(String[] rounak){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account number : ");
        String accountNumber = sc.nextLine();

        System.out.println("Enter the balance : ");
        double balance = sc.nextInt();

        Account p1 = new Account(accountNumber , balance);

        p1.displayDetails();

        sc.close();
    }
    
}

// i could have wrote this code outside the else block but how can we initialize the balance if account number is incorrect so i put it inside the if block 
// if(balance <0) 

//                 System.out.print("Balance should be non-negative ");
        
//             else  
//                 this.balance = balance;


