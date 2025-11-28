// Write a Java program to create a class called Student with instance variables studentId, studentName, and grade. Implement a default constructor and a parameterized constructor that takes all three instance variables. Use constructor chaining to initialize the variables. Print the values of the variables.

public class Student {

    int studentId;
    String studentName;
    char grade ;

    Student(){
        this(0 , "unknown", 'N');

    }
    Student(int studentId , String studentName , char grade){
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;

    }
    void displayInfo(){
        System.out.println("Student ID : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Grade : "+ grade);
    }

    public static void main(String[] rounak){
        Student s1 = new Student();
        Student s2 = new Student(1 , "Rounak" , 'A');

        System.out.println("Student 1 details :- ");
        s1.displayInfo();

        System.out.println("Student 2 details :- ");
        s2.displayInfo();
    }
    
}
