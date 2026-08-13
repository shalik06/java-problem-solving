// Now Complete the Coding Challenge

// Write this program:

// class Animal

// Method:

// void eat()

// Print:

// Animal is eating

// Create:

// class Dog extends Animal

// Method:

// void bark()

// Print:

// Dog is barking

// In main():

// Dog d1 = new Dog();

// Call:

// d1.eat();
// d1.bark();
class Animal {

    void eat(){
        System.out.println("Animalm is Eating..");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is Barking..");
    }
}
public class Demo{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.bark();
    }

    
}