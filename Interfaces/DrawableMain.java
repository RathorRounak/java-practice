package Interfaces;
// Write a Java program to create an interface Drawable with a method draw() that takes no arguments and returns void. Create three classes Circle, Rectangle, and Triangle that implement the Drawable interface and override the draw() method to draw their respective shapes./
public class DrawableMain {
    public static void main(String[] rounak) {
        Drawable d = new Circle();
        d.draw();
        d = new Rectangle();
        d.draw();
        d= new Triangle();
        d.draw();

        
    }
    
}
interface Drawable{
    void draw();


}

class Circle  implements Drawable{
    public void draw(){
        System.out.println("Drawing a Circle...");

    }

}
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Drawing a Rectangle...");


    }

}
class Triangle implements Drawable{
    public void draw(){
        System.out.println("Drawing a Triangle...");

    }

}


