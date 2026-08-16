// 💻 Now let's code

// Create a new class:

// AboveAverage

// Use:

// int[] marks = {60, 75, 90, 55, 80, 95};
// int average = 75;

// Your job is to write a program that prints:

// Marks above average: 3
// Hint

// You need:

// int count = 0;

// Then a for loop and:

// if (__________) {
//     count++;
// }
public class AboveAverage {
    public static void main(String[] args) {
        int[] marks = {60, 75, 90, 55, 80, 95};
        int average = 75;
        int count = 0;
        for(int i = 0; i < marks.length; i++){
            if (marks[i] > average) {
                count++;
            }
        }
        System.out.println("Above Average: " + count);
    }
}
