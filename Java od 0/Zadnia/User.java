import java.util.Scanner;

class User {
    String username;
    String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Użytkownik: " + username + ", Email: " + email;
    }
}

    public class RejestracjaUzytkownika {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj nazwę użytkownika: ");
            String username = scanner.nextLine();

            System.out.print("Podaj adres email: ");
            String email = scanner.nextLine();

            boolean poprawnyEmail = email.contains("@") && email.contains(".");
            boolean poprawnaNazwa = !username.trim().isEmpty();

            if (poprawnyEmail && poprawnaNazwa) {
                User user = new User(username, email);
                System.out.println("Rejestracja udana!");
                System.out.println(user);
            } else {
                System.out.println("Błąd: Nieprawidłowe dane.");
                if (!poprawnaNazwa) System.out.println("– Nazwa użytkownika nie może być pusta.");
                if (!poprawnyEmail) System.out.println("– Email musi zawierać '@' i '.'");
            }

            scanner.close();
        }
    }
