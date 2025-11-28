// Write a Java program to create a class called Dog with instance variables name and color. Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables. Print the values of the variables.
import java.util.*;
public class Dog{
    String name ;
    String color;
    
    Dog(String name , String color){
        this.name = name ;
        this.color = color;
    }
    
    public static void main(String[] rounak){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the color: ");
        String color = sc.nextLine();
        
        Dog d = new Dog(name , color);
        
        System.out.println("Name : "+ d.name);
        System.out.println("Color : "+ d.color);
    }
}