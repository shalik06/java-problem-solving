// Final Bonus Challenge

// This challenge combines everything you've learned.

// Write these two methods:

// public static int add(int a, int b)

// and

// public static int square(int n)

// Then in main():

// int sum = add(10, 5);
// int answer = square(sum);

// System.out.println(answer);
// Expected Output
// 225

// Because:

// 10 + 5 = 15

// 15 × 15 = 225
public class Bonus {
    public static int add(int a, int b) {
        return a + b;
        
    }
    public static int square(int n) {
        return n*n;
        
    }
    public static void main(String[] args) {
        int sum = add(10, 5);
        int answer = square(sum);
        System.out.println(answer);
    }
    
}
