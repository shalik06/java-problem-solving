// Problem 1 — Unique Array

// Write a program that prints only the elements that occur exactly once.

// Given:

// int[] arr = {5, 8, 5, 2, 9, 8, 1};

// Expected output:

// 2
// 9
// 1
// Rules

// You cannot use:

// HashSet
// ArrayList
// Streams

// Use only:

// arrays
// for loops
// if-else
// boolean
public class UniqueArray {
    public static void main(String[] args) {
        int[] arr = {5, 8, 5, 2, 9, 8, 1};
        for(int i = 0; i < arr.length; i++){
           int count = 0;
           for(int j = 0; j < arr.length; j++){
            if (arr[i] == arr[j]) {
                count++;
            }
           }
           if (count == 1) {
            System.out.println(arr[i]);
           }
        }
    }
}

