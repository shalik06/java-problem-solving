// ⭐ Bonus Challenge

// Create three overloaded methods named:

// student()

// Method 1:

// No parameters

// Print:

// Student Details

// Method 2

// String name

// Print:

// Student : name

// Method 3

// String name,int age

// Print both.
public class Bonus {
    public static void student() {
        System.out.println("Student Details");
    }
    public static void student(String name) {
        System.out.println("Student:"+name);
    }
    public static void student(String name, int age) {
        System.out.println(name+age);
    }
    public static void main(String[] args) {
        student();
        student("Shalik");
        student("Shalik", 22);
        
    }
    
}
