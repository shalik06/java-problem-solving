// Q3

// Create:

// int[] nums = {50,20,80,40,60};

// Print the smallest number.
public class Min {
    public static void main(String[] args) {
        int[] nums = {50,20,80,40,60};
        int min = nums[0];
        for(int i = 1; i<nums.length;i++){
            if (nums[i]<min) {
                min = nums[i];
            }
        }
        System.out.println(min);

    }
    
}
