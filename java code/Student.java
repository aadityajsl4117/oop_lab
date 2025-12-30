import java.util.Scanner;

public class Student {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = input.nextLine();

        System.out.println("Enter marks:");
        int marks = input.nextInt();

        if (marks > 50) {
            System.out.println(name + " has passed");
        } else {
            System.out.println(name + " has failed");
        }
    }
}
