// Search an Element in Array

// This is your first real DSA-style problem.

// Given:

// int[] arr = {10, 20, 30, 40, 50};

// Suppose we want to search:

// int target = 30;

// Question:

// Is 30 present in the array?

// Answer:

// Yes ✅
// Logic

// Loop through the array.

// Check:

// if(arr[i] == target)

// If found:

// System.out.println("Found");
public class SearchElementArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == target) {
                System.out.println("Found Target: " + target);
                break;
            }
        }
    }
}
