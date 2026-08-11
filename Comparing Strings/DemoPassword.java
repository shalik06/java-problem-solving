// Create:

// String password = "java123";

// Check if it equals "java123".

// If yes, print:

// Correct Password

// Otherwise print:

// Wrong Password
import java.util.Scanner;
public class DemoPassword {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Password :");
        String passwordd = sc.nextLine();
        String password = "java123";
        if (passwordd.equals(password)) {
            System.out.println("Correct Password");
            
        }
        else{
            System.out.println("Wrong Password");
        }
        sc.close();
    }
}