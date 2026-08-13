// Challenge 2

// Write:

// class Person

// Method:

// void showName()

// Print:

// My name is Shalik

// Create:

// class Student extends Person

// Method:

// void study()

// Print:

// Student is studying

// In main():

// Student s1 = new Student();

// Call:

// s1.showName();
// s1.study();
class Person{
    void showName(){
        System.out.println("My Name is Shalik: ");
    }
}
class Student extends Person{
    void study(){
        System.out.println("Student is Studying: ");
    }
}
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.showName();
        s1.study();
    }

    
}
