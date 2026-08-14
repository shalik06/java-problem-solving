// Now write the complete Left Rotation program yourself.

// Use:

// int temp = arr[0];

// then

// for(...)

// then

// arr[arr.length - 1] = temp;
public class LefttRotation {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int temp = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}