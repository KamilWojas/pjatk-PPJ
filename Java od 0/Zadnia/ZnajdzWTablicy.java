import java.util.Scanner;

public class ZnajdzWTablicy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] liczby = {3, 7, 12, 25, 33, 42};

        System.out.print("Podaj liczbę do wyszukania: ");
        int szukana = scanner.nextInt();

        boolean znaleziono = false;
