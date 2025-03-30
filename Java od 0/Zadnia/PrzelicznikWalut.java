import java.util.Scanner;

public class PrzelicznikWalut {
    public static void main(String[] args) {
        final double KURS_EUR = 4.5;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj kwotę: ");
        double kwota = scanner.nextDouble();

        System.out.print("Wybierz kierunek konwersji (1 = PLN → EUR, 2 = EUR → PLN): ");
        int kierunek = scanner.nextInt();

        double wynik;
    }