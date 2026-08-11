//  Q2 - Positive or Not

// Create:

// public static boolean isPositive(int n)

// Return:

// true if the number is positive.
// false otherwise.

// Example:

// System.out.println(isPositive(15));

// Output:

// true
public class PositiveorNot {
    public static boolean ispositive(int n) {
        if (n >=0) {
            return true;
            
        }else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        System.out.println(ispositive(15));
    }
    
}
