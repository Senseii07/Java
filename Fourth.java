
import java.util.Scanner;

public class Fourth{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your first name:");
            String firstName = sc.nextLine();
                System.out.println("Enter your last name:");
                String lastName = sc.nextLine();
                System.out.println("Hello "+firstName+ " "+ lastName);
        }
    }
}

