import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> list = new ArrayList<>();
            System.out.println("Enter 5 numbers:");
            for (int i = 0; i < 5; i++) {
                list.add(sc.nextInt());
            }
            FileWriter fw = new FileWriter("numbers.txt");
            for (int num : list) {
                fw.write(num + "\n");
            }
            fw.close();
            System.out.println("Data written to file");
            File file = new File("numbers.txt");
            Scanner fileScanner = new Scanner(file);

            System.out.println("Reading from file:");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();
            sc.close();

        } catch (IOException e) {
            System.out.println("Error occurred");
        }
    }
}