// Method Overloading

// Create a class:

// class Calculator

// Create 3 overloaded methods:

// add(int a, int b)

// returns sum of 2 numbers.

// add(int a, int b, int c)

// returns sum of 3 numbers.

// add(double a, double b)

// returns sum of 2 decimal numbers.

// In main()
// Calculator c = new Calculator();

// System.out.println(c.add(10, 20));

// System.out.println(c.add(10, 20, 30));

// System.out.println(c.add(10.5, 20.5));
class Calculator{
    void add(int a, int b){
        System.out.println(a+b);

    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    void add(double a, double b){
        System.out.println(a+b);
    }
}
public class Addition {
    public static void main(String[] args) {
        Calculator c = new Calculator();


       c.add(10, 20);
       c.add(10, 20, 30);
       c.add(10.5, 20.5);
    }
    
}
