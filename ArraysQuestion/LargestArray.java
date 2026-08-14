// Largest Element in Array

// Given:

// int[] arr = {10, 50, 20, 80, 30};

// Largest number is:

// 80
// Logic

// Start by assuming:

// int max = arr[0];

// Then compare every element with max.

// If an element is larger:

// max = arr[i];

// At the end:

// System.out.println(max);
public class LargestArray {
    public static void main(String[] args) {
        int [] arr = {10, 50, 20, 80, 30};
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            } 
        }
        System.out.println(max);
    }
}
