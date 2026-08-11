// Q1 - Find Minimum

// Create a method:

// public static int min(int a, int b)

// Return the smaller number.

// Example:

// System.out.println(min(25, 10));

// Output:

// 10

// 💡 Hint: Use an if-else statement. (Don't use Math.min() this time.)
public class MIn {

    public static int min(int a, int b) {
    

    if (a < b) {
         return a ;
    } else {
     return b;
    }

}
public static void main(String[] args) {
    
    System.out.println(min(25, 10));
}
}
