import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaZadan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> zadania = new ArrayList<>();

        int opcja;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Dodaj zadanie");
            System.out.println("2. Pokaż zadania");
            System.out.println("3. Wyjście");
            System.out.print("Wybierz opcję: ");

            opcja = scanner.nextInt();
            scanner.nextLine();

            switch (opcja) {
                case 1:
                    System.out.print("Wpisz treść zadania: ");
                    String zadanie = scanner.nextLine();
                    zadania.add(zadanie);
                    System.out.println("Dodano!");
                    break;

                case 2:
                    System.out.println("Twoje zadania:");
                    if (zadania.isEmpty()) {
                        System.out.println("(Brak zadań)");
                    } else {
                        for (int i = 0; i < zadania.size(); i++) {
                            System.out.println((i + 1) + ". " + zadania.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("Zakończono program.");
                    break;
                default:
                    System.out.println("Nieprawidłowa opcja!");
            }
        } while (opcja != 3);

        scanner.close();
    } 
}