class Demo083 {
    public static void main(String[] args) {
        String input = "Example";  
        checkFirstCharacter(input);
    }

    public static void checkFirstCharacter(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("The input string is empty.");
            return;
        }

        char firstChar = Character.toLowerCase(input.charAt(0));
        if (isVowel(firstChar)) {
            System.out.println("The first character '" + input.charAt(0) + "' is a vowel.");
        } else {
            System.out.println("The first character '" + input.charAt(0) + "' is a consonant.");
        }
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
