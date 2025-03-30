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

        if (kierunek == 1) {
            wynik = kwota / KURS_EUR;
            System.out.printf("%.2f PLN = %.2f EUR\n", kwota, wynik);
        } else if (kierunek == 2) {
            wynik = kwota * KURS_EUR;
            System.out.printf("%.2f EUR = %.2f PLN\n", kwota, wynik);
        } else {
            System.out.println("Nieznana opcja konwersji.");
        }

        scanner.close();
    } 
}