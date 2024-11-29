import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Wprowadzenie liczby przez użytkownika
        System.out.print("Podaj liczbę rzeczywistą: ");
        double number = scanner.nextDouble();

        // Sprawdzenie przedziału
        boolean isInA = (number >= 0);  // A = [0, ∞)
        boolean isInB = (number <= 1);  // B = (-∞, 1]
        boolean isInC = (number >= 0 && number <= 1);  // C = [0, 1]

        // Wynik
        System.out.println("Podana liczba należy do przedziału A: " + isInA);
        System.out.println("Podana liczba należy do przedziału B: " + isInB);
        System.out.println("Podana liczba należy do przedziału C: " + isInC);

        scanner.close();
    }

}
