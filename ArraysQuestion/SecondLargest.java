public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 50, 20, 80, 30};
        int largest = arr [0];
        int secondlargest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondlargest) {
                secondlargest = arr[i];
            }
        }
        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondlargest);

    }
}