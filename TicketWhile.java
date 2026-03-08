import java.util.Scanner;

public class TicketWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int seats = sc.nextInt();   // one seat
        

            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Check Status");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1: // Book
                    if (seats > 0) {
                        seats--;
                        System.out.println("Ticket booked");
                    } else {
                        System.out.println("No seats available");
                    }
                    break;

                case 2: 
                    if (seats == 0) {
                        seats++;
                        System.out.println("Ticket cancelled");
                    } else {
                        System.out.println("No ticket to cancel");
                    }
                    break;

                case 3: 
                    if (seats == 0) {
                        System.out.println("Ticket is booked");
                    } else {
                        System.out.println("Ticket not booked");
                    }
                    break;

                case 4: // Exit
                    System.out.println("Exit");
                    sc.close();
                    return;   // stop program

                default:
                    System.out.println("Wrong choice");
            }
        }
    }
