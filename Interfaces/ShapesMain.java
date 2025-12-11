package Interfaces;

// Write a Java program to create an interface Shape with the getArea() method.
// Create Rectangle, Circle, and Triangle classes that implement the interface.

public class ShapesMain {
    public static void main(String[] args) {
        
        Shapes s = new Rectangle(10, 5);
        s.getArea();

        s = new Circle(7);
        s.getArea();

        s = new Triangle(12, 8);
        s.getArea();
    }
}

interface Shapes {
    void getArea();
}

class Rectangle implements Shapes {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void getArea() {
        int area = length *breadth;
        System.out.println("Rectangle Area: " + area);
    }
}

class Circle implements Shapes {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public void getArea() {
        double area = Math.PI*radius *radius;
        System.out.println("Circle Area: " + area);
    }
}

class Triangle implements Shapes {
    int base;
    int height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public void getArea() {
        double area = 0.5 * base *height;
        System.out.println("Triangle Area: " + area);
    }
}
