import java.util.Scanner;
public class Two {
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int largest = Math.max(a, Math.max(b, c));
        System.out.println("Largest number: " + largest);
    }
    }
}
