// Encapsulation Coding Challenge 1 (Easy)

// Create a class:

// class Employee

// Private variables:

// private String name;
// private double salary;

// Create:

// void setName(String name)
// String getName()

// void setSalary(double salary)
// double getSalary()

// In main():

// Employee e1 = new Employee();

// e1.setName("Shalik");
// e1.setSalary(50000);

// System.out.println("Name: " + e1.getName());
// System.out.println("Salary: " + e1.getSalary());
class Employee{
    private String name;
    private double salary;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setSalary(double salary){
        this.salary = salary;
    }
    double getSalary(){
        return salary;
    }
}
public class Demo {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.setName("Shalik");
        e1.setSalary(50000);    


        System.out.println("Name: " + e1.getName());
        System.out.println("Salary: " + e1.getSalary());
    }
    
}
