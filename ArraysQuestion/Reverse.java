// Write the complete program:

// int[] arr = {10,20,30,40,50};

// Output:

// 50
// 40
// 30
// 20
// 10

// Use your reverse loop:
public class Reverse {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        for(int i = arr.length -1; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
}
