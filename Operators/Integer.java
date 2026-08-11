// Q3

// Take two integers.

// Print:

// Is first number greater than second?

// Output should be true or false.
import java.util.Scanner;
public class Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();

        System.out.println( (num1 >= num2 ));
        

        sc.close();
    }
    
}
