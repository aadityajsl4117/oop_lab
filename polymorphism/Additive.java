public class Additive
{
     int add(int a,int b)
     {
        return(a+b);
     }
     int sub(int a, int b, int c)
     {
        return (a+b-c);

     }
     int div(int a, int b)
     {
        return(a/b);
     }
public static void main(String[] args)
{
Additive a= new Additive();
System.out.println(a.add(5, 4));
 System.out.println(a.sub(5, 3, 6));
System.out.println(a.div(10, 5));
}
}