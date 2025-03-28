import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ObliczWiek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swoją datę urodzenia (RRRR-MM-DD): ");
        String dataWejscia = scanner.nextLine();

        try {
            LocalDate dataUrodzenia = LocalDate.parse(dataWejscia);
            LocalDate dzis = LocalDate.now();

            if (dataUrodzenia.isAfter(dzis)) {
                System.out.println("Błąd: Urodziłeś się w przyszłości? 😲");
                return;
            }

            Period wiek = Period.between(dataUrodzenia, dzis);
            System.out.println("Masz " + wiek.getYears() + " lat.");

        } catch (Exception e) {
            System.out.println("Błąd: Nieprawidłowy format daty.");
        }

        scanner.close();
    }
}