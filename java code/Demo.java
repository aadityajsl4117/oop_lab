import java.util.Scanner;
public class Demo
{
public static void main(String[] args)
{
int rev = 0;
System.out.println("enter the number");
Scanner input = new Scanner(System.in);
int n = input.nextInt();
int temp = n;
while (n != 0)
{
int digit = n%10;
rev = rev*10+digit;
n = n/10;
}
if (temp == rev)
{
System.out.println("It is palindrom");
}
else
{
System.out.println("It is not palindrom");
}
}
}