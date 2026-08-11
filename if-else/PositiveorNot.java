// Q4

// Take a number.

// Check whether it is:

// Positive

// Negative

// or

// Zero.
import java.util.Scanner;
public class PositiveorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        double num = sc.nextDouble();
        if (num > 0) {
            System.out.println("Number is Positive");
        }
        else if (num < 0) {
            System.out.println("Number is Negative");
        }
        else{
            System.out.println("Number is Zero");
        }
        sc.close();

    }
    
}
