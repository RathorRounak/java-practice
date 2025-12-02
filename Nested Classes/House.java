// Write a Java program to create a class called House with a method calculateArea(). Inside this method, define a local class Room with a method getArea() that calculates and returns the area of the room (length * width). Instantiate the Room class and call the getArea() method from within calculateArea().
import java.util.*;
public class House{

    int calculateArea(int length ,int breadth){

        class Room{
            int getArea(int length , int breadth){
                return length * breadth;

            }
        }

        Room r = new Room();
       return r.getArea(length , breadth);

    }

    public static void main(String[] rounak){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the room: ");
        int length = sc.nextInt();
        System.out.print("Enter the breadth of the room: ");
        int breadth = sc.nextInt();
        House h = new House();
        System.out.println(h.calculateArea(length , breadth));
        sc.close();
    }
    
}
