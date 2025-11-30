// Write a Java program to create a class called "BankAccount" with instance variables 'accountNumber' and balance, and static variables 'bankName' and 'interestRate'. Provide static methods to get and set the static variables. Create several 'BankAccount' objects and print their details along with the static variables.

class BankAccount {
     int accountNumber;
     double balance;

     static String bankName;
     static double interestRate;

     BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

     static void setBankNameAndInterestRate(String name ,double rate) {
        bankName = name;
        interestRate = rate;
    }

     static String getBankName() {
        return bankName;
    }

     static double getInterestRate() {
        return interestRate;
    }
     void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("");
    }

    public static void main(String[] rounak) {
        BankAccount.setBankNameAndInterestRate("National Bank of India" , 5.5);

        BankAccount acc1 = new BankAccount(1001, 15000.50);
        BankAccount acc2 = new BankAccount(1002, 32000.75);
        BankAccount acc3 = new BankAccount(1003, 5000.00);

        acc1.displayDetails();
        acc2.displayDetails();
        acc3.displayDetails();
    }
}

