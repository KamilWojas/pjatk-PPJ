import java.util.ArrayList;
import java.util.Scanner;


class Zadanie{
    private String opis;
    private String priorytet;
    private boolean ukonczone;

    public Zadanie(String opis, String priorytet){
        this.opis = opis;
        this.priorytet = priorytet;
        this.ukonczone = false;
    }

    public void oznaczJakoUkonczone() {
        this.ukonczone = true;
    }

    public String toString() {
        return opis + " (" + priorytet + ") - " + (ukonczone ? " Ukończone" : " Nieukończone");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Zadanie> listaZadan = new ArrayList<>();

        while (true) {
            System.out.println("\nWybierz opcję:");
            System.out.println("1. Dodaj zadanie");
            System.out.println("2. Oznacz zadanie jako ukończone");
            System.out.println("3. Usuń zadanie");
            System.out.println("4. Wyświetl wszystkie zadania");
            System.out.println("5. Zakończ program");

            int opcja = scanner.nextInt();
            scanner.nextLine();

            switch (opcja) {
                case 1: 
                    System.out.print("Podaj opis zadania: ");
                    String opis = scanner.nextLine();

                    System.out.print("Podaj priorytet (niski/średni/wysoki): ");
                    String priorytet = scanner.nextLine().toLowerCase();

                    listaZadan.add(new Zadanie(opis, priorytet));
                    System.out.println("Zadanie dodane!");
                    break;

                case 2: 
                    if (listaZadan.isEmpty()) {
                        System.out.println("Brak zadań na liście.");
                        break;
                    }


            }