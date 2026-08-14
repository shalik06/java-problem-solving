// Write a program to perform:

// Left Shift

// Array:

// int[] arr = {10, 20, 30, 40, 50};

// Expected Output:

// 20
// 30
// 40
// 50
// 0
// Hint

// Inside the loop:

// arr[i] = arr[i + 1];

// And after the loop:

// arr[arr.length - 1] = 0;
public class LestShift {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
