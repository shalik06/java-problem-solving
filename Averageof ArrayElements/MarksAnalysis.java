// 💻 Now let's code it

// This time we'll use three counters:

// int aboveCount = 0;
// int belowCount = 0;
// int equalCount = 0;

// Inside the loop, think about the three possibilities:

// marks[i] > average  → aboveCount++
// marks[i] < average  → belowCount++
// marks[i] == average → equalCount++
// 🎯 Your task

// Create:

// public class MarksAnalysis

// with:

// int[] marks = {70, 80, 80, 60, 70};
// int average = 70;

// Print:

// Above Average: 2
// Below Average: 1
// Equal to Average: 2
public class MarksAnalysis {
    public static void main(String[] args) {
        int[] marks = { 70, 80, 80, 60, 70 };
        int average = 70;

        int abovecount = 0;
        int belowcount = 0;
        int equalcount = 0;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > average) {
                abovecount++;
            }
            else if (marks[i] < average) {
                belowcount++;
            }
           else{
            equalcount++;
           }
        }
        System.out.println("Above Average : " + abovecount);
        System.out.println("Below Average : " + belowcount);
        System.out.println("Equal Average : " + equalcount);
    }
}
