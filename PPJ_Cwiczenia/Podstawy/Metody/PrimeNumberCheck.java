/*
Napiszemy metodę, która sprawdza, czy dana liczba jest liczbą pierwszą.
 */

public class PrimeNumberCheck {
    public static void main(String[] args) {
        int liczba = 29;

        if (czyPierwsza(liczba)) {
            System.out.println(liczba + " jest liczbą pierwszą.");
        } else {
            System.out.println(liczba + " nie jest liczbą pierwszą.");
        }
    }

    // Metoda sprawdzająca, czy liczba jest liczbą pierwszą
    public static boolean czyPierwsza(int n) {
        if (n <= 1) return false; // Liczby <= 1 nie są pierwsze

        for (int i = 2; i <= Math.sqrt(n); i++) { // Sprawdzamy dzielniki do pierwiastka z n
            if (n % i == 0) {
                return false; // Liczba nie jest pierwsza
            }
        }
        return true; // Liczba jest pierwsza
    }
}