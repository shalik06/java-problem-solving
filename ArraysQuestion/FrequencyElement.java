// Write a program to find the frequency of 10.

// Array:

// int[] arr = {10, 20, 10, 30, 10, 40};

// Target:

// int target = 10;

// Expected Output:

// Frequency of 10 = 3
// Think Before Coding

// You'll need:

// int count = 0;

// Then check:

// if(arr[i] == target)

// and increase:

// count++;
public class FrequencyElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 10, 40};
        int target = 10;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == target) {
                count++;
            }
        }
        System.out.println("Frequency of 10 : " + count);
    }
}
