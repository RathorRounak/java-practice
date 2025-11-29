// Write a Java program to create a class called Constants with a static final variable 'PI' initialized to 3.14159. Create a method to calculate the area of a circle given its radius, using the 'PI' constant. Demonstrate the method in the main method.
import java.util.*;
class Constant {
    final static double PI = 3.14159;

    double calculate(int radius){
        return PI*radius*radius;

    }

    public static void main(String[] rounak){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        int radius = sc.nextInt();

        Constant c = new Constant();
        System.out.println(c.calculate(radius));

        sc.close();
    }
    
}
