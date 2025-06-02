import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce los numeros para promediar: ");
        int count = scanner.nextInt();

        double sum = 0;

        for (int i = 1; i <= count; i++) {
            System.out.println("Introduce el número " + i + ": ");
            double num = scanner.nextDouble();
            sum += num;
        }

        double average = sum / count;
        System.out.println("El promedio es: " + average);

        scanner.close();
    }
}