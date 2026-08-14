public class MostFrequency {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 5, 20, 10, 5 };

        int mostFrequent = arr[0];
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                mostFrequent = arr[i];
                maxCount = count;
            }
        }
        System.out.println("Most Frequent = " + mostFrequent);
        System.out.println("Frequency = " + maxCount);
    }

}
