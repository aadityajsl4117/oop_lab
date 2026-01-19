import java.util.Scanner;

class For {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER: ");
        int n = input.nextInt();

        int a = 0;
        int b = 1;

        System.out.println(a);
        System.out.println(b);

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}


            
