// Challenge 2 ⭐⭐

// Create an interface:

// interface Vehicle

// Methods:

// void start();
// void stop();

// Create class:

// class Car implements Vehicle

// Implement:

// start() → Car Started
// stop() → Car Stopped

// In main:

// Car c1 = new Car();

// c1.start();
// c1.stop();
interface Vehicle{
    void start();
    void stop();
}
class Car implements Vehicle{
    public void start(){
        System.out.println("Car Started");
    }
    public void stop(){
        System.out.println("Car Stopped");
    }
}
public class Demo {
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.start();
        c1.stop();
    }
    
}
