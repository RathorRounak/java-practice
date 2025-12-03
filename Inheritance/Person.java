// Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.
public class Person{

    void getFirstName(){
        System.out.println("First Name : Rounak");

    }

    void getLastName(){
        System.out.println("Last Name : Rathor");

    }

    public static void main(String[] rounak) {
        Person p = new Person();

        p.getFirstName();
        p.getLastName();

        Employee e = new Employee();
        e.getEmployeeId();
        e.getLastName();
        }

    
}
class Employee extends Person{
    void getEmployeeId(){
        System.out.println("Employee ID : 1");

    }

    @Override
    void getLastName(){
        System.out.println("JOB TITLE : Hacker");

    }
}