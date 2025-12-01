
// Write a Java program to create a class called "Counter" with a static variable count. Implement a constructor that increments count every time an object is created. Print the value of count after creating several objects.

public class Counter {

    static int count;
    String word;

    Counter(){
        count++;
    }

    static void display(){
        System.out.println("Count : " + count);
    }

    public static void main(String[] rounak){

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();

        display();
        c1.word= "Hello ";
        c2.word= "World! ";
        c3.word= "Rounak ";
        c4.word= "Rathor";
        System.out.print(c1.word);
        System.out.print(c2.word);
        System.out.print(c3.word);
        System.out.print(c4.word);
    }
    
}
