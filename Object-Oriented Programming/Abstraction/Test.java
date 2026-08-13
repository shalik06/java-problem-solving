// Write this yourself:

// abstract class Animal

// Abstract method:

// abstract void sound();

// Create child class:

// class Dog extends Animal

// Implement:

// void sound()

// Print:

// Dog Barks

// In main:

// Dog d1 = new Dog();

// d1.sound();
abstract class Animal{
    abstract void sound();
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog Bark");
    }
}
public class Test {

    public static void main(String[] args) {
        Dog d1 = new Dog();

        d1.sound();
    }
}