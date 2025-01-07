public class demo014 {
    public static void main(String[] args) {
        int number = 5;
        int positive = +number;
        int negative = -number;
        int incremented = ++number; // Pre-increment
        int decremented = --number; // Pre-decrement

        // Post-increment and Post-decrement
        int postIncremented = number++;
        int postDecremented = number--;
        
        // Logical complement
        boolean flag = true;
        boolean complement = !flag;
        
        // Print results
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Pre-increment: " + incremented);
        System.out.println("Pre-decrement: " + decremented);
        System.out.println("Post-increment: " + postIncremented);
        System.out.println("Post-decrement: " + postDecremented);
        System.out.println("Logical complement: " + complement);
    }
}