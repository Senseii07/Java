import java.util.Scanner;

public class PracticeQ7 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[5];

    System.out.println("Enter 5 numbers: ");
    for (int i=0; i<5; i++) {
        numbers[i] = scanner.nextInt();
    }

    int largest = numbers[0];
    for(int i =1; i<numbers.length; i++){
        if(numbers[i]>largest){
            largest = numbers[i];
        }
    }
    System.out.println("The largest number is "+ largest);
    }
}