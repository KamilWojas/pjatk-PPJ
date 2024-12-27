mport java.util.Scanner;

/*
Zadanie 1
Napisz program, który sprawdza, czy podana liczba jest:

Większa od zera,
Równa zero,
Mniejsza od zera.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobranie liczby od użytkownika
        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        // Instrukcje warunkowe
        if (liczba > 0) {
            System.out.println("Liczba jest większa od zera.");
        } else if (liczba < 0) {
            System.out.println("Liczba jest mniejsza od zera.");
        } else {
            System.out.println("Liczba to zero.");
        }
    }
}