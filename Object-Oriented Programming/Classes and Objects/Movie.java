// Q3 – Movie (No More Training Wheels)

// I'm making this one harder.

// Create a class:

// Movie
// Variables
// String title;
// String hero;
// double rating;
// int duration;
// Constructor

// Initialize all variables.

// Methods
// 1. display()

// Print all movie details.

// 2. checkHitMovie()

// Rules:

// Rating >= 8.5 → Blockbuster
// Rating >= 7.0 and < 8.5 → Hit
// Otherwise → Average Movie

// (This introduces multiple conditions—very common in interviews.)

// 3. watchTime()

// If duration is:

// Greater than 180 minutes → Long Movie
// Otherwise → Normal Length
// In main()

// Create these three objects:

// Title: Pushpa 2
// Hero: Allu Arjun
// Rating: 8.9
// Duration: 190
// Title: 3 Idiots
// Hero: Aamir Khan
// Rating: 8.4
// Duration: 170
// Title: Random Movie
// Hero: Unknown
// Rating: 6.5
// Duration: 140

// Call all three methods for each object.

public class Movie {

    String title;
    String hero;
    double rating;
    int duration;

    Movie(String title, String hero, double rating, int duration) {
        this.title = title;
        this.hero = hero;
        this.rating = rating;
        this.duration = duration;

    }

    void display() {
        System.out.println("Movie Title: " + title);
        System.out.println("Movie Hero: " + hero);
        System.out.println("Movie rating: " + rating);
        System.out.println("Movie Duration: " + duration);
        System.out.println("-----------------------------------");
    }

    void checkHitMovie() {
        if (rating >= 8.5) {
            System.out.println("Blockbuster");
        } else if (rating >= 7.0) {
            System.out.println("Hit Movie");
        } else {
            System.out.println("Average Movie");
        }
    }

    void watchTime() {
        if (duration >= 180) {
            System.out.println("Long Movie");

        } else {
            System.out.println("Normal length");
        }
    }

    public static void main(String[] args) {
        Movie m1 = new Movie("Pushpa 2", "Allu Arjun", 8.9, 190);
        Movie m2 = new Movie("3 Idiots", "Aamir Khan", 8.4, 170);
        Movie m3 = new Movie("Random Movie", "Unknown", 6.5, 140);

        m1.display();
        m1.checkHitMovie();
        m1.watchTime();

        m2.display();
        m2.checkHitMovie();
        m2.watchTime();

        m3.display();
        m3.checkHitMovie();
        m3.watchTime();

    }

}