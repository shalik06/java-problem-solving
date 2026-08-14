// Write a program to print all elements of an array.

// Array:

// int[] arr = {10,20,30,40,50};

// Expected Output:

// 10
// 20
// 30
// 40
// 50
public class FirstArray {

    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}