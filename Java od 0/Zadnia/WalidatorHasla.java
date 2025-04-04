import java.util.Scanner;

public class WalidatorHasla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj hasło: ");
        String haslo = scanner.nextLine();

        boolean dlugosc = haslo.length() >= 8;
        boolean cyfra = haslo.matches(".*\\d.*");
        boolean wielka = haslo.matches(".*[A-Z].*");
        boolean specjalny = haslo.matches(".*[!@#$%^&*()].*");

        if (dlugosc && cyfra && wielka && specjalny) {
            System.out.println("Hasło jest silne.");