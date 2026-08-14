// int[] arr = {5, 10, 5, 20, 10, 5};


// int target = 10;
// int count = 0;

// Complete:

// for (int i = 0; i < arr.length; i++) {


//     if (____________) {
//         count++;
//     }
// }
 public class Frequency {
    public static void main(String[] args) {
        int[] arr = {5, 10, 5, 20, 10, 5};
        int target = 10;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == target) {
                count++;
            }
        }
        System.out.println(count);
    }
 }