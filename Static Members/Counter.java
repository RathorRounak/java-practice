
// Write a Java program to create a class called "Counter" with a static variable count. Implement a constructor that increments count every time an object is created. Print the value of count after creating several objects.

public class Counter {

    static int count;

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
        Counter c5 = new Counter();

        display();
    }
    
}
