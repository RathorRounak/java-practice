// Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car". 
class Vehicle {

    void drive(){
        System.out.println("Vehicle need to be maintained");

    }


     public static void main(String[] rounak) {
        Vehicle v = new Vehicle();
        v.drive();

        Car c = new Car();
        c.drive();
    }
    
}

class Car extends Vehicle{
    @Override
    void drive(){
        System.out.println("Repairing a car");
    }
}

