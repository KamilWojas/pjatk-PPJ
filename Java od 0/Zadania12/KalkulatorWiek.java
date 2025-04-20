import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class KalkulatorWiek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swoją datę urodzenia (RRRR-MM-DD): ");
        String dataTekst = scanner.nextLine();

        try {
            LocalDate dataUrodzenia = LocalDate.parse(dataTekst);
            LocalDate dzis = LocalDate.now();

            if (dataUrodzenia.isAfter(dzis)) {
                System.out.println("Data urodzenia nie może być w przyszłości.");
            } else {
                Period wiek = Period.between(dataUrodzenia, dzis);
                System.out.println("Masz: " + wiek.getYears() + " lat, " + wiek.getMonths() + " miesięcy i " + wiek.getDays() + " dni.");
            }

