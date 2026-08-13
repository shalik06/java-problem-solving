// Challenge 1 (Easy) ⭐

// Create:

// abstract class Shape

// Abstract method:

// abstract void draw();

// Normal method:

// void display(){
//     System.out.println("Displaying Shape");
// }

// Create child class:

// class Circle extends Shape

// Implement:

// draw()

// Output:

// Drawing Circle

// In main:

// Circle c1 = new Circle();

// c1.draw();
// c1.display();
abstract class Shape{
    abstract void draw();

    void display(){
        System.out.println("Displaying Shape");
    }
}
class Circle extends Shape{
   void draw(){
    System.out.println("Drawing Circle");
   }
}

public class Circles {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.draw();
        c1.display();
    }
    
}
