// Now write the complete Java program for:

// Sum of Positive Numbers

// Expected Output:

// Positive Numbers:
// 15
// 2
// 6

// Sum of Positive Numbers = 23
// Hint

// You'll need:

// int sum = 0;

// And inside the positive condition:

// sum = sum + arr[i];
public class SumOfPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {-3, 15, 0, -5, 2, 0, 6};
        int sum = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > 0) {
                sum = sum + arr[i];
                count++;
                System.out.println(arr[i]);
            }
        }
        System.out.println(sum);
        System.out.println("Total Positive Number : " + count);
    }
}
