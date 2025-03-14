import java.util.Scanner;

public class Silnia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Nie można obliczyć silni z liczby ujemnej!");
        } else {
            System.out.println("Silnia " + n + "! = " + obliczSilnie(n));
        }

        scanner.close();
    }

    public static long obliczSilnie(int n) {
        long wynik = 1;
        for (int i = 2; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }
}