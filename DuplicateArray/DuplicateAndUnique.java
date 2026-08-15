// Given:

// int[] arr = {10, 20, 10, 30, 40, 20, 50};

// Write a Java program that prints:

// Duplicate elements:
// 10
// 20

// Unique elements:
// 30
// 40
// 50
// Rules

// Use only:

// int[]
// for loops
// if
// count
// System.out.println

// ❌ No HashSet
// ❌ No ArrayList
// ❌ No Streams
public class DuplicateAndUnique {
    public static void main(String[] args) {

        int[] arr = { 10, 20, 10, 30, 40, 20, 50 };

        for (int i = 0; i < arr.length; i++) {

            boolean duplicate = false;
            int count = 0;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                }
            }

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > 1 && duplicate == false) {
                System.out.println("Duplicate Element: " + arr[i]);
            }

            if (count == 1) {
                System.out.println("Unique Element: " + arr[i]);
            }
        }
    }
}