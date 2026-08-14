// Without my help, try this:

// int[] arr = {10, 20, 30, 40, 50};

// Find:

// How many elements are between 15 and 45?

// Expected Output:

// 20
// 30
// 40

// Count = 3

// Hint:

// A number must satisfy TWO conditions:
// greater than 15
// AND
// less than 45

// Think about which operator joins two conditions:

// &&
public class NumberBetween {
    public static void main(String[] args) {
        int[] arr ={10, 20, 30, 40, 50};
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > 15 && arr[i] < 45) {
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("Count : " + count);
    }
}
