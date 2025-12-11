package Interfaces;
//  Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount. The bank should have a list of accounts and methods for adding them. Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances. SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.
import java.util.*;
public class Bank{
     public static void main(String[] rounak) {
        Scanner sc = new Scanner(System.in);    
        ArrayList<Accounts> accounts = new ArrayList<>();

        System.out.print("Enter the name : ");
        String name = sc.nextLine();

        System.out.print("Enter the account number : ");
        String accountNo = sc.next();

        System.out.print("Enter the age : ");
        int age = sc.nextInt();

        System.out.print("Enter the deposit balance : ");
        double deposit = sc.nextInt();

        System.out.print("Enter the amount to be withdraw : ");
        double withdraw = sc.nextInt();

        loop:
        while(true){
            System.out.print("Enter S for saving account and C for current account and V to view the details and E for break: ");
            char ch1 =sc.next().charAt(0);
            char ch = Character.toUpperCase(ch1);

            switch(ch){
                case 'S':
                    Accounts a = new SavingAccount(name , age , accountNo);
                    accounts.add(a);
                    System.out.println("Account Added");
                    break;
                case 'C':
                    a = new CurrentAccount(name, age,accountNo);
                    accounts.add(a);
                    System.out.println("Account Added");
                    break;
                case 'V':
                    System.out.println(" Enter the account no : ");
                    String account = sc.next();     
                    for(int i =0;i<accounts.size();i++){
                        Accounts b = accounts.get(i);
                        if(account.equals(b.accountNo())){
                            b.deposit(deposit);
                            b.withdraw(withdraw);
                            b.viewBalance();
                            b.calculateInterest();
                            b.viewBalance();
                            break;
                        }
                    }
                    break;     
                case 'E': 
                break loop;        
            }
        }
        sc.close();
    }

}
interface Accounts{

    void deposit(double a );
    void withdraw(double w);
    void calculateInterest();
    double viewBalance();
    String accountNo();

}

class CurrentAccount implements Accounts{
    String accountNo;
    String name ; 
    int age;
    double balance=0.0;
    CurrentAccount(String name , int age, String accountNo){
        this.name = name;
        this.age = age;
        this.accountNo = accountNo;

    }
    public void deposit(double deposit){
        balance += deposit;  
        System.out.println("Amount Deposited.");

    }
    public void withdraw(double withdraw){

        if(balance >= withdraw){
            balance -= withdraw;
            System.out.println("Amount Withdrawn.");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }

    }
    public void calculateInterest(){
        System.out.println("No interest applied for Current Account.");

    }
    public double viewBalance(){
        return balance;

    }
    public String accountNo(){
        return accountNo;
    }

}

class SavingAccount implements Accounts{
    String accountNo;
    String name;
    int age ;
    double balance=0.0;
    SavingAccount(String name , int age , String accountNo){
        this.name = name ;
        this.age = age;
        this.accountNo = accountNo;
    }
    public void deposit(double deposit){
        balance += deposit;
        System.out.println("Amount Deposited.");

    }
    public void withdraw(double withdraw){
        if(balance >= withdraw){
            balance -= withdraw;
            System.out.println("Amount Withdrawn .");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }

    }
    public void calculateInterest(){
        double interest = balance * 0.05;
        balance += interest;
        System.out.println("Interest of 5% applied.");


    }
    public double viewBalance(){
        return balance;
    }
    public String accountNo(){
        return accountNo;
    }
}

