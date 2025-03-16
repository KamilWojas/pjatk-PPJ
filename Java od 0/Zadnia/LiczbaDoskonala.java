import java.util.Scanner;

public class LiczbaDoskonala {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Liczba musi być większa od 0!");
        } else if (czyLiczbaDoskonala(n)) {
            System.out.println("Liczba " + n + " jest liczbą doskonałą.");
        } else {
            System.out.println("Liczba " + n + " nie jest liczbą doskonałą.");
        }

        scanner.close();
    }

    public static boolean czyLiczbaDoskonala(int n) {
        int sumaDzielnikow = 0;