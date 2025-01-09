import java.util.Scanner;

public class demo018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter minutes: ");
        long minutes = sc.nextLong();
        
        long hours = minutes / 60;
        long minutesInYear = 60 * 24 * 365;
        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long days = remainingMinutes / (60 * 24);
        
        System.out.println(minutes + " minutes is equal to " + hours + " hours.");
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
        
        sc.close();
    }
}