// Now write the program.

// Expected Output:

// Positive Numbers:
// 10
// 20
// 15

// Positive Count = 3

// Negative Numbers:
// -5
// -8
// -2

// Negative Count = 3
// Hint

// Positive:

// if(arr[i] > 0)

// Negative:

// if(arr[i] < 0)

// Use:

// positiveCount++;
// negativeCount++;

// where needed.
public class NumIsPositiveOrNegative {
    public static void main(String[] args) {
        int[] arr = { 10, -5, 20, -8, 15, -2 };
        int positiveCount = 0;
        int negativeCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {

                positiveCount++;
                System.out.println(arr[i]);
            } else if (arr[i] < 0) {

                negativeCount++;
                System.out.println(arr[i]);
            }

        }
        System.out.println("Positive Count : " + positiveCount);
        System.out.println("Negative Count : " + negativeCount);
    }
}
