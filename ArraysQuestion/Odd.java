// Your Challenge: Count Odd Numbers Program

// Now write the complete program yourself.

// Requirements
// int[] arr = {10, 15, 20, 25, 30};

// Expected Output:

// 2
// Hint
// int count = 0;

// Loop through array:

// for(int i = 0; i < arr.length; i++)

// Check:

// arr[i] % 2 != 0

// Then:

// count++;

// Finally:

// System.out.println(count);
public class Odd {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30};
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
