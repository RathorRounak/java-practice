// Create an interface Car with abstract methods getName() and getMaxSpeed(), a default method applyBreak(), and a static method getFastestCar(Car, Car) that returns the car with the higher speed.

// Implement the interface in classes BMW and Audi.
// Using command-line arguments (name and speed for each car), create two car objects and print:

// Fastest car is : <car name>


package Interfaces;
import java.util.*;
interface Car {
	String getName();
	int getMaxSpeed();

	default void applyBreak(){
		System.out.println("Applying break on "+ getName());
	}
	static Car getFastestCar(Car car1 , Car car2){
		if(car1.getMaxSpeed() >= car2.getMaxSpeed()){
			return car1;
		}
		return car2;
	}
	
}
class BMW implements Car {
	private String name;
	private int maxSpeed;

	BMW(String name , int maxSpeed){
		this.name = name ;
		this.maxSpeed = maxSpeed;
	}
	public String getName(){
		return name ;
		
	}
	public int getMaxSpeed(){
		return maxSpeed;
		
	}
	
	
}
class Audi implements Car {
	private String name;
	private int maxSpeed;

	Audi(String name , int maxSpeed){
		this.name = name ;
		this.maxSpeed = maxSpeed;
	}

	public String getName(){
		return name;
		
	}
	public int getMaxSpeed(){
		return maxSpeed;
		
	}
}
public class MainApp {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the name of car 1: ");
		String name1 = sc.next();
		System.out.print("Enter the max speed : ");
		int speed1 = Integer.parseInt(args[1]);
		System.out.print("Enter the name of car 2 : ");
		String name2 = sc.next();
		System.out.print("Enter the max speed : ");
		int speed2= Integer.parseInt(args[1]);
		
		Car c1 = new BMW(name1 , speed1);
		Car c2 = new Audi(name2 , speed2);
		Car c = Car.getFastestCar(c1,c2);
		System.out.println("Fastest car is : "+ c.getName());

		sc.close();
	}
}

