// Now try writing the Right Rotation program yourself.

// Hints:

// int temp = arr[arr.length - 1];

// Loop:

// for(int i = arr.length - 1; i > 0; i--)

// Inside loop:

// arr[i] = ?

// After loop:

// arr[0] = temp;
public class RightRotation {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int temp = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
