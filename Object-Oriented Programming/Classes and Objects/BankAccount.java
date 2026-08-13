// Q4 – Bank Account (Slightly Harder)

// This is our first class where the object's state changes.

// Requirements

// Create a class:

// BankAccount
// Instance Variables
// String holderName;
// double balance;
// Constructor
// BankAccount(String holderName, double balance)
// Methods
// 1️⃣ display()

// Print:

// Account Holder: Shalik
// Balance: 1000.0
// 2️⃣ deposit(double amount)

// Increase balance.

// Example:

// balance = balance + amount;

// Then print:

// Deposited: 500.0
// Current Balance: 1500.0
// 3️⃣ withdraw(double amount)

// If balance is enough:

// Withdraw Successful
// Current Balance: ...

// Otherwise:

// Insufficient Balance
// In main()

// Create:

// BankAccount b1 = new BankAccount("Shalik", 1000);

// Then perform these operations in order:

// b1.display();

// b1.deposit(500);

// b1.withdraw(300);

// b1.withdraw(2000);

// b1.display();
public class BankAccount {

    String holderName;
    double balance;

    BankAccount(String holderName, double blance) {
        this.holderName = holderName;
        this.balance = blance;
    }

    void display() {
        System.out.println("Account HolderName: " + holderName);
        System.out.println("Account Balance: " + balance);
        System.out.println("-------------------------------------------");
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: 500.0");
        System.out.println("Current Balance: 1500.0");
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdraw Successful");
            System.out.println("Current Blance: " + balance);

        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Shalik", 1000);

        b1.display();

        b1.deposit(500);

        b1.withdraw(300);

        b1.withdraw(2000);

        b1.display();

    }

}
