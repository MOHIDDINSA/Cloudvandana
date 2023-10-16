import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        boolean isPangram = isPangram(input);
        System.out.println("Is it a pangram? " + isPangram);

        scanner.close();
    }

    public static boolean isPangram(String input) {
        input = input.toLowerCase();
        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                int index = c - 'a';
                alphabet[index] = true;
            }
        }

        for (boolean letter : alphabet) {
            if (!letter) {
                return false; // Not all letters from A to Z are present
            }
        }

        return true;
    }
}
