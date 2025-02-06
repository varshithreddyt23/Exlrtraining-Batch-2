import java.util.ArrayList;

public class Demo063{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        if (numbers.size() > 1) {
            int firstElement = numbers.get(0);
            int lastElement = numbers.get(numbers.size() - 1);
            int sum = firstElement + lastElement;
            System.out.println("Sum of the first and last elements: " + sum);
        } else {
            System.out.println("The list should have at least two elements.");
        }
    }
}