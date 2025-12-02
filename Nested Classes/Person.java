// Write a Java program to create an outer class called Person with an inner class Address. The Address class should have a constructor that takes parameters city and state. Create an instance of Address from the Person class and print the address details. z
import java.util.*;
public class Person {

    class Address{
        String city ;
        String state;
        Address(String city , String state){
            this.city = city;
            this.state= state;

        }
        void display(){
            System.out.println("City : "+ city);
            System.out.println("State : "+ state);
        }
    }
    public static void main(String[] rounak) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the City the person lives in : ");
        String c = sc.nextLine();
        System.out.println("Enter the state the person lives in : ");
        String s = sc.nextLine();
        Person p = new Person();
        Person.Address a = p.new Address(c,s);  
        a.display();
        sc.close(); 
     }
    
}
