// Your Final Coding Challenge

// Now write the complete Java program for:

// int[] arr = {4, 7, 4, 9, 7, 4, 9, 7};

// Expected:

// Most Frequent = 4
// Frequency = 3

// Second Most Frequent = 9
// Frequency = 2

// Use:

// int[]
// for
// if / else if
// variables
// no HashMap
// no ArrayList
// no sorting
public class MostFrequentOrSecondMostFrequent {
    public static void main(String[] args) {

        int[] arr = { 4, 7, 4, 9, 7, 4, 9, 7 };

        int MostFrequent = arr[0];
        int firstmostFrequency = 0;

        int SecondMostFrequent = arr[0];
        int secondmostFrequency = 0;
        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > firstmostFrequency) {

                SecondMostFrequent = MostFrequent;
                secondmostFrequency = firstmostFrequency;

                MostFrequent = arr[i];
                firstmostFrequency = count;

            } else if (count > secondmostFrequency && count < firstmostFrequency) {

                SecondMostFrequent = arr[i];
                secondmostFrequency = count;
            }
        }
        System.out.println("First MostFrequent: " + MostFrequent);
        System.out.println("First MOstFrequency: " + firstmostFrequency);

        System.out.println("============================================");

        System.out.println("Second MostFrequent: " + SecondMostFrequent);
        System.out.println("Second MOstFrequency: " + secondmostFrequency);

    }
}
