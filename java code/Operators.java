
    public class Operators{
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));   // Addition
        System.out.println("a - b = " + (a - b));   // Subtraction
        System.out.println("a * b = " + (a * b));   // Multiplication
        System.out.println("a / b = " + (a / b));   // Division
        System.out.println("a % b = " + (a % b));   // Modulus


        System.out.println("\nUnary Operators:");
        System.out.println("++a = " + (++a));  // Increment
        System.out.println("--b = " + (--b));
        System.out.println("a++ = " + (a++));  // Increment
        System.out.println("b-- = " + (b--));
        
        System.out.println("\nRelational Operators:");
        System.out.println("a > b  = " + (a > b));
        System.out.println("a < b  = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

      
        boolean x = true;
        boolean y = false;

        System.out.println("\nLogical Operators:");
        System.out.println("x && y = " + (x && y)); // AND
        System.out.println("x || y = " + (x || y)); // OR
        System.out.println("!x = " + (!x));         // NOT
    }
}

    

