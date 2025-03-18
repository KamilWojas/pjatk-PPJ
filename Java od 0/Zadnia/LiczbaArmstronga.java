import java.util.Scanner;

public class LiczbaArmstronga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int n = scanner.nextInt();

        if (czyLiczbaArmstronga(n)) {
            System.out.println("Liczba " + n + " jest liczbą Armstronga.");
        } else {
            System.out.println("Liczba " + n + " nie jest liczbą Armstronga.");
        }

        scanner.close();
    }