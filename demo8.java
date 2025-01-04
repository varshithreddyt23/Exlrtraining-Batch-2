import java.util.Scanner;

public class demo8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String CORRECT_USERNAME = "VarshithReddy";
        final String CORRECT_PASSWORD = "123456789";

        String username;
        String password;
        boolean loggedIn = false;
        do {
            System.out.print("Enter username: ");
            username = scanner.nextLine();

            System.out.print("Enter password: ");
            password = scanner.nextLine();

            if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
                loggedIn = true;
                System.out.println("Login successful! Welcome to mallareddy university.");
            } else {
                System.out.println("Incorrect username or password. Please try again.");
            }
        } while (!loggedIn);
        scanner.close();
    }
}
