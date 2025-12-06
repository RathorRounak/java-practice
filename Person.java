// Write a Java program to create a class called Person with private instance variables name, age. and country. Provide public getter and setter methods to access and modify these variables.
import java.util.*;
public class Person{
    private String name; 
    private int age;
    private String country;

    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void setCountry(String country){
        this.country = country;
    }

    String getName(){
        return name;
    }

    String getCountry(){
        return country;
    }
    int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p = new Person();

        System.out.println("Set the name : ");
        String name = sc.nextLine();
        p.setName(name);

        System.out.println("Set the age : ");
        int age = sc.nextInt();
        p.setAge(age);

        System.out.println("Set the country");
        String country = sc.next();
        p.setCountry(country);


       System.out.println("Name : " + p.getName());
        System.out.println("Age : "+ p.getAge());
       System.out.println("Country : " + p.getCountry());

        sc.close();


        
    }
}
