// Q5

// Mini Calculator

// Take

// number1

// number2

// operator (+ - * /)

// Use switch
import java.util.Scanner;

public class MiniCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        double num1 = sc.nextDouble();
        System.out.println("Enter Second Number");
        double num2 = sc.nextDouble();
        System.out.println("Chosse Operators (+,-,*,/):");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println("Addition  =" + (num1 + num2));
                break;
            case '-':
                System.out.println("Subtraction  =" + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication  = " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Division = " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid OPerators");
                break;
        }

        sc.close();
    }

}
