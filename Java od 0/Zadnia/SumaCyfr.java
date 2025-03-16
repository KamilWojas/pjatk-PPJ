import java.util.Scanner;

public class SumaCyfr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int n = scanner.nextInt();

        int suma = obliczSumeCyfr(Math.abs(n));

        System.out.println("Suma cyfr liczby " + Math.abs(n) + " wynosi: " + suma);
