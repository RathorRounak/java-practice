// Write a Java program to create an outer class called University with a static nested class Department. The Department class should have a method "displayInfo()" that prints the department name and the number of faculty members. Instantiate the Department class from the main method and call the "displayInfo()" method.
import java.util.*;
class University {

    static class Department{

        String department;
        int faculty ;

        void displayInfo(){
            System.out.println("Department: "+ department);
            System.out.println("No of faculty: "+ faculty);
        }
    }

    public static void main(String[] rounak){
        Scanner sc = new Scanner(System.in);
        University.Department d = new Department();

        System.out.println("Enter the Department: ");
        d.department = sc.next();
        System.out.println("Enter the number of faculty: ");
        d.faculty = sc.nextInt();


        d.displayInfo();
        sc.close();

    }
    
}
