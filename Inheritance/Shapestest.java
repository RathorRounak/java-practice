// Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.
import java.util.*;
class Shapes {

    static Scanner sc = new Scanner(System.in);
    void getPerimeter(){
        System.out.println("Calculate the Perimeter: ");
    }

    void getArea(){
        System.out.println("Calculate the Area: ");
    }
    
}

class Circle extends Shapes{
    @Override
    void getPerimeter(){
        System.out.println("Enter the radius of a circle: ");
        int radius = sc.nextInt();
        System.out.println("Perimeter of Circle: "+ 2 *3.15*radius);
        
    }
    
    @Override 
    void getArea(){
        System.out.println("Enter the radius of a circle: ");
        int radius = sc.nextInt();
        System.out.println("Area of Circle: "+ 3.15*radius*radius);
        
    }

}

public class Shapestest{
    public static void main(String[] args) {
        Shapes s = new Shapes();
        s.getArea();
        s.getPerimeter();

        Circle c = new Circle();
        c.getArea();
        c.getPerimeter();
    }
}
