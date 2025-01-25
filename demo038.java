public class demo038 {
    public static void main(String[] args) {
      
        char lowerChar = 'a';
        char upperChar = 'A';
        char convertedUpper = Character.toUpperCase(lowerChar);
        System.out.println("Lowercase 'a' converted to uppercase: " + convertedUpper);

        char convertedLower = Character.toLowerCase(upperChar);
        System.out.println("Uppercase 'A' converted to lowercase: " + convertedLower);

        System.out.println("'a' is lowercase: " + Character.isLowerCase(lowerChar));
        System.out.println("'A' is uppercase: " + Character.isUpperCase(upperChar));
    }
}

