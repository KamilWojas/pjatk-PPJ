import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // Tablica kierunków i odpowiadające im strzałki Unicode
        String[] directions = {"North", "East", "South", "West"};
        char[] arrows = {'\u2191', '\u2192', '\u2193', '\u2190'}; // ↑ → ↓ ←

        int currentDirection = 0; // 0 = North
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kompas startowy: " + directions[currentDirection] + " " + arrows[currentDirection]);
        System.out.println("Użyj 'A' aby obrócić w lewo i 'D' aby obrócić w prawo. 'Q' aby zakończyć.");

        while (true) {
            System.out.print("Wprowadź komendę: ");
            char command = scanner.next().charAt(0);

            if (command == 'A' || command == 'a') {
                currentDirection = (currentDirection + 3) % 4; // Obrót w lewo
                System.out.println("Obrócono w lewo. Aktualny kierunek: " + directions[currentDirection] + " " + arrows[currentDirection]);
            } else if (command == 'D' || command == 'd') {
                currentDirection = (currentDirection + 1) % 4; // Obrót w prawo
                System.out.println("Obrócono w prawo. Aktualny kierunek: " + directions[currentDirection] + " " + arrows[currentDirection]);
            } else if (command == 'Q' || command == 'q') {
                System.out.println("Zakończono działanie kompasu.");
                break;
            } else {
                System.out.println("Nieprawidłowa komenda. Użyj 'A', 'D' lub 'Q'.");
            }
        }

        scanner.close();
    }
}
