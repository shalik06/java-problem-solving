// Q7 – Student Result System

// This one is more realistic because we'll combine:

// Multiple instance variables
// Marks
// Percentage calculation
// Grade calculation
// Pass/Fail logic

// This is where objects start behaving like real-world entities.

// Class
// Student
// Instance Variables
// String name;
// int marks;
// Constructor
// Student(String name, int marks)
// Methods
// 1. display()

// Print:

// Student Name: Shalik
// Marks: 85
// 2. grade()

// Return:

// A  -> marks >= 90
// B  -> marks >= 75
// C  -> marks >= 50
// F  -> below 50

// Return type:

// String
// 3. isPass()

// Return:

// true  -> marks >= 50
// false -> marks < 50

// Return type:

// boolean
// In main()

// Create:

// Student s1 = new Student("Shalik", 85);
// Student s2 = new Student("Farhat", 45);
// Student s3 = new Student("Rahul", 95);

// For each student print:

// display();
// System.out.println("Grade: " + grade());
// System.out.println("Pass: " + isPass());
public class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Student name: " + name);
        System.out.println("Student Marks: " + marks);
        System.out.println("======================================");
    }

    String grade() {
        if (marks >= 90) {
            return "A";

        } else if (marks >= 75) {
            return "B";

        } else if (marks >= 50) {
            return "C";

        } else {
            return "F";
        }

    }

    boolean ispass() {
        if (marks >= 50) {
            return true;

        } else {
            return false;

        }

    }

    public static void main(String[] args) {
        Student s1 = new Student("Shalik", 85);
        Student s2 = new Student("Farhat", 95);
        Student s3 = new Student("Rahul", 45);

        s1.display();
        System.out.println("Grade: " + s1.grade());
        System.out.println("Pass: " + s1.ispass());


        s2.display();
        System.out.println("Grade: " + s2.grade());
        System.out.println("Pass: " + s2.ispass());


        s3.display();
        System.out.println("Grade: " + s3.grade());
        System.out.println("Pass: " + s3.ispass());

    }
}
