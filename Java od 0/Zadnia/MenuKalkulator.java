import java.util.Scanner;

public class MenuKalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wybor;

        do {
            System.out.println("\n--- KALKULATOR ---");
            System.out.println("Dostępne działania: dodaj, odejmij, pomnóż, podziel, wyjście");
            System.out.print("Wybierz działanie: ");
            wybor = scanner.nextLine().toLowerCase();

            if (wybor.equals("wyjście")) break;

            System.out.print("Podaj pierwszą liczbę: ");
            double a = scanner.nextDouble();
            System.out.print("Podaj drugą liczbę: ");
            double b = scanner.nextDouble();
            scanner.nextLine(); 