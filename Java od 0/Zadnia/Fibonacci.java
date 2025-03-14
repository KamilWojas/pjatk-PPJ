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
