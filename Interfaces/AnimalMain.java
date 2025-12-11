package Interfaces;
// Write a Java program to create a Animal interface with a method called bark() that takes no arguments and returns void. Create a Dog class that implements Animal and overrides bark() to print "Dog is barking".
public class AnimalMain {
    public static void main(String[] rounak) {
        Animal a  = new Dog();
        a.bark();
        
    }
    
}
interface Animal {
    void bark();

}

class Dog implements Animal{
    public void bark(){
        System.out.println("Dog is Barking");
    }
}