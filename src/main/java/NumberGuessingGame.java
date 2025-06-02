import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generar número aleatorio entre 1 y 100
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int guess = 0;

        System.out.println("¡Bienvenido al Juego de Adivinanzas!");
        System.out.println("He pensado en un número entre 1 y 100.");

        // Bucle hasta que el usuario adivine el número
        while (guess != secretNumber) {
            System.out.print("Introduce tu suposición: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("El número es mayor. Inténtalo de nuevo.");
            } else if (guess > secretNumber) {
                System.out.println("El número es menor. Inténtalo de nuevo.");
            } else {
                System.out.println("¡Felicidades! ¡Has adivinado el número!");
                System.out.println("Has necesitado " + attempts + " intentos.");
            }
        }

        scanner.close();
    }
}