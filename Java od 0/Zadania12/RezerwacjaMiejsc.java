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

            switch (wybor) {
                case "1":
                    System.out.println("Stan miejsc (O = wolne, X = zajęte):");
                    for (int i = 0; i < sala.length; i++) {
                        System.out.print("Rząd " + (i + 1) + ": ");
                        for (int j = 0; j < sala[i].length; j++) {
                            System.out.print(sala[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

