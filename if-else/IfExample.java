// Q1

// Take age.

// If age is 18 or above,

// print

// Eligible to Vote
import java.util.Scanner;
public class IfExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = sc.nextInt();
        if (age >=18) {
            System.out.println("Eligible to Vote");
            
        }
        sc.close();
        
    }
    

    
}