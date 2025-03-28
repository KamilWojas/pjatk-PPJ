import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class KalkulatorGodzin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj godzinę rozpoczęcia pracy (HH:MM): ");
        String start = scanner.nextLine();

        System.out.print("Podaj godzinę zakończenia pracy (HH:MM): ");
        String koniec = scanner.nextLine();

        try {
            LocalTime godzinaStart = LocalTime.parse(start);
            LocalTime godzinaKoniec = LocalTime.parse(koniec);

            if (godzinaKoniec.isBefore(godzinaStart)) {
                System.out.println("Błąd: Nie możesz kończyć pracy przed jej rozpoczęciem!");
                return;
            }