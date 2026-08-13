// Create a class:

// Printer

// Overload a method named:

// printData()
// Method 1
// printData(String name)

// Print:

// Name: Shalik
// Method 2
// printData(int age)

// Print:

// Age: 22
// Method 3
// printData(String name, int age)

// Print:

// Name: Shalik
// Age: 22
// In main()
// Printer p = new Printer();

// p.printData("Shalik");

// p.printData(22);

// p.printData("Shalik", 22);
class Printer{
    void printData(String name){
        System.out.println("Name: " + name);

    }
    void printData(int age){
         System.out.println("Age: " + age);
    }
    void printData(String name, int age){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
public class Test {
    public static void main(String[] args) {
       Printer p = new Printer();

       p.printData("Shalik");
       p.printData(22);
       p.printData("Shalik", 22);
    }
    
}
