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
        } else {
            System.out.println("Hasło NIE spełnia wymagań.");
            if (!dlugosc) System.out.println("– musi mieć co najmniej 8 znaków");
            if (!cyfra) System.out.println("– musi zawierać cyfrę");
            if (!wielka) System.out.println("– musi zawierać wielką literę");
            if (!specjalny) System.out.println("– musi zawierać znak specjalny (!@#$...)");
        }