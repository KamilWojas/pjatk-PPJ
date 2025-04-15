import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SystemLogowania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> uzytkownicy = new HashMap<>();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Rejestracja");
            System.out.println("2. Logowanie");
            System.out.println("3. Wyjście");
            System.out.print("Wybierz opcję: ");
            String wybor = scanner.nextLine();
    }