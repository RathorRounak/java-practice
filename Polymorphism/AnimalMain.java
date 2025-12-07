package Polymorphism;

// Write a Java program to create a base class Animal (Animal Family) with a method called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific sound for each animal.
public class AnimalMain {
    public static void main(String[] rounak) {
        Animal a = new Bird();
        a.sound();

        a = new Cat();
        a.sound();
    }
    
}
class Animal{
    void sound(){
        System.out.println("Animal Make Sounds ");
    }

}

class Bird extends Animal{
    void sound(){
         System.out.println("Bird chirps");
    }
}

class Cat extends Animal{
    void sound(){
         System.out.println("Cat Meows");
    }
}
