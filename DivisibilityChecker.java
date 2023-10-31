import java.util.Scanner;

public class DivisibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 53 == 0 && number % 61 == 0) {
            System.out.println("Foo Bar");
        } else if (number % 53 == 0) {
            System.out.println("Foo");
        } else if (number % 61 == 0) {
            System.out.println("Bar");
        } else {
            System.out.println("Neither Foo nor Bar");
        }

        scanner.close();
    }
}
