import java.io.*;
import java.util.*;
public class AdvancedFileSumAverage {
    public static void main(String[] args) {
        File file = new File("numbers.txt");
        ArrayList<Integer> numbers = new ArrayList<>();
        try {
            if (!file.exists()) {
                System.out.println("File not found. Creating file...");
                FileWriter fw = new FileWriter(file);
                fw.write("10\n20\n30\n40\nabc\n50");
                fw.close();
                System.out.println("File created: " + file.getAbsolutePath());
            }
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                if (sc.hasNextInt()) {
                    numbers.add(sc.nextInt());
                } else {
                    System.out.println("Skipping invalid data: " + sc.next());
                }
            }
            sc.close();
            int sum = 0;

            for (int num : numbers) {
                sum += num;
            }
            double avg = (numbers.size() > 0) ? (double) sum / numbers.size() : 0;
            System.out.println("\nValid Numbers: " + numbers);
            System.out.println("Sum = " + sum);
            System.out.println("Average = " + avg);

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
