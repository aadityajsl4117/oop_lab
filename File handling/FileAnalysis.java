import java.io.*;
import java.util.Scanner;
public class FileAnalysis {
    public static void main(String[] args) throws Exception {
        File file = new File("final.txt");
        if (!file.exists()) {
            FileWriter fw = new FileWriter(file);
            fw.write("Java is powerful\nFile handling is important");
            fw.close();
            System.out.println("File created!");
        }
        Scanner sc = new Scanner(file);
        int lines = 0;
        int words = 0;
        int chars = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            lines++;
            chars += line.length();

            String[] w = line.split(" ");
            words += w.length;
        }
        sc.close();
        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
        System.out.println("Characters: " + chars);
    }
}
