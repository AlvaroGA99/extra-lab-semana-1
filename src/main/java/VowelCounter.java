import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String phrase = scanner.nextLine();
        phrase = phrase.toLowerCase();

        int vowelCount = 0;

        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("La frase contiene " + vowelCount + " vocales.");

        scanner.close();
    }
}