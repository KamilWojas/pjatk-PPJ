package ZadaniaCwiczenia6;

import java.util.Random;
import java.util.Scanner;

public class Task0605 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int a, b;
        do {
            System.out.println("Podaj pierwszy koniec przedziału (a < 100): ");
            a = scanner.nextInt();
        } while (a >= 100 || a < 0);

        do {
            System.out.println("Podaj drugi koniec przedziału (b < 100): ");
            b = scanner.nextInt();
        } while (b >= 100 || b < 0);

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int liczbaLosowa, proba = 0;

        do {
            liczbaLosowa = random.nextInt(100);
            proba++;

            if (liczbaLosowa < a || liczbaLosowa > b) {
                System.out.println("Wylosowana liczba to " + liczbaLosowa + ", znajduje się ona poza przedziałem [" + a + ", " + b + "]");
            }
        } while (liczbaLosowa < a || liczbaLosowa > b);

        System.out.println("Wylosowana liczba to " + liczbaLosowa + ". Ilość prób: " + proba);
    }
}
