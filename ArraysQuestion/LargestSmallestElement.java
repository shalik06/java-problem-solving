// Now write a program that finds:

// Largest Element
// Smallest Element
// Difference

// Array:

// int[] arr = {10, 50, 20, 80, 30};

// Expected Output:

// Largest = 80
// Smallest = 10
// Difference = 70
// Hint

// You already know both algorithms:

// int largest = arr[0];
// int smallest = arr[0];

// Then update them inside the loop.

// After the loop:

// difference = largest - smallest;
public class LargestSmallestElement {
    public static void main(String[] args) {
        int[] arr = {10, 50, 20, 80, 30};
        int largest = arr[0];
        int smallest = arr[0];
        int diffrence = 0;
        for(int i = 0; i < arr.length; i++){
            if (largest < arr[i]) {
                
                largest = arr[i];
                
            }
            else if (arr[i] < smallest) {
                smallest = arr[i];

            }
        }
        diffrence = largest - smallest;
                
        System.out.println(largest);
        System.out.println(smallest);
        System.out.println(diffrence);
    }
}
