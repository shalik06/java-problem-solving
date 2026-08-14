// Array Average

// Given:

// int[] arr = {10,20,30,40,50};

// You already know how to find the sum:

// int sum = 0;

// for(int i = 0; i < arr.length; i++){
//     sum = sum + arr[i];
// }

// Now think:

// Sum = 150
// Number of elements = 5

// Average:

// 150 ÷ 5 = 30

// So after finding the sum, create a variable:

// int average = ?

// and print:

// Average = 30
// Small Hint 🧠

// Which one looks correct?

// A) sum + arr.length

// B) sum / arr.length

// C) sum * arr.length
public class ArrayAverage {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int average = sum / arr.length;
        System.out.println(sum);
        System.out.println("Average is : " + average);
    }
}
