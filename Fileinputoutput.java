import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fileinputoutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filename = "inputoutput.txt";

        System.out.print("Enter text to write to the file: ");
        String content = scanner.nextLine();

        System.out.print("Do you want to append to the file? (yes/no): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("yes")) {
            appendToFile(filename, content);
        } else {
            writeToFile(filename, content);
        }

        scanner.close();
    }

    public static void writeToFile(String filename, String content) {
        try (FileWriter fw = new FileWriter(filename)) {
            fw.write(content + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void appendToFile(String filename, String content) {
        try (FileWriter fw = new FileWriter(filename, true)) {
            fw.write(content + "\n");
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }
    }
}
