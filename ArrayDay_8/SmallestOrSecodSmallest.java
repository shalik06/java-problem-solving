// Now You're Ready To Code

// Your challenge:

// int[] arr = {40, 10, 70, 20, 90, 30};

// Create:

// int smallest = arr[0];
// int secondSmallest = arr[0];

// Then use the mirror logic of Second Largest:

// If current < smallest
//     secondSmallest = smallest
//     smallest = current

// Else if current < secondSmallest
//     secondSmallest = current
public class SmallestOrSecodSmallest {
    public static void main(String[] args) {
        int[] arr = {40, 10, 70, 20, 90, 30};
        int smallest = arr[0];
        int secondsmallest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < smallest) {
                secondsmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] < secondsmallest) {
                secondsmallest = arr[i];
            }
        }
        System.out.println(smallest);
        System.out.println(secondsmallest);
    }
}
