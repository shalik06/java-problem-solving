// Mini Challenge (No Hints)

// Write a program for:

// int[] arr = {10, 20, 30, 40, 50};

// Find:

// How many elements are less than 35?

// Expected output:

// 10
// 20
// 30

// Count = 3
public class LessThanTargetElement {
     public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40,50};
        int target = 35;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] < target) {
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println(count);

    }
}
