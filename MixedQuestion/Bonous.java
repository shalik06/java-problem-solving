// ⭐ Bonus Challenge

// Create:

// String username = "admin";
// String password = "java123";

// If both are correct, print:

// Login Successful

// Otherwise:

// Login Failed
import java.util.Scanner;
public class Bonous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username:");
        sc.nextLine();
        String username = "admin";
        System.out.println("Enter password :");
        sc.nextLine();
        String password = "java123";
        if (username.equals("admin")&& (password.equals("java123")) ) {
            System.out.println("Login Successful");
            
        }
        else{
            System.out.println("Login Failed");
        }
        sc.close();
    }


    
}