// Q4

// Take age.

// If age is greater than or equal to 18, print the boolean result.

// (Hint: Don't use if yet. Just print the comparison.)
import java.util.Scanner;
public class Comprassion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = sc.nextInt();

        System.out.println(age >=18);

        sc.close();
    }
    
}
