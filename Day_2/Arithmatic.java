// Take two numbers and print:

// Addition
// Subtraction
// Multiplication
// Division
// Remainder
import java.util.Scanner;
public class Arithmatic{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("==========Performing Arithmetic Operations=========");
        System.out.println("Enter First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();

        System.out.println("==============Perform Operations===========");
        System.out.println("Addition   " + ( num1 + num2));
        System.out.println("Subtraction   " + (num1 - num2));
        System.out.println("Multplication   " +(num1 * num2));
        System.out.println("Division  " + (num1 / num2));
        System.out.println("Modulus  " + (num1 % num2));

        sc.close();




    }
}