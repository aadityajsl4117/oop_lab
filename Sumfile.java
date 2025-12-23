import java.util.Scanner;
public class Sumfile
{
    public static void main(String[] args)
    {
        System.out.println("ENter first the number:");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("ENter second the number:");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("sum :" + sum);


    }
}


