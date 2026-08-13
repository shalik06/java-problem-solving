// Challenge 2 (Slightly Harder)

// Create a class:

// Student

// Variables:

// String name;
// int age;
// String city;

// Create 3 overloaded constructors:

// Constructor 1
// Student()

// Set:

// name = "Unknown";
// age = 0;
// city = "Unknown";
// Constructor 2
// Student(String name)

// Set only the name.

// Constructor 3
// Student(String name, int age, String city)

// Set all values using this.

// Method
// void display()

// Print all details.

// In main()

// Create:

// Student s1 = new Student();
// Student s2 = new Student("Shalik");
// Student s3 = new Student("Farhat", 18, "Delhi");

// Call display() for all thre
public class Student {
    String name;
    int age;
    String city;
    Student(){
        name = "Unknown";
        age = 0;
        city = "Unknown";
    }
    Student(String name){
        this.name = name;

    }
    Student(String name, int age, String city){
          this.name = name;
          this.age = age;
          this.city = city;
    }
    void display(){
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student City: " + city);
        System.out.println("=================================");
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Shalik");
        Student s3 = new Student("Farhat", 18, "Delhi");

        s1.display();
        s2.display();
        s3.display();
    }
    
}
