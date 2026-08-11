// Take a number.

// Count from 1 to that number, but:

// If the number is divisible by 3, print:
// Fizz
// If divisible by 5, print:
// Buzz
// If divisible by both 3 and 5, print:
// FizzBuzz

// Otherwise, print the number.

import java.util.Scanner;
public class Bonous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            if (i % 3 == 0){
                System.out.println("Fizz");
            }
           if (i % 5 == 0) {
            System.out.println("Buzz");
           }
           if ((i % 3 == 0) &&(i % 5 == 0)) {
            System.out.println("FizzBuzz");
            
           }
           System.out.println(i);
        }
        sc.close();
    }
    
}
