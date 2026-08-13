// Create a class named Book.

// Variables:

// String title;
// int price;

// Create a constructor:

// Book(String t, int p)

// Inside it, store:

// title = t;
// price = p;

// Then in main() create:

// Book b1 = new Book("Java", 500);

// Print:

// Title: Java
// Price: 500
public class Book {
    String title;
    int price;

    Book(String t , int p){
        title = t;
        price = p;

    }   
    public static void main(String[] args) {
        Book b1 = new Book("java", 500);
        System.out.println("Title:"+ b1.title );
        System.out.println("Price:"+ b1.price);
    } 
}
