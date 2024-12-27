/*
Zadanie 2
Napisz program, który sprawdza, czy podana liczba jest parzysta czy nieparzysta .
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobranie liczby od użytkownika
        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        // Operator warunkowy
        String wynik = (liczba % 2 == 0) ? "Parzysta" : "Nieparzysta";

        // Wyświetlenie wyniku
        System.out.println("Liczba jest: " + wynik);
    }
}