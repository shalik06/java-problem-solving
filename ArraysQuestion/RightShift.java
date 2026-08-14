// Write the complete program yourself.

// Array:

// int[] arr = {10, 20, 30, 40, 50};

// Expected Output:

// 0
// 10
// 20
// 30
// 40
// Hint

// Loop starts from:

// arr.length - 1

// and moves toward:

// 1
public class RightShift {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        for(int i =  arr.length - 1; i > 0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = 0;
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
