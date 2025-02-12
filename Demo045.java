
import java.util.Scanner;

public class Demo045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Displaying numbers before swap
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        // Swapping the numbers without using a third variable
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        // Displaying numbers after swap
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

        scanner.close();
    }
}
