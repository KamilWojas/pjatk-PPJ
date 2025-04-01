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