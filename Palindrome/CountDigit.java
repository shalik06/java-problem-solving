// Your Next Coding Challenge

// Write the complete Java program yourself.

// Task

// Count digits in:

// String s = "Java123";

// Requirements:

// 1. Create String variable
// 2. Create count variable
// 3. Use for loop
// 4. Use charAt()
// 5. Check:
//    ch >= '0' && ch <= '9'
// 6. Increment count
// 7. Print count
// Hint
// char ch = s.charAt(i);

// and

// if(ch >= '0' && ch <= '9')
public class CountDigit {
    public static void main(String[] args) {
        String s ="Java123";
        int count =0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9') {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
