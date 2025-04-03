import java.util.Scanner;

public class PalindromLiczby {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        String liczba = scanner.nextLine();

        if (czyPalindrom(liczba)) {
            System.out.println("Liczba jest palindromem.");
        } else {
            System.out.println("Liczba NIE jest palindromem.");
        }

        scanner.close();
    }

    public static boolean czyPalindrom(String tekst) {
        if (tekst.length() <= 1) return true;

        if (tekst.charAt(0) != tekst.charAt(tekst.length() - 1)) {
            return false;
        }