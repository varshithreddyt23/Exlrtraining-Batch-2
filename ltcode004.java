import java.util.Scanner;

public class ltcode004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        String str1 = scanner.nextLine(); 
        System.out.print("Enter the second number: ");
        String str2 = scanner.nextLine(); 
        
        try {
            
            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);
            
            int sum = num1 + num2;
            
            System.out.println("The sum of the two numbers is: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }
      
        scanner.close();
    }
}
