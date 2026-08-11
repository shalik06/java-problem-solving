// Q4 - Factorial

// Create:

// public static int factorial(int n)

// Example:

// factorial(5)

// Calculation:

// 5 × 4 × 3 × 2 × 1 = 120

// Output:

// 120

// 💡 Hint: Use a for loop.
public class Factorial {
    public static int factorial(int n) {
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact * i;
        }
        return fact;

        
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    
}
