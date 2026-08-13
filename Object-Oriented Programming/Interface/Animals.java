// Interface 1
// interface Animal

// Method:

// void eat();
// Interface 2
// interface Pet

// Method:

// void play();
// Class
// class Dog implements Animal, Pet

// Implement:

// eat()  → Dog is Eating
// play() → Dog is Playing
// Main
// Dog d1 = new Dog();

// d1.eat();
// d1.play();
interface Animal{
    void eat();
}
interface Pet{
    void play();
}
class Dog implements Animal, Pet{
    public void eat(){
        System.out.println(" Dog is Eating");
    }
    public void play(){
        System.out.println(" Dog is Playing");
    }
}
public class Animals {
    public static void main(String[] args) {
        Dog d1 = new Dog();

        d1.eat();
        d1.play();
    }
    
}
