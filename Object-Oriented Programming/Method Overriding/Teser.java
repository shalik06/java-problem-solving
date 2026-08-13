// Inheritance + Overriding + super

// Write a program:

// class Vehicle

// Method:

// void start()

// Print:

// Vehicle Starting
// class Car extends Vehicle

// Override:

// void start()

// Inside it:

// super.start();

// Then print:

// Car Starting

// Add another method:

// void drive()

// Print:

// Car Driving
// In main()
// Car c1 = new Car();

// c1.start();
// c1.drive();
class Vehicle{
    void Start(){
        System.out.println("Vehicle Starting");
    }
}
class Car extends Vehicle{
    void Start(){
        super.Start();
        System.out.println("Car Starting");
    }
    void Drive(){
        System.out.println("Car Driving");
    }
}
public class Teser {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.Start();
        c1.Drive();
    }
    
}
