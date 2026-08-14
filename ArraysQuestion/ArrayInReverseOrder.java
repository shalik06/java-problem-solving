// Now write a program to print an array in reverse order.

// Array:

// int[] arr = {10, 20, 30, 40, 50};

// Expected Output:

// 50
// 40
// 30
// 20
// 10
// Hint

// Remember this loop from earlier:

// for(int i = arr.length - 1; i >= 0; i--)
public class ArrayInReverseOrder {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        for(int i = arr.length -1; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
}
