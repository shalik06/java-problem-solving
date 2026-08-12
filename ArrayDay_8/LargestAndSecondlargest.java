// Your challenge:

// int[] arr = {40, 10, 70, 20, 90, 30};

// Create:

// int largest = arr[0];
// int secondLargest = arr[0];

// Then use a loop and these two ideas:

// 1. If current > largest
//    → secondLargest = largest
//    → largest = current

// 2. Else if current > secondLargest
//    → secondLargest = current
public class LargestAndSecondlargest {
    public static void main(String[] args) {
        int[] arr = {40, 10, 70, 20, 90, 30};
        int largest = arr[0];
        int secondlargest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondlargest ) {
                secondlargest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondlargest);
    }
}