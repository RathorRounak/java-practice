// Write a Java program to create a class called "MathUtility" with a static method add that takes two integers and returns their sum. Demonstrate the usage of this static method in the main method without creating an instance of "MathUtility".

class MathUtility {

    static int add(int a , int b){
        return a+b;
    }

    public static void main(String[] rounak){

        // static method doesn'tneed a object to call as it belongs to the class itself.
        //we can use static method or variable inside the same class using just variable   name and i different class we have to use the classname.variablename - my understanding.

        System.out.println(add(5,7));
        System.out.println(add(6,9));
        System.out.println(add(10,10));
        
    }
    
}
