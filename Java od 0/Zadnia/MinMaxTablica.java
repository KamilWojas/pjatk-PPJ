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

        int min = liczby[0];
        int max = liczby[0];

        for (int i = 1; i < n; i++) {
            if (liczby[i] < min) {
                min = liczby[i];
            }
            if (liczby[i] > max) {
                max = liczby[i];
            }
        }
        
        System.out.println("Największa liczba: " + max);
        System.out.println("Najmniejsza liczba: " + min);

        scanner.close();
    }
}