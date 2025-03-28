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