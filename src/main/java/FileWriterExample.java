import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterExample  {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre del archivo: ");
        String fileName = scanner.nextLine();


        FileWriter writer = new FileWriter(fileName);

        System.out.println("Introduce líneas de texto:");

        String line;
        while (true) {
            line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            writer.write(line + "\n");
        }

        writer.close();
        System.out.println("El archivo se ha escrito sin errores.");

        scanner.close();
    }
}