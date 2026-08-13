// Now create two books using the constructor.

// Book b1 = new Book("Java", 500);
// Book b2 = new Book("Python", 700);

// Expected output:

// Book 1
// Title: Java
// Price: 500

// Book 2
// Title: Python
// Price: 700

// No hints this time. I know you can do it.
public class Books {
    String title;
    int price;

    Books(String t , int p){
        title = t;
        price = p;

    }   
    public static void main(String[] args) {
        Book b1 = new Book("java", 500);
        Book b2 = new Book("Python", 700);

        System.out.println("Book 1");
        System.out.println("Title:"+ b1.title );
        System.out.println("Price:"+ b1.price);

        System.out.println("Book 2");
        System.out.println("Title:"+ b2.title );
        System.out.println("Price:"+ b2.price);
    } 
}
    
