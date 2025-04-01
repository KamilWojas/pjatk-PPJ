import java.util.Scanner;

public class KonwerterJednostek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- KONWERTER JEDNOSTEK ---");
        System.out.print("Podaj wartość (liczba): ");
        double wartosc = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Z jakiej jednostki? (m, km, mile): ");
        String z = scanner.nextLine().toLowerCase();

        System.out.print("Na jaką jednostkę? (m, km, mile): ");
        String na = scanner.nextLine().toLowerCase();

        double wynik = convert(wartosc, z, na);

        if (Double.isNaN(wynik)) {
            System.out.println("Nieprawidłowa konwersja.");
        } else {
            System.out.printf("%.2f %s = %.2f %s\n", wartosc, z, wynik, na);
        }

        scanner.close();
    }

    public static double convert(double val, String from, String to) {
        if (from.equals(to)) return val;