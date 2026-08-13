// Create a class named Car with these variables:

// String brand;
// String color;
// int speed;

// In main():

// Create 2 objects.

// Car 1
// Brand = BMW
// Color = Black
// Speed = 220
// Car 2
// Brand = Audi
// Color = White
// Speed = 240
public class Car {
   String brand;
   String color;
   int speed;
   public static void main(String[] args) {
         Car c1 = new Car();
         Car c2 = new Car();
         c1.brand = "BMW";
         c1.color ="Black";
         c1.speed = 220;
         c2.brand = "Audi";
         c2.color = "White";
         c2.speed = 240;

         System.out.println("Car 1 ");
         System.out.println("Brand name :" + c1.brand);
         System.out.println("Color :" + c1.color);
         System.out.println("Speed :" + c1.speed);

         System.out.println("Car 2");
         System.out.println("Brand name :" + c2.brand);
         System.out.println("Color :" + c2.color);
         System.out.println("Speed :" + c2.speed);

        
   }
    
}
