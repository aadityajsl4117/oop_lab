import java.util.Scanner;

class Attendanc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int i = 1;

        while (i <= n) {

            System.out.println("\nStudent " + i);

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Total work ");
            int total = sc.nextInt();

            System.out.print("present : ");
            int attended = sc.nextInt();

            double percentage = (attended * 100.0) / total;

            System.out.println("Attendance Percentage: " + percentage + "%");

            if (percentage >= 75) {
                System.out.println("Status: ELIGIBLE");
            } else {
                System.out.println("Status: NOT ELIGIBLE");
            }

            i++;
        }
    }
}
