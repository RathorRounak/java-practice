// Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.
public class Animal {

    void makeSound(){
        System.out.println("Animal make different Sounds");

    }
    
    
}

class Cat extends Animal{
        @Override
        void makeSound(){
            System.out.println("Meow");

        }

    }

class Main{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();

        Cat c = new Cat();
        c.makeSound();
    }
}
