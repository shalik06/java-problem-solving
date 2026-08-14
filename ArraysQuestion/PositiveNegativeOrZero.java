// Now write the complete program that counts:

// Positive Numbers
// Negative Numbers
// Zero Numbers

// Expected Output:

// Positive Count = 3
// Negative Count = 2
// Zero Count = 2
// Hint

// You will need:

// int positiveCount = 0;
// int negativeCount = 0;
// int zeroCount = 0;

// And three conditions:

// if(arr[i] > 0)

// else if(arr[i] < 0)

// else

// Think about why else works for zero. 🧠
public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        int[] arr = {-3, 15, 0, -5, 2, 0, 6};
        int PositiveCount = 0;
        int NegativeCount = 0;
        int ZeroCount = 0;

        for(int i = 0; i < arr.length; i++){
            if (arr[i] > 0) {
                PositiveCount++;
            }
            else if (arr[i] < 0) {
                NegativeCount++;
            }
            else{
                ZeroCount++;
            }
        }
        System.out.println("Positve Count : " + PositiveCount);
        System.out.println("Negative Count : " + NegativeCount);
        System.out.println("Zero Count : " + ZeroCount);
    }
}
