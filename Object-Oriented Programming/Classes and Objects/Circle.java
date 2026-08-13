// Question 6 – Circle

// Create a class named:

// Circle
// Instance Variable
// double radius;
// Constructor

// Create:

// Circle(double radius)

// Use this.radius = radius;

// Method 1: display()

// Print:

// Radius: 7.0
// Method 2: area()

// Calculate and return the area.

// Formula:

// Area = π × radius × radius

// In Java:

// Math.PI

// can be used for π.

// Return type:

// double
// Method 3: circumference()

// Calculate and return the circumference.

// Formula:

// Circumference = 2 × π × radius

// Return type:

// double
// Method 4: checkCircleSize()

// If radius is:

// radius >= 10

// Print:

// Large Circle

// Otherwise print:

// Small Circle
// In main()

// Create:

// Circle c1 = new Circle(7);
// Circle c2 = new Circle(12);

// Then:

// c1.display();
// System.out.println("Area: " + c1.area());
// System.out.println("Circumference: " + c1.circumference());
// c1.checkCircleSize();

// System.out.println();

// c2.display();
// System.out.println("Area: " + c2.area());
// System.out.println("Circumference: " + c2.circumference());
// c2.checkCircleSize();
public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }

    void checkCircleSize() {
        if (radius >= 10) {
            System.out.println("Large Circle");

        } else {
            System.out.println("Small Circle");
        }
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(7);
        Circle c2 = new Circle(12);

        c1.display();
        System.out.println("Area: " + c1.area());
        System.out.println("Circumference: " + c1.circumference());
        c1.checkCircleSize();
        System.out.println();
        c2.display();
        System.out.println("Area: " + c2.area());
        System.out.println("Circumference: " + c2.circumference());
        c2.checkCircleSize();
    }

}
