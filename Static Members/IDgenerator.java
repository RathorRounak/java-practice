// Write a Java program to create a class called "IDGenerator" with a static variable 'nextID' and a static method "generateID()" that returns the next ID and increments 'nextID'. Demonstrate the usage of generateID in the main method.
import java.util.*;
class IDgenerator {

    static int nextID;

    static int generateId(){

        return nextID++;
    }

    public static void main(String[] rounak) {
        Scanner sc = new Scanner(System.in);
        
        loop:
       while(true){
           
           System.out.print("Enter G to generate ID and E to exit : ");
           char ch = sc.next().charAt(0);
           switch(ch){
               case 'G': 
                   System.out.println("ID Generated : " + generateId());
                   break;
               case 'E': 
                   break loop;
               default:
                System.out.println("Wrong choice");
                break;
               
           }
       }
       sc.close();
          }
    
}

// I learned new concept here that is - labelled break;
