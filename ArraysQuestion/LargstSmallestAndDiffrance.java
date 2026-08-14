// Next Challenge (Coding + Logic)

// Array:

// int[] arr = {3, 7, 1, 9, 4};

// Find:

// Largest Adjacent Sum
// Smallest Adjacent Sum
// Difference

// Expected Output:

// Largest Adjacent Sum = 13
// Smallest Adjacent Sum = 8
// Difference = 5

// 🫡 Try to write one program that finds all three values.

// Hint:

// int largestSum = arr[0] + arr[1];
// int smallestSum = arr[0] + arr[1];
public class LargstSmallestAndDiffrance {
    public static void main(String[] args) {
        int[] arr = { 3, 7, 1, 9, 4 };
        int largestsum = arr[0] + arr[1];
        int smallestsum = arr[0] + arr[1];
        for (int i = 0; i < arr.length - 1; i++) {
            int sum = arr[i] + arr[i + 1];
            // System.out.println(sum);

            if (sum > largestsum) {
                largestsum = sum;
            }
            if (sum < smallestsum) {
                smallestsum = sum;
            }
        }
        int diffrance = largestsum - smallestsum;

        System.out.println("Largest Sum = " + largestsum);
        System.out.println("Smallest sum = " + smallestsum);
        System.out.println("Diffrance of Sum = " + diffrance);
    }
}
