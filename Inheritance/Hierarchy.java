// Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.


class Vehicle {
    String model;
    int year;
    String fuelType;

    void fuelEfficiency() {
        System.out.println("General Fuel Efficiency of Vehicle.");
    }

    void distancetraveled() {
        System.out.println("General Distance travelled by Vehicle.");
    }

    void maximumSpeed() {
        System.out.println("General Maximum speed of Vehicle.");
    }
}

class Truck extends Vehicle {

    @Override
    void fuelEfficiency() {
        System.out.println("Truck Fuel Efficiency: 6 km/l");
    }

    @Override
    void distancetraveled() {
        System.out.println("Truck Distance Example: 80 km/h × 2h = 160 km");
    }

    @Override
    void maximumSpeed() {
        System.out.println("Truck Maximum Speed: 120 km/h");
    }
}

class Car extends Vehicle {

    @Override
    void fuelEfficiency() {
        System.out.println("Car Fuel Efficiency: 15 km/l");
    }

    @Override
    void distancetraveled() {
        System.out.println("Car Distance Example: 60 km/h × 3h = 180 km");
    }

    @Override
    void maximumSpeed() {
        System.out.println("Car Maximum Speed: 180 km/h");
    }
}

class Motorcycle extends Vehicle {

    @Override
    void fuelEfficiency() {
        System.out.println("Motorcycle Fuel Efficiency: 40 km/l");
    }

    @Override
    void distancetraveled() {
        System.out.println("Motorcycle Distance Example: 50 km/h × 2h = 100 km");
    }

    @Override
    void maximumSpeed() {
        System.out.println("Motorcycle Maximum Speed: 160 km/h");
    }
}

public class Hierarchy {
    public static void main(String[] rounak) {

        Truck t = new Truck();
        Car c = new Car();
        Motorcycle m = new Motorcycle();

        t.model = "Tata LPT 1615";
        t.year = 2020;
        t.fuelType = "Diesel";

        c.model = "Toyota Corolla";
        c.year = 2022;
        c.fuelType = "Petrol";

        m.model = "Honda Shine";
        m.year = 2021;
        m.fuelType = "Petrol";

        System.out.println("--- TRUCK DETAILS ---");
        System.out.println("Model: " + t.model);
        System.out.println("Year: " + t.year);
        System.out.println("Fuel Type: " + t.fuelType);
        t.fuelEfficiency();
        t.distancetraveled();
        t.maximumSpeed();

        System.out.println("");
        
        System.out.println("--- CAR DETAILS ---");
        System.out.println("");
        System.out.println("Model: " + c.model);
        System.out.println("Year: " + c.year);
        System.out.println("Fuel Type: " + c.fuelType);
        c.fuelEfficiency();
        c.distancetraveled();
        c.maximumSpeed();
        System.out.println("");
        
        System.out.println("--- MOTORCYCLE DETAILS ---");
        System.out.println("");
        System.out.println("Model: " + m.model);
        System.out.println("Year: " + m.year);
        System.out.println("Fuel Type: " + m.fuelType);
        m.fuelEfficiency();
        m.distancetraveled();
        m.maximumSpeed();
        System.out.println("");
    }
}