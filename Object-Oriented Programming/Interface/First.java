// Challenge 1 ⭐

// Write a program:

// Interface
// interface Animal

// Method:

// void sound();
// Class
// class Dog implements Animal

// Implement:

// sound()

// Output:

// Dog Bark
// Main
// Dog d1 = new Dog();

// d1.sound();
interface Animal{
    void sound();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Dog Bark");
    }
}
public class First {
    public static void main(String[] args) {
        Dog d1 = new Dog();

        d1.sound();
    }

    
}