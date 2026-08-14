// Count Even Numbers in Array

// Given:

// int[] arr = {10, 15, 20, 25, 30};

// Even numbers:

// 10
// 20
// 30

// Count:

// 3
// Logic

// Create a counter:

// int count = 0;

// Loop through the array:

// for(int i = 0; i < arr.length; i++)

// Check:

// arr[i] % 2 == 0

// If true:

// count++;
public class Even {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30};
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
