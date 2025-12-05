import java.util.*;
public class BankAccountMain {
    public static void main(String[] rounak) {
        Scanner sc= new Scanner(System.in);
        int balance =0;
        SavingsAccount s = new SavingsAccount(balance);
        
        loop:
        while(true){

            System.out.println("Enter d for deposite and w for withdrawal and v for view and b to go back");
            char ch = sc.next().charAt(0);

        switch(ch){
            case 'd':
                    System.out.println("Enter the amount to be deposited: ");
                    double dcash = sc.nextDouble();
                    System.out.println("Amount Credited : " + s.deposit(dcash));
                 break;

            case 'w':
                    System.out.println("Enter the Debited to be deposited: ");
                    double wcash = sc.nextDouble();
                    System.out.println("Amount Debited : "+ s.withdraw(wcash));
                break;

            case 'v':
                    System.out.println("Account balance : "+ s.balance);
                break;

            case 'b': 
                break loop;
                
            default:
                    System.out.println("Invalid input");
            }
        }
        sc.close();
    }
}

abstract class BankAccount{

     double balance =0;
     double moneyWithdraw =0;
     double moneyDeposit =0;

    abstract double deposit(double money);
    abstract double withdraw(double money);
}

class SavingsAccount extends BankAccount{

    SavingsAccount(double balance){
        super.balance = balance;
    }

    double deposit(double moneyDeposit){
        balance += moneyDeposit;
        return balance;
    }

    double withdraw(double moneyWithdraw){
        balance -= moneyWithdraw;
        return balance;
    }
}
