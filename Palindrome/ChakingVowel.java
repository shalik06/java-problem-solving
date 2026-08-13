// Program Yourself 🎯

// Task:

// Count vowels in:

// String s = "Programming";

// Requirements:

// 1. Create count variable
// 2. Use for loop
// 3. Use charAt()
// 4. Check a,e,i,o,u
// 5. Increment count
// 6. Print total vowels
// Hint
// int count = 0;

// for(...) {
//     char ch = s.charAt(i);

//     if(...) {
//         count++;
//     }
// }

// System.out.println(count);
public class ChakingVowel {
    public static void main(String[] args) {
        String s ="Programming";
        int count = 0;
        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println(count);

    }
    
}
