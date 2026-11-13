import java.util.*;

// Parent class
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;   // this keyword
        this.age = age;
    }
}

// Child class
class Student extends Person {
    private int rollNo;
    private float marks;

    Student(String name, int age, int rollNo, float marks) {
        super(name, age);   // super keyword
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Getter methods
    public int getRollNo() {
        return rollNo;
    }

    public float getMarks() {
        return marks;
    }

    // Display method
    public void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Roll No : " + getRollNo());
        System.out.println("Marks   : " + getMarks());
    }
}

// Main class
public class Encapsulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter marks: ");
        float marks = sc.nextFloat();

        Student s = new Student(name, age, rollNo, marks);

        s.display();

        sc.close();
    }
}