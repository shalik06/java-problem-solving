// 💻 Challenge: Login System

// Requirements:

// Enter Username:
// Enter Password:

// If:

// Username = admin
// Password = java123

// Output:

// Login Successful
import java.util.Scanner;
public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========Login System=========");
        System.out.println("Enter Username:");
        String username = sc.nextLine();
        System.out.println("Enter Password:");
        String password = sc.nextLine();
        if (username.equalsIgnoreCase(username)) {
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Inccroet Username");
        }
        if (password.equalsIgnoreCase(password)) {
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Inccoret Password");
        }
        sc.close();
    }
    
}
