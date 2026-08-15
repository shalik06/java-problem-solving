public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 10, 30, 20, 40 };

        for (int i = 0; i < arr.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {

                if (arr[i] == arr[j]) {
                    duplicate = true;
                }
            }

            if (duplicate == false) {
                System.out.println(arr[i]);
            }
        }
    }
}