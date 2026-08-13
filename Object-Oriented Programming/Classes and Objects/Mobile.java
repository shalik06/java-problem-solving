// Q1 - Mobile

// Create a class Mobile.

// Variables:

// String brand;
// int price;

// Constructor:

// Mobile(String b, int p)

// Method:

// void display()

// Create 2 mobiles and print their details.
public class Mobile {
    String brand;
    int price;
    Mobile(String b, int p){
        brand = b;
        price = p;
    }
    void display(){
        System.out.println("Brand Name: " + brand);
        System.out.println("Price:" + price);
        System.out.println("------------------------");
    }
    void checkCategory() {
    if (price >= 70000) {
        System.out.println("Premium Phone");
    } else {
        System.out.println("Budget Phone");
    }
}
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Vivo V23", 45000);
        Mobile m2 = new Mobile("Samsung S26", 95000);
        m1.display();
        m1.checkCategory();
        m2.display();
        m2.checkCategory();
    }
    
}
