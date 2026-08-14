// Challenge (Easy)

// Array:

// int[] arr = {10,20,30,40,50};

// Find:

// How many elements are greater than 25?

// Expected answer:

// 30
// 40
// 50

// Count = 3
public class GratterThanSomeElement {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40,50};
        int target = 25;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] > target) {
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println(count);

    }
}