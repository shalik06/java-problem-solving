// Q2

// Take a number.

// Print:

// Number + 10
// Number - 10
// Number × 2
// Number ÷ 2
import java.util.Scanner;

public class TakingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========Taking Number from User=============");
        System.out.println("Enter a Number");
        int num = sc.nextInt();

        System.out.println("=========Performing Arithmatic Operation============");
        System.out.println("Addition" + (num + 10));
        System.out.println("Subtraction  " + (num - 10));
        System.out.println("Multiply  " + (num * 2));
        System.out.println("Divison " + (num / 2));

        sc.close();
    }

}
