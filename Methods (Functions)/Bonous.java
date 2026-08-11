// Create a method:

// line()

// that prints:

// ==========================

// Now write a program like this:

// line();
// System.out.println("Student Report");
// line();
// System.out.println("Name : Md Shalik");
// System.out.println("Course : BCA");
// line();

// Expected output:

// ==========================
// Student Report
// ==========================
// Name : Md Shalik
// Course : BCA
// ==========================

// Rule: You should never type the separator line more than once in your code. Reuse the line() method.
public class Bonous {
    public static void line() {
        System.out.println("============================");
        
    }
    public static void main(String[] args) {
        line();
        System.out.println("Student Report");
        line();
        System.out.println("Name : Md Shalik");
        System.out.println("Cource : BCA");
        line();
    }
    
}
