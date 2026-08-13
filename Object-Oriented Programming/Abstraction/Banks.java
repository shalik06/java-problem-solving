
// Challenge 3 (Exam Level) ⭐⭐⭐

// Create:

// abstract class Bank

// Variable:

// String bankName = "SBI";

// Constructor:

// Bank(){
//     System.out.println("Bank Constructor");
// }

// Abstract method:

// abstract void interestRate();

// Normal method:

// void showBank(){
//     System.out.println("Bank Name: " + bankName);
// }

// Create child class:

// class SavingsAccount extends Bank

// Implement:

// interestRate()

// Output:

// Interest Rate is 7%

// In main:

// SavingsAccount s1 = new SavingsAccount();

// s1.showBank();
// s1.interestRate();
abstract class Bank{
    String bankName = "SBI";

    Bank(){
        System.out.println("Bank Constructor");
    }
    abstract void interestRate();
    void showBank(){
        System.out.println("Bank Name: " + bankName);
    }
}
class SavingAccount extends Bank{
  void interestRate(){
    System.out.println("Interest Rate is 7%");
  }

}
public class Banks {
    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount();

        s1.showBank();
        s1.interestRate();
    }
    
}
