// 💻 Now YOU code it

// Create:

// int[] marks = {50, 60, 70};

// Then:

// Create sum
// Use a for loop
// Add every mark to sum
// Calculate average
// Print both

// Your target output:

// Total Marks: 180
// Average Marks: 60
public class Average {
    public static void main(String[] args) {
        int[] marks = { 50, 60, 70 };

        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        int average = sum / marks.length;

        System.out.println("Sum of Marks: " + sum);
        System.out.println("Average of Marks: " + average);
    }
}