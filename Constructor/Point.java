// Write a Java program to create a class called Point with instance variables x and y. Implement overloaded constructors:

// One constructor takes int parameters.
// Another constructor takes double parameters.
// Print the values of the variables for each constructor.
class Point {

    int x ,y;

    Point(int x, int y){
        this.x = x;
        this.y = y;

    }

    Point(double x , double y){
        this.x = (int)x;
        this.y = (int)y;

    }

    public static void main(String[] args){
        Point p1= new Point(5,6);
        Point p2= new Point(5.0,6.0);

        System.out.println("Integer parameterized constructor : ");
        System.out.println(p1.x);
        System.out.println(p1.y);

        System.out.println("Double parameterized constructor : ");
        System.out.println(p2.x);
        System.out.println(p2.y);
    }
}
