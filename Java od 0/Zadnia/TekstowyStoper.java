import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class TekstowyStoper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz 'start', aby rozpocząć pomiar:");
        scanner.nextLine();
        Instant poczatek = Instant.now();

        System.out.println("Pomiar trwa... Wpisz 'stop', aby zakończyć:");
        scanner.nextLine();
        Instant koniec = Instant.now();
    }