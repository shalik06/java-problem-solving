// Bonus:discount(double price)→Return the discounted price(10%off if price>=1000,otherwise
// return the original price).
// public class Bonous {
    
// }
public class Bonous {

    public static Double  discount(double price) {
        if (price >= 1000) {
            return price -( price *0.10);
            
        }else{
            return price;
        }
        
    }
    public static void main(String[] args) {
        double result = discount(1200);
        System.out.println(result);
        
    }
}