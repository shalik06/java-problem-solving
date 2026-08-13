// Challenge 2 (Medium) ⭐⭐

// Create:

// abstract class Employee

// Constructor:

// Employee(){
//     System.out.println("Employee Constructor");
// }

// Abstract method:

// abstract void work();

// Normal method:

// void attendMeeting(){
//     System.out.println("Employee Attending Meeting");
// }

// Create child class:

// class Developer extends Employee

// Implement:

// work()

// Output:

// Developer is Coding

// In main:

// Developer d1 = new Developer();

// d1.work();
// d1.attendMeeting();
abstract class Employee{
     Employee(){
    System.out.println("Employee Constructor");
}
  abstract void work();
  void attendMeeting(){
    System.out.println("Employee Attending Meeting");
  }

}
class Developer extends Employee{
   void work(){
    System.out.println("developer is Coding");
   }
}
public class Employees {
    public static void main(String[] args) {
        Developer d1 = new Developer();

        d1.work();
        d1.attendMeeting();
    }
    
}
