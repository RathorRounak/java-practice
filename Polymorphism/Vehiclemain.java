package Polymorphism;
// Write a Java program to create a class Vehicle with a method called speedUp(). Create two subclasses Car and Bicycle. Override the speedUp() method in each subclass to increase the vehicle's speed differently.
public class Vehiclemain {
    public static void main(String[] rounak) {
        Vehicle v = new Car();
    v.speedUp();
    
    v = new Bicycle();
    v.speedUp();
        
    }
    
}

class Vehicle{

    void speedUp(){
        System.out.println("Vehicles move in km/h");

    }
}

class Car extends Vehicle{
    void speedUp(){
        System.out.println("Car speeds up by increasing accelerator power.");
    }
}

class Bicycle extends Vehicle{
    void speedUp(){
        System.out.println("Bicycle speeds up by pedaling faster.");    
    }
}
