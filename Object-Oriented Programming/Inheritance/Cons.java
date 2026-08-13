// Coding Challenge (Inheritance + Constructors)

// Write this program yourself:

// class Person

// Constructor:

// Person()

// Print:

// Person Constructor
// class Student extends Person

// Constructor:

// Student()

// Print:

// Student Constructor
// class CollegeStudent extends Student

// Constructor:

// CollegeStudent()

// Print:

// College Student Constructor

// In main():

// CollegeStudent c1 = new CollegeStudent();
class Person {
    Person() {
        System.out.println("111111");
    }
}

class Student extends Person {
    Student() {
        System.out.println("222222");
    }
}

class Collegestudent extends Student {
    Collegestudent() {
        System.out.println("333333");
    }
}

public class Cons {
    public static void main(String[] args) {
        Collegestudent c1 = new Collegestudent();
    }
}