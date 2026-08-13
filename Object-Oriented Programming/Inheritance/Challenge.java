// Inheritance Challenge 3 (Variables + Methods)

// Write a program with:

// Parent Class
// class Vehicle

// Variables:

// String brand = "BMW";
// int speed = 220;

// Method:

// void displayVehicle()

// Print brand and speed.

// Child Class
// class Car extends Vehicle

// Method:

// void drive()

// Print:

// Car is driving...
// In main()
// Car c1 = new Car();

// Print:

// c1.brand
// c1.speed

// Then call:

// c1.displayVehicle();
// c1.drive();
class Vehicle {
    String brand = "BMW";
    int speed = 220;

    void displayVehicle() {
        System.out.println("Car Brand Name: " + brand);
        System.out.println("Car Speed: " + speed);
    }

}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is Driving...");
    }
}

public class Challenge {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.brand);
        System.out.println(c1.speed);

        c1.displayVehicle();
        c1.drive();
    }

}
