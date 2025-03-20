import java.util.Scanner;

public class LiczbyPierwsze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Brak liczb pierwszych w tym zakresie.");
        } else {
            System.out.print("Liczby pierwsze od 1 do " + n + ": ");
            wypiszLiczbyPierwsze(n);
        }

        scanner.close();
    }

    public static void wypiszLiczbyPierwsze(int n) {
        for (int i = 2; i <= n; i++) {
            if (czyLiczbaPierwsza(i)) {
                System.out.print(i + (i < n ? ", " : ""));
            }
        }
        System.out.println();
    }
