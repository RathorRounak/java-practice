package Polymorphism;
// Write a Java program to create a base class Shape with a method called calculateArea(). Create three subclasses: Circle, Rectangle, and Triangle. Override the calculateArea() method in each subclass to calculate and return the shape's area.
import java.util.*;
public class ShapeMain {
    public static void main(String[] rounak) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int radius = sc.nextInt();
        System.out.println("Enter the Length and breadth of rectangle: ");

        System.out.print("Length : ");
        int length = sc.nextInt();
        System.out.print("Breadth : ");
        int breadth = sc.nextInt();

        System.out.println("Enter the base and height : ");

        System.out.print("Height : ");
        int height = sc.nextInt();

        System.out.print("Base : ");
        int base = sc.nextInt();

        


        Shape c = new Circle(radius);
        Shape r = new Rectangle(length ,breadth);
        Shape t = new Triangle(base, height);
        c.calculateArea();
        r.calculateArea();
        t.calculateArea();

        sc.close();
    }
}
 class Shape{

    void calculateArea(){
        System.out.println("Calculate the area");

    }
}

class Circle extends Shape{
    int radius;
    Circle(int radius){
        this.radius = radius;
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }
    
    
}
class Rectangle extends Shape{
    int length;
    int breadth;

    Rectangle(int length , int breadth){
        this.length = length;
        this.breadth = breadth;

    }
    void calculateArea() {
        double area = length * breadth;
        System.out.println("Rectangle Area: " + area);
    }

}
class Triangle extends Shape{
    int base ;
    int height;

    Triangle(int base , int height){
        this.base = base;
        this.height = height;
    }

    void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Triangle Area: " + area);
    }

}
