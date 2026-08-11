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
        if (password.equals("java123") && (username.equals("admin"))) {
            System.out.println("Login Successful");   
        }else{
            System.out.println("Ivalid Username or pasword");
        }
        sc.close();
    }
    
}
