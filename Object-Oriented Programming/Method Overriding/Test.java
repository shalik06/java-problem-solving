// Method Overriding

// Write a program:

// class Animal

// Method:

// void sound()

// Print:

// Animal Sound
// class Dog extends Animal

// Override:

// void sound()

// Print:

// Dog Barks

// In main():

// Dog d1 = new Dog();
// d1.sound();
class Animal{
    void Sound(){
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal{
    void Sound(){
        System.out.println("Dog Bark");
    }
}
public class Test {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.Sound();
    }
}