public class Demo078 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        printEvenOdd(numbers);
    }

    public static void printEvenOdd(int[] numbers) {
        int[] evenNumbers = new int[numbers.length];
        int[] oddNumbers = new int[numbers.length];
        int evenCount = 0;
        int oddCount = 0;

        // Separate even and odd numbers
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers[evenCount++] = number;
            } else {
                oddNumbers[oddCount++] = number;
            }
        }

        // Print even numbers
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        // Print odd numbers
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
    }
}
