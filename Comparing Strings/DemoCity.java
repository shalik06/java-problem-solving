// Q2

// Create:

// String city = "Delhi";

// Check if it equals "Mumbai".

// Print:

// "Same City" or
// "Different City"
import java.util.Scanner;
public class DemoCity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter City:");
        String cityy = sc.nextLine();
        String city = "Delhi";
        if (cityy.equals(city)) {
            System.out.println("Smae city: ");
            
        }
        else{
            System.out.println("Diffetrent City:");
        }
        sc.close();
    }
    
}
