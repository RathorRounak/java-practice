// Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a default constructor and two parameterized constructors:

// One constructor takes title and author as parameters.
// The other constructor takes title, author, and price as parameters.
// Print the values of the variables for each constructor.

public class Book {

    String title;
    String author;
    int price;

    Book(){
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0;
    }
    Book(String title , String author){
        this.title = title;
        this.author = author;
    }
    Book(String title , String author , int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args){
        Book b = new Book();
        Book b1 = new Book("Outside Of Time" , "Er Gen");
        Book b2 = new Book("Renegade Immortal" , "Er Gen" , 450);

        System.out.println("Book 0 :- ");
        
        System.out.println("Title : " + b.title);
        System.out.println("Author : " + b.author);
        System.out.println("Price : " + b.price);

        System.out.println("Book 1 :- ");

        System.out.println("Title : "+b1.title);
        System.out.println("Author : "+b1.author);


        System.out.println("Book 2 :- ");

        System.out.println("Title : "+b2.title);
        System.out.println("Author : "+b2.author);
        System.out.println("Price : "+b2.price);


    }
}
