import java.util.Scanner;

public class RezerwacjaMiejsc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] sala = new char[5][6];

        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                sala[i][j] = 'O';
            }
        }

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Pokaż miejsca");
            System.out.println("2. Zarezerwuj miejsce");
            System.out.println("3. Wyjdź");
            System.out.print("Wybierz opcję: ");
            String wybor = scanner.nextLine();
