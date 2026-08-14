// Now write the complete Java program:

// Print numbers divisible by 5
// Count them
// Find their sum

// Expected Output:

// 5
// 10
// 15
// 20
// 25
// 30

// Count = 6
// Sum = 105
public class DivisibleByFive {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 15, 20, 25, 30 };
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                System.out.println(arr[i]);
                sum = arr[i] + sum;
                count++;
            }
        }
        System.out.println(count);
        System.out.println(sum);
    }
}
