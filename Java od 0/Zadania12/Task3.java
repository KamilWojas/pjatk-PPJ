import java.util.Scanner;

public class Task3 extends Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        String wynik = (liczba % 2 == 0) ? "Parzysta" : "Nieparzysta";

        System.out.println("Liczba jest: " + wynik);

    }