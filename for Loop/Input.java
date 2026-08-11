// Q4

// Take a number n.

// Print:

// 1 2 3 ... n
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        for(int i = 1; i <=num; i++){
            System.out.println(i);

        }
        sc.close();
    }
    
}
