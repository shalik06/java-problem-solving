// Q2

// Create two methods:

// sum(int a,int b)

// and

// sum(int a,int b,int c)

// Return the sums.

// Print both.
public class Sum {
    public static int sum(int a, int b) {
        return a+b;
        
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main (String[]args){
        System.out.println(sum(12, 8));
        System.out.println(sum(10, 20, 30));

    }
    
}
