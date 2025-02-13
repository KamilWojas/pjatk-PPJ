import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobranie dwóch liczb od użytkownika
        System.out.print("Podaj pierwszą liczbę: ");
        int liczba1 = scanner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int liczba2 = scanner.nextInt();

        // Instrukcja warunkowa
        if (liczba1 > liczba2) {
            System.out.println("Większa liczba to: " + liczba1);
        } else if (liczba1 < liczba2) {
            System.out.println("Większa liczba to: " + liczba2);

    }