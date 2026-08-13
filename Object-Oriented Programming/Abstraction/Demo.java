// Coding Challenge 🔥

// Write this program:

// abstract class Vehicle

// Constructor:

// Vehicle(){
//     System.out.println("Vehicle Constructor");
// }

// Abstract Method:

// abstract void start();

// Normal Method:

// void stop(){
//     System.out.println("Vehicle Stopped");
// }

// Create child class:

// class Car extends Vehicle

// Implement:

// void start()

// Print:

// Car Started

// In main:

// Car c1 = new Car();

// c1.start();
// c1.stop();
abstract class Vehicle{
    Vehicle(){
     System.out.println("Vehicle Constructor");
}
   abstract void start();
   void stop(){
    System.out.println("Vehicle Stopped");
   }

}
class car extends Vehicle{
    void start(){
        System.out.println("car Started");
    }
}

public class Demo {
    public static void main(String[] args) {
        car c1 = new car();

        c1.start();
        c1.stop();
    }
    
}
