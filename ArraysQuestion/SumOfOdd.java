// Now let's do the opposite.

// Write a program for:

// Sum of Odd Numbers

// Array:

// int[] arr = {10, 15, 20, 25, 30};

// Expected:

// Odd Numbers:
// 15
// 25

// Sum of Odd Numbers = 40
public class SumOfOdd {
      public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] % 2 !=0) {
                sum =  sum + arr[i];
                System.out.println(arr[i]);
            }
        }
        System.out.println("Sum of Odd Number = " + sum);
    }
}
