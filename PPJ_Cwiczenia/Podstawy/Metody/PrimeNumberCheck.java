

public class PrimeNumberCheck {
    public static void main(String[] args) {
        int liczba = 29;

        if (czyPierwsza(liczba)) {
            System.out.println(liczba + " jest liczbą pierwszą.");
        } else {
            System.out.println(liczba + " nie jest liczbą pierwszą.");
        }
    }