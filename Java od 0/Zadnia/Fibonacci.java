import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Błąd: Liczba musi być nieujemna!");
        } else {
            System.out.println("Ciąg Fibonacciego (" + n + " liczb):");
            wypiszFibonacci(n);
        }

        scanner.close();
    }

    public static void wypiszFibonacci(int n) {
        long a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + (i < n - 1 ? ", " : "\n"));