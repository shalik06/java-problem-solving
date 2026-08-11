// Create:

// int[] marks = new int[5];

// Store:

// 80
// 85
// 90
// 95
// 100

// Print them using a loop.
public class ForArray {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks [0] =80;
        marks [1] =85;
        marks [2] =90;
        marks [3] =95;
        marks [4] =100;
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }
    
}
