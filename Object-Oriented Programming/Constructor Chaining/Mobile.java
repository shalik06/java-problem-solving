// Constructor Chaining Challenge

// Create a class:

// Mobile

// Variables:

// String brand;
// int ram;
// double price;
// Constructor 1
// Mobile()

// Call:

// this("Unknown");
// Constructor 2
// Mobile(String brand)

// Call:

// this(brand, 8);
// Constructor 3
// Mobile(String brand, int ram)

// Call:

// this(brand, ram, 30000);
// Constructor 4
// Mobile(String brand, int ram, double price)

// This constructor should assign all values using this.

// Method
// void display()

// Print all details.

// In main()

// Create:

// Mobile m1 = new Mobile();
// Mobile m2 = new Mobile("Samsung");
// Mobile m3 = new Mobile("Vivo", 12);
// Mobile m4 = new Mobile("iPhone", 16, 120000);

// Call display() for all four.
public class Mobile {
    String brand;
    int ram;
    double price;
    Mobile(){
        this("Unknown");
    }
    Mobile(String brand){
        this(brand, 8);

    }
    Mobile(String brand, int ram){
        this(brand,ram,30000);

    }
    Mobile(String brand, int ram, double price){
        this.brand = brand;
        this.ram = ram;
        this.price = price;

    }
    void display(){
        System.out.println("Mobile Brand Name: " + brand);
        System.out.println("Mobile RAM: " + ram);
        System.out.println("Mobile Price: " + price);
        System.out.println("-----------------------------------------");
    }
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile("Samsung");
        Mobile m3 = new Mobile("Vivo", 12);
        Mobile m4 = new Mobile("iPhone", 16, 120000);

        m1.display();
        m2.display();
        m3.display();
        m4.display();
    }
    
}
