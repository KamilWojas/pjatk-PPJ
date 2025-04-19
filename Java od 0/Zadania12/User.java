import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {
    String username;
    String email;
    int age;

    public User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User: " + username + ", Email: " + email + ", Age: " + age;
    }
}

public class ListaUzytkownikow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<User> users = new ArrayList<>();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Dodaj użytkownika");
            System.out.println("2. Wyświetl wszystkich użytkowników");
            System.out.println("3. Wyjdź");
            System.out.print("Wybierz opcję: ");
            String wybor = scanner.nextLine();