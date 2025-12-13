// Write a Java program to demonstrate accessing superclass constructor,
// method, and variable using the super keyword.

import java.util.Scanner;
class SuperClass {
    int value1, value2;

    SuperClass(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    void show() {
        System.out.println("This is super class show() method");
        System.out.println("value1 = " + value1);
    }
}

class SubClass extends SuperClass {
    int value3, value4;

    SubClass(int value1, int value2, int value3, int value4) {
        super(value1, value2);
        this.value3 = value3;
        this.value4 = value4;
    }

    void show() {
        System.out.println("This is sub class show() method");
        super.show();
        System.out.println("value2 from super class = " + value2);
        System.out.println("value3 = " + value3);
        System.out.println("value4 = " + value4);
    }
}

public class AccessUsingSuper {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value1: ");
        int value1 = sc.nextInt();

        System.out.print("Enter value2: ");
        int value2 = sc.nextInt();

        System.out.print("Enter value3: ");
        int value3 = sc.nextInt();

        System.out.print("Enter value4: ");
        int value4 = sc.nextInt();

        SubClass obj = new SubClass(value1, value2, value3, value4);
        obj.show();

        sc.close();
    }
}
