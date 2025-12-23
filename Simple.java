import java.util.Scanner;

public class Simple {
    public static void main(String[] args)
    {
       System.out.println("Enter the ypur principle:");
       Scanner input = new Scanner(System.in);
       int principle = input.nextInt();
       
       System.out.println("enter the rate:");
       float rate = input.nextFloat();

       System.out.println("enter the Time:");
       int Time = input.nextInt();
    
       float simple = (principle * rate * Time)/100;

       System.out.println("The simple intrest is:" + simple);






    }
    
}
