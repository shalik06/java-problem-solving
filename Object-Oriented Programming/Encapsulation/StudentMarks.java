// Coding Challenge 2 (Validation)

// Create a class:

// class Student

// Private variable:

// private int marks;

// Setter:

// void setMarks(int marks)

// Rule:

// Only store marks if they are between 0 and 100.
// Otherwise print:
// Invalid Marks

// Getter:

// int getMarks()
// Test
// s1.setMarks(85);
// System.out.println(s1.getMarks());

// s1.setMarks(150);
class Student{
    private int marks;
    void setMarks(int marks){
    
    if(marks >= 0 && marks <= 100){
        this.marks = marks;
    }
    else{
       System.out.println("Invalid Marks:");
    }
}
    
   int getMarks(){
    return marks;
   }
}
public class StudentMarks {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setMarks(85);
        System.out.println(s1.getMarks());

        s1.setMarks(150);
        System.out.println(s1.getMarks());
    }
    
}
