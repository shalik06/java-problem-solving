// 🚀 Day 13 - Challenge 2

// Now let's create two objects.

// Student s1 = new Student();
// Student s2 = new Student();

// Store:

// s1
// Name = "Shalik"
// Age = 22
// s2
// Name = "Farhat"
// Age = 18

// Print:
public class Students {
    String name;
    int age;
    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students();
        s1.name = "Shalik";
        s1.age = 22;
        s2.name = "Farhat";
        s2.age = 18;

        System.out.println("Student 1");
        System.out.println("Name:"+ s1.name);
        System.out.println("Age:" + s1.age);
        System.out.println("Student 2");
        System.out.println("Name:" +  s2.name);
        System.out.println("Age:" + s2.age);
    }
    
}
