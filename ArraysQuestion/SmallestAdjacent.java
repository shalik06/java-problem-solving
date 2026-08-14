// Write a program to find the Smallest Adjacent Sum.

// Array:

// int[] arr = {5, 8, 2, 10, 3};

// Expected Output:

// Smallest Adjacent Sum = 10

// Hints:

// int smallestSum = arr[0] + arr[1];

// Loop:

// for(int i = 0; i < arr.length - 1; i++)

// Inside:

// int sum = arr[i] + arr[i + 1];
public class SmallestAdjacent {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 10, 3};
        int smallestsum = arr[0] + arr[1];
        for( int i = 0 ; i < arr.length -1; i++){
            int sum = arr[i] + arr[i + 1];
            if (sum < smallestsum) {
                smallestsum = sum;
            }
        }
        System.out.println("Smallest Sum = " + smallestsum);
    }
}