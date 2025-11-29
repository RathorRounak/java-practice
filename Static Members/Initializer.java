// Write a Java program to create a class called "Initializer" with a static block that initializes a static variable 'initialValue' to 1000. Print the value of 'initialValue' before and after creating an instance of "Initializer". 
class Initializer {
    static int initialValue;
    static{
        initialValue = 1000;

    }

    static void display(){
        System.out.println(initialValue);
    }

    public static void main(String[] rounak){
        display();
        Initializer i = new Initializer();
        display();
        
    }
    
}
