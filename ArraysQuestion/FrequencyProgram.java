// Write a program for:

// int[] arr = {5, 8, 5, 2, 5, 8, 1};
// int target = 8;

// Expected Output:

// Frequency of 8 = 2

// You already know the logic.
public class FrequencyProgram {
    public static void main(String[] args) {
        int[] arr = {5, 8, 5, 2, 5, 8, 1};
        int target = 8;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == target) {
                count++;
            }
        }
        System.out.println("Frequency of 8 : " + count);
    }
}

