// Q5 (Challenge)

// Create:

// int[] nums = {1,2,3,4,5,6,7,8};

// Count:

// Even numbers
// Odd numbers

// Print both counts.

public class Challenge {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int even = 0;
        int odd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even++;

            } else {
                odd++;

            }

        }
        System.out.println("even" + even);
        System.out.println("Odd" + odd);
    }
}