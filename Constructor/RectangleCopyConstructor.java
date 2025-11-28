// Write a Java program to create a class called Rectangle with instance variables length and width. Implement a parameterized constructor and a copy constructor that initializes a new object using the values of an existing object. Print the values of the variables.


// Copy constructor is used to reduce the line of code 

// Copy constructor helps us in using the value of an existing object this saves us time and prevent repeatative coding

class Rectangle{
    int length;
    int width;
    int height;

    Rectangle(int length , int width){
        this.length = length ;
        this.width = width;
    }


    Rectangle(Rectangle obj , int height){
        this.length = obj.length;
        this.width = obj.width;
        this.height = height;

    }

    void display(){
        System.out.println("Length : " + length);
        System.out.println("Width : "+ width);
        System.out.println("Height : "+ height);
    }

    public static void main(String[] rounak){
        Rectangle r1 = new Rectangle(10 , 50);
        Rectangle r2 = new Rectangle(r1,  20);
        

        System.out.println("Dimension using copy constructor are ");
        r2.display();

        

    }
    
}


// i was doing this before knowing the concept of copy constructor 

// public class Rectangle { 
//     int length; 
//     int width; 
//     Rectangle(int length , int width){ 
//         this(length , width) 
//     } 
    
//     Rectangle(int length , int width){ 
//         this.length = length; 
//         this.width = width; 
//     } 
//     void display(){
//         System.out.println("Length : " + length);
//         System.out.println("Width : "+ width); 
//         }

// }
