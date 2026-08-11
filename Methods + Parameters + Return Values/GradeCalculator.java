//  Q3 - Grade Calculator

// Create:

// public static String getGrade(int marks)

// Rules:

// 90 or above → "A"
// 75–89 → "B"
// 60–74 → "C"
// Below 60 → "Fail"

// Example:

// System.out.println(getGrade(82));

// Output:

// B
public class GradeCalculator {
    public static String getgrade(int marks) {
        if (marks<=90) {
            return "A";
            
        }
        if (marks <=75-89) {
            return "B";
            
        }
        if (marks <= 60-74) {
            return "C";
            
        }
        if (marks >=60) {
            return "Fail";
            
        }else{
            return "Invalid input";
        }
        
    }
    public static void main(String[] args) {
        System.out.println(getgrade(82));
    }
    
}
