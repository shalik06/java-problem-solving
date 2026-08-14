// Now write a program to copy one array into another.

// Input:

// int[] arr1 = {10, 20, 30, 40, 50};

// Create:

// int[] arr2 = new int[arr1.length];

// Copy all elements from arr1 to arr2.

// Then print arr2.

// Expected Output
// 10
// 20
// 30
// 40
// 50
public class CopyArray {
    public static void main(String[] args) {
        int[] arr1 ={10, 20, 30, 40, 50};
        int[] arr2 =new int[5];
        for(int i = 0; i < arr1.length; i++){
           arr2[i] = arr1[i];
            System.out.println(arr2[i]);
        }
    }
}