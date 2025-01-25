import java.util.Scanner;

public class ltcode003 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter a number as a string: ");
        String str = scanner.nextLine(); 
        try {
            int num = Integer.parseInt(str);
            System.out.println("The integer value is: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }
        
        scanner.close();
    }
}
