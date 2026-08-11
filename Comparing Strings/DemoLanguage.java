// Q3

// Create:

// String language = "Java";

// Check if it equals "Java".

// Print:

// Programming Language

// Otherwise print:

// Unknown

import java.util.Scanner;
public class DemoLanguage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter programming language :");
          String languagee= sc.nextLine();
          String language = "Java";
          if (languagee.equals(language)){
            System.out.println("Programming Language");
            
          }
          else{
            System.out.println("Unknow language");
          }
          sc.close();
    }
    
  

    
}
