import java.util.Scanner;

public class Demo079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.print("Enter the element to search: ");
        int elementToFind = scanner.nextInt();
        boolean isFound = false;
        for (int number : numbers) {
            if (number == elementToFind) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("Element " + elementToFind + " is found in the array.");
        } else {
            System.out.println("Element " + elementToFind + " is not found in the array.");
        }

        scanner.close();
    }
}
