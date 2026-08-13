// Your First Independent Coding Challenge

// Write the complete program yourself.

// Task
// Check whether "level" is a palindrome or not.

// Requirements:

// 1. Create String original = "level"
// 2. Create String reverse = ""
// 3. Use a for loop to reverse the String
// 4. Use equals()
// 5. Print:
//    Palindrome
//    OR
//    Not Palindrome
public class Palindrome {

    public static void main(String[] args) {
        String original = "level";
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not Palindrom");
        }
    }
}