import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) 
    
    {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        if (n ==0)
        {
            System.out.println(1);
        }
        else{

        int i = 1;
        int fact=1;
        do{
         fact = fact * i;
          i++;
        } while(i<=n);
         System.out.println( "your factorial is:"+fact);
    }

    }
}
