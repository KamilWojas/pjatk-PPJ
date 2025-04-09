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

            switch (wybor) {
                case "dodaj":
                    System.out.println("Wynik: " + (a + b));
                    break;
                case "odejmij":
                    System.out.println("Wynik: " + (a - b));
                    break;
                case "pomnóż":
                    System.out.println("Wynik: " + (a * b));
                    break;
                case "podziel":
                    if (b != 0) {
                        System.out.println("Wynik: " + (a / b));
                    } else {
                        System.out.println("Nie można dzielić przez zero.");
                    }
                    break;
                default:
                    System.out.println("Nieznana opcja.");
            }

        } while (!wybor.equals("wyjście"));