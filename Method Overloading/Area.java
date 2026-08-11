// Q3

// Create:

// area(int side)

// Return square area.

// Create:

// area(int length,int width)

// Return rectangle area.

public class Area {
    public static int area(int side) {
        return side*side;
        
    }
    public static int area(int length, int width) {
        return length*width;
        
    }
    public static void main(String[] args) {
        System.out.println(area(4));
        System.out.println(area(5, 3));
    }
}
