// Now write the complete program for:

// Sum of Even Numbers in an Array

// Array:

// int[] arr = {10, 15, 20, 25, 30};

// Expected Output:

// Sum of Even Numbers = 60
public class SumOfEven {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] % 2 ==0) {
                sum =  sum + arr[i];
            }
        }
        System.out.println("Sum of Even Number = " + sum);
    }
}
