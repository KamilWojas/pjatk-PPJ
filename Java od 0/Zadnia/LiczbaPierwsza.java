import java.util.Scanner;

public class LiczbaPierwsza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        if (liczba < 2) {
            System.out.println("Liczba " + liczba + " nie jest liczbą pierwszą.");
        } else if (czyLiczbaPierwsza(liczba)) {
            System.out.println("Liczba " + liczba + " jest liczbą pierwszą.");
        } else {
            System.out.println("Liczba " + liczba + " nie jest liczbą pierwszą.");
        }

        scanner.close();
    }

    public static boolean czyLiczbaPierwsza(int n) {