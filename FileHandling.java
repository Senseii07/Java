import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        String filename = "output.txt";
        String content = """
                This is a sample content
                written using a text block.
                """;

        writeToFile(filename, content);

        // Append additional content
        appendToFile(filename, "This line is appended.");
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

