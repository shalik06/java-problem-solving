// Without any hints:

// int[] arr = {10, 20, 30, 40, 50};

// Find:

// How many elements are divisible by 10?

// Expected:

// 10
// 20
// 30
// 40
// 50

// Count = 5

// And after that:

// How many elements are divisible by 20?

// Expected:

// 20
// 40

// Count = 2
public class DividedBy {
    public static void main(String[] args) {
        int[] arr ={10, 20, 30, 40, 50};
        int count = 0;
        int target =20;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] % target == 0) {
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("Count : " + count);
    }
}