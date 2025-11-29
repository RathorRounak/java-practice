// Write a Java program to create a class called Classroom with instance variables className and students (an array of strings). Implement a parameterized constructor that initializes these variables. Print the values of the variables.
import java.util.*;
public class ClassroomArray {
    String className;
    String[] students = new String[5];

    ClassroomArray(String[] students , String className){

        this.className = className;

        // for(int i = 0;i<students.length ;i++){
        //     this.students[i] = students[i];
        // }

        // this.students = Arrays.copyOf(students,students.length);
        this.students = students;

    }

    void displayInfo(){
        System.out.println("Class Name : " + className);


        System.out.println("Elements in an array are : ");
        for(int i=0 ; i<students.length ; i++){
            System.out.println(students[i]);
        }
        
    }
    public static void main(String[] rounak){ 

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Class Name : ");
        String className = sc.next();

        System.out.println("Enter the number of students : ");
        int size = sc.nextInt();
        
        String[] students = new String[size];


        System.out.println("Enter the student in class : ");
        for(int i =0;i<size; i++){
            students[i] = sc.next();
        }
        ClassroomArray c = new ClassroomArray(students,className);

        c.displayInfo();

        sc.close();
    }
    
}
