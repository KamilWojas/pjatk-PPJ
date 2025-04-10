import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ZapisDoPliku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz tekst do zapisania (wpisz 'KONIEC' aby zakończyć):");

        try (FileWriter writer = new FileWriter("notatka.txt")) {
            while (true) {
                String linia = scanner.nextLine();
                if (linia.equalsIgnoreCase("KONIEC")) break;
                writer.write(linia + System.lineSeparator());
            }
            System.out.println("Zapisano dane do pliku notatka.txt");
        } catch (IOException e) {
            System.out.println("Błąd zapisu: " + e.getMessage());
        }

        scanner.close();
    }
}