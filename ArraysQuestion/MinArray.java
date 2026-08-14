// Your Challenge

// Now write the complete program yourself:

// int[] arr = {40, 15, 90, 5, 25};

// Expected Output:

// 5
// Hint
// int min = arr[0];

// Inside loop:

// if(min > arr[i])

// Then:

// min = arr[i];

// After loop:

// System.out.println(min);
public class MinArray {
    public static void main(String[] args) {
        int[] arr = {40, 15, 90, 5, 25};
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
    
}
