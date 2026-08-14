// Professional Search Program

// Write a program for:

// int[] arr = {10,20,30,40,50};
// int target = 60;

// Requirements:

// If found:
//     Found Target: 60

// If not found:
//     Not Found
// Hint
// boolean found = false;

// Inside loop:

// if(arr[i] == target)

// Then:

// found = true;

// After loop:

// if(!found)

// Print:

// System.out.println("Not Found");
public class ProfessionalSearch {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int target = 60;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Found Target: " + target);
        } else {
            System.out.println("Not Found");
        }
    }
}
