public class UniqueElement {
    public class UniqueElements {
        public static void main(String[] args) {

            int[] arr = { 2, 4, 2, 6, 8, 4, 9 };

            for (int i = 0; i < arr.length; i++) {

                int count = 0;

                for (int j = 0; j < arr.length; j++) {

                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                if (count == 1) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
