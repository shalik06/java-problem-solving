// Q5

// Take a number.

// Print its multiplication table.

// Example:

// Enter number: 7

// 7 x 1 = 7
// 7 x 2 = 14
// ...
// 7 x 10 = 70
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(num*i);

        }
        sc.close();
    }
    
}
