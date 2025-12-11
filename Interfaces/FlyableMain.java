package Interfaces;
// Write a Java program to create an interface Flyable with a method called fly_obj(). Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable interface. Implement the fly_obj() method for each of the three classes.
public class FlyableMain {
    public static void main(String[] rounak) {
        Flyable[] flyable = {new Spacecraft() , new Airplane() , new Helicopter()};

        for( Flyable flyabl : flyable){
            flyabl.fly_obj();
        }
        
    }
    
}

interface Flyable {
    void fly_obj();
}
class Spacecraft implements Flyable{
    public void fly_obj(){
        System.out.println("Spacecraft ready to fly.");
    }

}
class Airplane implements Flyable{
    public void fly_obj(){
        System.out.println("Airplane ready to fly.");
        
    }
    
}
class Helicopter implements Flyable{
    public void fly_obj(){
        System.out.println("Helicopter ready to fly.");

    }

}
