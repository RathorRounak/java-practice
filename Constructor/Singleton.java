// Write a Java program to create a class called Singleton that ensures only one instance of the class can be created. Implement a private constructor and a public static method to get the single instance of the class. Print a message indicating the creation of the instance. 

// Singleton pattern
class Singleton{
    private static Singleton obj = new Singleton();

    private Singleton(){
        System.out.println("For this class there is only one object as it follow singleton pattern main keyword here is static because the object which is created and stored in reference variable obj is static which belongs to the class and static variable has only one copy - My Understanding");

    }
    public static Singleton getObj(){
        return obj;
    }
    // Static variable can be accessed by static method;

    public static void main(String[] rounak){

        Singleton s1 = getObj();
        Singleton s2 = getObj();
        System.out.println(s1==s2);

        // both s1 and s2 points to the same object this class only has one object
    }
}