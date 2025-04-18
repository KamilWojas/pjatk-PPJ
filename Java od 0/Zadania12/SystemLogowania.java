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

            switch (wybor) {
                case "1":
                    System.out.print("Podaj login: ");
                    String nowyLogin = scanner.nextLine();

                    if (uzytkownicy.containsKey(nowyLogin)) {
                        System.out.println("Taki login już istnieje.");
                    } else {
                        System.out.print("Podaj hasło: ");
                        String haslo = scanner.nextLine();
                        uzytkownicy.put(nowyLogin, haslo);
                        System.out.println("Zarejestrowano pomyślnie!");
                    }
                    break;

                case "2":
                    System.out.print("Login: ");
                    String login = scanner.nextLine();
                    System.out.print("Hasło: ");
                    String hasloLogowanie = scanner.nextLine();

                    if (uzytkownicy.containsKey(login) &&
                            uzytkownicy.get(login).equals(hasloLogowanie)) {
                        System.out.println("Zalogowano pomyślnie!");
                    } else {
                        System.out.println("Błędny login lub hasło.");
                    }
                    break;
                    
                case "3":
                    System.out.println("Zamykanie programu...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Nieznana opcja.");
            }
        }
    }
}