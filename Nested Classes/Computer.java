// Write a Java program to create an outer class called Computer with an inner class Processor. The Processor class should have a method "displayDetails()" that prints the details of the processor (e.g., brand and speed). Create an instance of Processor from the Computer class and call the "displayDetails()" method.

// to make an object of non-static inner class we need and object of outer class

class Computer{
    class Processor{
        void displayDetails(){
            System.out.println("Brand : Intel");
            System.out.println("Speed : 5.8GHZ" );
        }
        
    }
    
    public static void main(String[] rounak){
        Computer c = new Computer();
        Computer.Processor p = c.new Processor();
        p.displayDetails();
    }
}