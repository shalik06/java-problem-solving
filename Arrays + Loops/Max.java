// Q2

// Create:

// int[] nums = {50,20,80,40,60};

// Print the largest number.
public class Max {
    public static void main(String[] args) {
        int [] nums = {50,20,80,40,60};
        int max = nums  [0];
        for(int i= 1; i<nums.length;i++){
            if ( nums [i]> max){
                max = nums[i];
            }
        }
        System.out.println(max);
    }
    
}
