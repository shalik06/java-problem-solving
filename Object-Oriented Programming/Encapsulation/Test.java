// Create a class:

// Student

// Private variable:

// private String name;

// Create:

// void setName(String name)

// and

// String getName()

// In main():

// Student s = new Student();

// s.setName("Shalik");

// System.out.println(s.getName());
class Student{
    private String name;
    void setname(String name){
        this.name = name;

    }
      String getname(){
        return name;
    }
}


 
public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setname("Shalik");
        System.out.println(s.getname());
    }
    
}
