//  Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.
import java.util.*;
public class ShapesMain {
    public static void main(String[] rounak) { 

        Scanner sc = new Scanner(System.in);
        System.out.println("For Circle --------------------------------------\n");
        System.out.println("Enter the radius for the circle : ");
        int radius = sc.nextInt();

        Circle c = new Circle(radius);
        c.calculateArea();
        c.calculatePerimeter();

        System.out.println("For Right Angled Traingle ------------------------------------\n");

        System.out.print("Enter the base of the trainge: ");
        int base = sc.nextInt();
        System.out.print("Enter the height of the trainge: ");
        int height = sc.nextInt();
        System.out.print("Enter the Third Side of the trainge: ");
        int thirdSide = sc.nextInt();

        Triangle t = new Triangle(base , height,thirdSide);
        t.calculatePerimeter();
        t.calculateArea();

        sc.close();

        
    }
    
}

abstract class Shape{

    abstract void  calculateArea();
    abstract void calculatePerimeter();

}

class Circle extends Shape{
    int radius;

    Circle(int radius){
        this.radius = radius;

    }

    void calculateArea(){  
        System.out.println("Area of circle : "+ 3.14*radius*radius);

    }

    void calculatePerimeter(){
        System.out.println("Perimeter of Cirle : "+ 2*3.14*radius);

    }


}

class Triangle extends Shape{

    int base ;
    int height;
    int thirdSide;

    Triangle(int base , int height, int thirdSide){

        this.base = base;
        this.height =height;
        this.thirdSide = thirdSide;

    }

    void calculateArea(){

        System.out.println("Area of triangle: "+ 0.5*height *base);
    }

    void calculatePerimeter(){
        int perimeter = height+base+thirdSide;
        System.out.println("Perimeter of triangle : " + perimeter);
        
    }

}
