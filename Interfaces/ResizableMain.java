package Interfaces;
// Write a Java program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized. Create a class Rectangle that implements the Resizable interface and implements the resize methods.
import java.util.*;
public class ResizableMain {
    public static void main(String[] rounak) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the new height : ");
        int height = sc.nextInt();

        System.out.print("Enter the new width : ");
        int width = sc.nextInt();

        Area a = new Rectangle(height , width);

        System.out.println("Do you want to change the size of the rectangle ");
        String choose = sc.next();

        if(choose.equals("yes")){

        loop:
        while(true){
            System.out.println("Enter c to change the height and width of the rectangle: ");
            char ch = sc.next().charAt(0);
            char op = Character.toUpperCase(ch);

            switch(op){
                case 'C':
                    System.out.print("Enter the width : ");
                    int w = sc.nextInt();

                    System.out.println("Enter the height : ");
                    int h = sc.nextInt();
                    a.resizeWidth(w);
                    a.resizeHeight(h);
                    a.area();
                case 'B': 
                    break loop;
            }

        }
        
    }
    else{
        a.area();
    }
    sc.close();
}
    
}
interface Resizable{

    int resizeWidth(int width);
    int resizeHeight(int height);
}

abstract class Area implements Resizable{
    abstract void area();
}

class Rectangle extends Area{
    int width;
    int height;

    Rectangle(int height , int width){
        this.width = width;
        this.height = height;

    }

    public int resizeWidth(int width){
        this.width= width;
        return width;

    }
    public int resizeHeight(int height){
        this.height = height;
        return height;
    }

    void area(){
        System.out.print("Area of Rectangle = "+ (int)height*width);
    }
}


