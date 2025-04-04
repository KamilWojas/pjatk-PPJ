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
    
    public class RejestracjaUzytkownika {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);