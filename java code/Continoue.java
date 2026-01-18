import java.util.Scanner;
public  class Continoue { 

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the your number:");
        int num = obj.nextInt();
        for(int i=1;i<=num;i++)
        {
            if(i%5==0)
            {
                System.out.println("show how much number will come:"+i);
               continue;
            }
        }
    }
}