// Write a Java program to create a class called Car with instance variables make, model, and year. Implement a parameterized constructor that initializes these variables and assigns default values if not provided. Print the values of the variables.

import java.util.*;
class Car {
    String year;
    String make;
    String model;

    Car(String year , String make , String model){
        
        this.year  = (year  == null || year.trim().isEmpty())  ? "Not given"       : year;
        this.make  = (make  == null || make.trim().isEmpty())  ? "Not initialized" : make;
        this.model = (model == null || model.trim().isEmpty()) ? "Not mentioned"   : model;

    }

    void displayDetails(){
        System.out.println("Model : " + model);
        System.out.println("Make : " + make);
        System.out.println("Year : " + year);
    }

    public static void main(String[] rounak){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the make : ");
        String make = sc.nextLine();

        System.out.println("Enter the model : ");
        String model = sc.nextLine();

        System.out.println("Enter the year : ");
        String year = sc.nextLine();
        Car c1 = new Car(year , make , model);

        c1.displayDetails();

        sc.close();
    }
    
}
