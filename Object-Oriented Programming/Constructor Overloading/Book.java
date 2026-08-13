// Coding Challenge 1

// Create a class:

// Book

// Variables:

// String title;
// int price;

// Create 3 constructors:

// Constructor 1
// Book()

// Set:

// title = "Unknown";
// price = 0;
// Constructor 2
// Book(String title)

// Set:

// price = 0;
// Constructor 3
// Book(String title, int price)

// Set both values using this.

// Method
// void display()

// Print title and price.

// In main()

// Create:

// Book b1 = new Book();
// Book b2 = new Book("Java");
// Book b3 = new Book("Python", 700);

// Call:

// b1.display();
// b2.display();
// b3.display();
public class Book {
    String title;
    int price;
    Book(){
        title = "Unknown";
        price = 0;
    }
    Book(String title){
        this.title = title;

    }
    Book(String title, int price){
        this.title = title;
        this.price = price;

    }
    void display(){
        System.out.println("Book Title: " + title);
        System.out.println("Book Price: " + price);
        System.out.println("--------------------------");

    }
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java");
        Book b3 = new Book("Python", 700);


       b1.display();
       b2.display();
       b3.display();
        
    }
    
}
