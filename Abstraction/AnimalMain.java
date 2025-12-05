// Write a Java program to create an abstract class Animal with an abstract method called sound(). Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound for each animal.
abstract class Animal {

    abstract void sound();
    
}

class Lion extends Animal{

    void sound(){
        System.out.println("Lion : ROOOAAARRRRR!!!");
    }

}
class Tiger extends Animal{
    void sound(){
        System.out.println("Tiger : GRAAWWRRRR!");
    }

}

public class AnimalMain{
    public static void main(String[] rounak) {
        Lion l = new Lion();
        Tiger t = new Tiger();

        l.sound();
        t.sound();
    }
}