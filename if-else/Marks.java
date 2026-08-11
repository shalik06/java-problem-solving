// Q3

// Take marks.

// Print:

// 90+ → A

// 80+ → B

// 70+ → C

// 60+ → D

// Else → Fail
import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks");
        int marks = sc.nextInt();
        if (marks >=90) {
            System.out.println("Grade A");
        }
        else if (marks >=80) {
            System.out.println("Grade B");
        }
        else if (marks >=70) {
            System.out.println("Grade C");
        }
        else if (marks >=60){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }
    
}
