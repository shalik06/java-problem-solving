// Your Challenge

// Write the complete program yourself.

// Task

// Count consonants in:

// String s = "Programming";
// Logic

// Loop through each character.

// A character is a consonant if:

// 1. It is a letter
// 2. It is NOT a vowel
// Hint

// You already know the vowel condition:

// ch == 'a' || ch == 'e' || ...

// For consonants, think:

// NOT a vowel
public class Consonant {
    public static void main(String[] args) {
        String s = "Programming";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z') &&
                    ch != 'a' &&
                    ch != 'e' &&
                    ch != 'i' &&
                    ch != 'o' &&
                    ch != 'u') {
                count++;
            }
        }
        System.out.println(count);
    }

}
