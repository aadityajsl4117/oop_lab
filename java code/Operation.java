import java.util.Scanner;
public class Operation {
    public static void main(String...args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = input.nextInt();
        System.out.println("Enter the Second number");
        int b = input.nextInt();
        int Sum = a + b;

        int Sub = a - b;
        double Div = (double)a / b;
        int rem = a % b;
        int mult = a * b;
        System.out.println(Sum);
        System.out.println(Sub);
        System.out.println(Div);
        System.out.println(rem);
        System.out.println(mult);

        


    }

    
}
