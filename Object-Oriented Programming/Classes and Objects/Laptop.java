// This one is slightly harder.

// Requirements

// Create a class:

// Laptop
// Variables
// String brand;
// int ram;
// String processor;
// int price;
// Constructor

// Initialize all four variables.

// Methods
// display()
// Print all laptop details.
// checkGamingLaptop()

// If RAM >= 16, print:

// Gaming Laptop

// Otherwise print:

// Normal Laptop
// checkBudget()

// If price >= 80000, print:

// High-End Laptop

// Otherwise print:

// Budget Laptop
// In main()

// Create 3 laptop objects, for example:

// Dell, 16 GB, Intel i7, 90000
// HP, 8 GB, Intel i5, 55000
// Lenovo, 32 GB, Ryzen 9, 120000

// Call all methods for each object.
public class Laptop {
    String brand;
    int ram;
    String processor;
    int price;

    Laptop(String b, int r, String p,  int i){
        brand = b;
        ram = r;
        processor = p;
        price = i;

    }
    void display(){
        System.out.println("Brand name: " + brand);
        System.out.println("Laptop RAM: " + ram);
        System.out.println("Laptop Processor: " + processor);
        System.out.println("Laptop Price: " + price);
        System.out.println("------------------------------------");
    }
     void checkGamingLaptop(){
        if (ram>=16) {
            System.out.println("Gamming Laptop");
            
        }else{
            System.out.println("Normal Laptop");
        }

     }
     void checkBudget(){
        if (price>=80000) {
            System.out.println("High-End Laptop");
            
        }else{
            System.out.println("Budget Laptop");
        }
     }
     public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell", 16 , "Intel i7", 90000);
        Laptop l2 = new Laptop("HP", 8, "Intel i5", 55000);
        Laptop l3 = new Laptop("Lenvo", 32, "Ryzen 9", 120000);

        l1.display();
        l1.checkGamingLaptop();
        l1.checkBudget();

        l2.display();
        l2.checkGamingLaptop();
        l2.checkBudget();

        l3.display();
        l3.checkGamingLaptop();
        l3.checkBudget();
     }


    
}
