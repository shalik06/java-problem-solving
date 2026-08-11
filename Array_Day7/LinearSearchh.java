// Write a Java program for the following:

// int[] arr = {15, 25, 35, 45, 55};
// int target = 35;
// Requirements
// Search for the target using Linear Search.
// If found, print:
// Element found at index = ?
// Use:
// boolean found = false;
// If the element is not present, print:
// Element not found
// 🧠 Expected Thinking
// 15 == 35 ❌
// 25 == 35 ❌
// 35 == 35 ✅

// Output:

// Element found at index = 2
public class LinearSearchh {
    public static void main(String[] args) {
        int[] arr = {15, 25, 35, 45, 55};
        int target = 35;
        boolean found = false;
        for(int i =0; i < arr.length; i++){
            if (arr[i] == target) {
                System.out.println("Element Found At Index: " + i);
                found = true;
            }
           
        }
        if (found == false) {
            System.out.println("Element Not Found");
        }
    }
}
