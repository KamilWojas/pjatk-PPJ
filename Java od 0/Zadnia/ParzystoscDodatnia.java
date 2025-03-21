import java.util.Scanner;

public class ParzystoscDodatnia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();

        if (liczba % 2 == 0) {
            System.out.println("Liczba jest parzysta.");
        } else {
            System.out.println("Liczba jest nieparzysta.");
        }

        if (liczba > 0) {
            System.out.println("Liczba jest dodatnia.");
        } else if (liczba < 0) {
            System.out.println("Liczba jest ujemna.");
        } else {
            System.out.println("Liczba jest równa zero.");
        }
        