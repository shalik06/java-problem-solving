// Coding Challenge 2 🧠

// Write a program:

// class Person

// Methods:

// void introduce()

// Print:

// I am a Person

// and

// void walk()

// Print:

// Person is Walking
// class Student extends Person

// Override:

// introduce()

// Print:

// I am a Student

// Add another method:

// void study()

// Print:

// Student is Studying
// In main()
// Student s1 = new Student();

// s1.introduce();
// s1.walk();
// s1.study();
class Person{
    void introduce(){
        System.out.println("I am a person");
    }
    void walk(){
        System.out.println("Person is walking");
    }
}
class student extends Person{
    void introduce(){
        System.out.println("I am Student");
    }
    void study(){
        System.out.println("Student is Studying");
    }
}
public class Demo {
    public static void main(String[] args) {
        student s1 = new student();

        s1.introduce();
        s1.walk();
        s1.study();
    }
    
}
