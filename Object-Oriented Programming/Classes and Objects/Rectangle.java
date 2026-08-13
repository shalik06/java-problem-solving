// Question 5 – Rectangle

// Create a class named:

// Rectangle
// Instance Variables
// double length;
// double width;
// Constructor

// Create a constructor:

// Rectangle(double length, double width)

// Initialize the instance variables using this.

// Method 1: display()

// Print:

// Length: 10.0
// Width: 5.0
// Method 2: area()

// Calculate and return the area.

// Formula:

// Area = length × width

// ⚠️ This method should return a double.

// Method 3: perimeter()

// Calculate and return the perimeter.

// Formula:

// Perimeter = 2 × (length + width)

// ⚠️ This method should return a double.

// Method 4: checkShape()

// If:

// length == width → Print:
// Square

// Otherwise print:

// Rectangle
// In main()

// Create two objects:

// Rectangle r1 = new Rectangle(10, 5);
// Rectangle r2 = new Rectangle(8, 8);

// Now print the details like this:

// r1.display();
// System.out.println("Area: " + r1.area());
// System.out.println("Perimeter: " + r1.perimeter());
// r1.checkShape();

// System.out.println();

// r2.display();
// System.out.println("Area: " + r2.area());
// System.out.println("Perimeter: " + r2.perimeter());
// r2.checkShape();
public class Rectangle {
    double length;
    double width;
     
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    void display(){
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("--------------------------------");
    }
      double area(){
        return length*width;
    }

    double perimeter(){
        return 2 * (length + width);

    }
    void checkShape(){
        if (length == width) {
            System.out.println("Square");
            
        }else{
            System.out.println("Rectangle");
        }
    }
    public static void main(String[] args) {
     Rectangle r1 = new Rectangle(10, 5);
     Rectangle r2 = new Rectangle(8, 8);

    

    r1.display();
    System.out.println("Area: " + r1.area());
    System.out.println("Perimeter: " + r1.perimeter());
    r1.checkShape();

    System.out.println();

    r2.display();
    System.out.println("Area: " + r2.area());
    System.out.println("Perimeter: " + r2.perimeter());
    r2.checkShape();
        
    }

    
}
