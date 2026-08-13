// Teacher's Challenge (No Hand-Holding)

// Now let's see if you can apply constructor overloading yourself.

// Create a class:

// Laptop

// Variables:

// String brand;
// int ram;
// double price;

// Create 4 constructors:

// Laptop()
// Laptop(String brand)
// Laptop(String brand, int ram)
// Laptop(String brand, int ram, double price)

// Create:

// void display()

// Print all details.

// In main() create:

// Laptop l1 = new Laptop();
// Laptop l2 = new Laptop("Dell");
// Laptop l3 = new Laptop("HP", 16);
// Laptop l4 = new Laptop("Lenovo", 32, 120000);

// Call display() for all four objects.
public class Laptop {
    String brand;
    int ram;
    double price;
    Laptop(){
        brand = "Unknown";
        ram = 0;
        price = 0;
    }
    Laptop(String brand){
        this.brand = brand;
    }
    Laptop(String brand, int ram){
        this.brand = brand;
        this.ram = ram;
    }
    Laptop(String brand, int ram, double price){
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }
    void display(){
        System.out.println("Laptop Brand: " + brand);
        System.out.println("Laptop RAM: " + ram );
        System.out.println("Laptop Price: " + price);
        System.out.println("================================");
    }
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop("Dell");
        Laptop l3 = new Laptop("HP", 16);
        Laptop l4 = new Laptop("Lenovo", 32, 120000);

        l1.display();
        l2.display();
        l3.display();
        l4.display();
        
    }
}
