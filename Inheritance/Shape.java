// . Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
import java.util.*;
public class Shape {
    static Scanner sc = new Scanner(System.in);

    void getArea(){
        System.out.println("Print Area. ");
    }

    public static void main(String[] rounak) {
        Shape s = new Shape();
        s.getArea();

        Rectangle r = new Rectangle();
        r.getArea();
        
    }
    
}

class Rectangle extends Shape{
    @Override
    void getArea(){
        System.out.println("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        int breadth = sc.nextInt();

        System.out.println("Area of Rectangle = "+ length*breadth);
    }
}
