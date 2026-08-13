// Coding Challenge 🧠

// Write a program:

// class Person

// Method:

// void introduce()

// Print:

// I am a Person
// class Student extends Person

// Override:

// void introduce()

// Inside it:

// super.introduce();

// Then print:

// I am a Student

// In main:

// Student s1 = new Student();
// s1.introduce();
class Person{
    void introduce(){
        System.out.println("I am a Person");
    }
}
class Student extends Person{
    void  introduce(){
        super.introduce();
        System.out.println("I am a Student");
    }
}
public class Dummy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.introduce();
    }
    
}
