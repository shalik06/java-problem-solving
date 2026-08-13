// Next Mini Challenge (Without Help)

// Modify the condition so the program counts both:

// a e i o u
// A E I O U

// Example:

// String s = "PrOgrAmmIng";

// Output should still be:

// 3
// Question

// What two extra vowels do you need to add for:

// A
// E
// I
// O
// U

// inside the if condition?
public class First {
      public static void main(String[] args) {
        String s ="PrOgrAmmIng";
        int count = 0;
        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
                count++;
            }
        }
        System.out.println(count);

    }
}
