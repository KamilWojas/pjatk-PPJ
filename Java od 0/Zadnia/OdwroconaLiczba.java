import java.util.Scanner;

public class OdwroconaLiczba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int n = scanner.nextInt();

        int odwrocona = odwrocLiczbe(n);
