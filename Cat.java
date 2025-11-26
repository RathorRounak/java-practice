// Write a Java program to create a class called "Cat" with instance variables name and age. 
// Implement a default constructor that initializes the name to "Unknown" and the age to 0. 
// Print the values of the variables.

    class Cat{
        String name ;
        int age;
        
        Cat(){
            this.name = "unknown";
            this.age =0;
            
        }
        
        public static void main(String[] desp){
            Cat c = new Cat();
            System.out.println("Name : " + c.name);
            System.out.println("Age : " + c.age);
        }
    }