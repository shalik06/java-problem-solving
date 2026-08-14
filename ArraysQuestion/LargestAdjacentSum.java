// Write a program to find the largest adjacent sum.

// Array:

// int[] arr = {5, 8, 2, 10, 3};

// Expected thinking:

// 5 + 8 = 13
// 8 + 2 = 10
// 2 + 10 = 12
// 10 + 3 = 13

// Largest Adjacent Sum = 13
// Hint

// You will need:

// int largestSum = 0;

// And the loop should run only until:

// arr.length - 1

// because you'll be using:

// arr[i] + arr[i + 1]
public class LargestAdjacentSum {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 10, 3};
        int largestsum = 0;
        
         for (int i = 0; i < arr.length - 1; i++) {
            int sum = arr[i] + arr[i + 1];
            System.out.println(sum);
            if (sum > largestsum) {
                largestsum =sum;
            }
            
        }
        System.out.println("Largest Sum = " + largestsum);
    }
}
