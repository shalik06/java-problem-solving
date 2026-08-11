// Create:

// public static boolean isAdult(int age)

// If age is 18 or above

// Return:

// true

// Otherwise return:

// false

// Example:

// System.out.println(isAdult(20));

// Output:

// true
public class Bonus {
    public static boolean isAdult(int age) {
        if (age>=18) {
            return true;
            
        }else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        System.out.println(isAdult(20));
    }
    
}
