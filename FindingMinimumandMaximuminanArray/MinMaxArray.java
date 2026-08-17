// 💻 Now coding practice

// Write the program yourself.

// Requirements:

// int[] arr = {35, 12, 90, 7, 45, 60};

// Create:

// int max
// int min

// Use a for loop and find both.

// Finally print:

// Maximum: 90
// Minimum: 7
public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = { 35, 12, 90, 7, 45, 60 };
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}