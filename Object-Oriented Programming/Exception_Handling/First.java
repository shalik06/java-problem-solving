// Coding Challenge 🚀

// Write a program:

// int marks = 20;

// If marks are less than 33:

// throw new ArithmeticException("Student Failed");

// Otherwise print:

// Student Passed
// Expected Result

// Since:

// marks = 20

// the output should be:
public class First {

    public static void main(String[] args) {
        int marks = 20;
        if (marks < 33) {
            throw new ArithmeticException("Student Faild");
        }
        System.out.println("Student pass");
    }
}