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