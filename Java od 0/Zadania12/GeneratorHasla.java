import java.security.SecureRandom;
import java.util.Scanner;

public class GeneratorHasla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String znaki = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        SecureRandom random = new SecureRandom();

        System.out.print("Podaj długość hasła: ");
        int dlugosc = scanner.nextInt();

        if (dlugosc < 6) {
            System.out.println("Hasło powinno mieć co najmniej 6 znaków.");
            scanner.close();
            return;
        }