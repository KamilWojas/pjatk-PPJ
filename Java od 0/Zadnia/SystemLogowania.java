import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SystemLogowania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> konta = new HashMap<>();
        konta.put("admin", "1234");
        konta.put("user", "haslo");
        konta.put("goscia", "guest");

        int proby = 0;
        boolean zalogowano = false;

        while (proby < 3) {
            System.out.print("Login: ");
            String login = scanner.nextLine();

            System.out.print("Hasło: ");
            String haslo = scanner.nextLine();

            if (konta.containsKey(login)) {
                if (konta.get(login).equals(haslo)) {
                    System.out.println("Zalogowano pomyślnie! ✅");
                    zalogowano = true;
                    break;
                } else {
                    System.out.println("Błędne hasło.");
                }
            } else {
                System.out.println("Nieznany login.");
            }

            proby++;
            System.out.println("Pozostało prób: " + (3 - proby));
        }
        
        if (!zalogowano) {
            System.out.println("Zbyt wiele nieudanych prób. Dostęp zablokowany.");
        }

        scanner.close();
    }
}