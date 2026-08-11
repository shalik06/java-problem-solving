// Q3 - isAdult()

// Write:

// public static boolean isAdult(int age)

// Rules:

// Return true if age >= 18
// Otherwise return false

// Example:

// System.out.println(isAdult(20));
// System.out.println(isAdult(15));

// Expected output:

// true
// false
public class isAdult {
    public static boolean isAdult(int age) {
        if (age >=18) {
            return true;
            
        }else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        System.out.println(isAdult(20));
        System.out.println(isAdult(15));
    }
    
}
