// Next Program: Sum of Array Elements 🔥

// Given:

// int[] arr = {10,20,30,40,50};

// We want:

// 10 + 20 + 30 + 40 + 50 = 150

// Output:

// 150
// Logic

// Create a variable:

// int sum = 0;

// Loop through array:

// sum = sum + arr[i];

// After loop:

// System.out.println(sum);
public class SumArray {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
