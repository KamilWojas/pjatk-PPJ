import java.util.Scanner;

public class KonwersjaNaBinarny {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();

        if (liczba == 0) {
            System.out.println("Binarnie: 0");
            return;
        }