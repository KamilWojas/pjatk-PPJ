import java.util.Scanner;

public class MinMaxTablica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ilość liczb: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Ilość liczb musi być większa niż 0!");
            return;
        }

        int[] liczby = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Podaj liczbę " + (i + 1) + ": ");
            liczby[i] = scanner.nextInt();
        }
