import java.util.ArrayList;
import java.util.Scanner;

class Ksiazka{
    private String tytul;
    private String autor;
    private int rokWydania;
    private boolean dostepne;

    public Ksiazka(String tytul, String autor, int rokWydania, boolean dostepne){
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.dostepne = true;
    }

    public boolean wypozycz(){
        if (dostepne){
            dostepne = true;
            return true;
        }
        return false;
    }

    public void zwroc(){
        dostepne = true;
    }

    public String toString(){
        return tytul + " - " + autor + " (" + rokWydania + ") - " + (dostepne ? "Dostępna" : "Wypożyczona");
    }
    
    public String getTytul(){
        return tytul;
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Ksiazka> biblioteka = new ArrayList<>();

        while (true){
            System.out.println("\nWybierz opcję:");
            System.out.println("1. Dodaj książkę");
            System.out.println("2. Wypożycz książkę");
            System.out.println("3. Zwróć książkę");
            System.out.println("4. Wyświetl wszystkie książki");
            System.out.println("5. Zakończ program");

            int opcja = scanner.nextInt();
            scanner.nextLine();

            switch (opcja) {
                case 1: 
                    System.out.print("Podaj tytuł: ");
                    String tytul = scanner.nextLine();

                    System.out.print("Podaj autora: ");
                    String autor = scanner.nextLine();

                    System.out.print("Podaj rok wydania: ");
                    int rok = scanner.nextInt();
                    scanner.nextLine();

                    biblioteka.add(new Ksiazka(tytul, autor, rok));
                    System.out.println("Książka dodana!");
                    break;

                case 2: 
                    System.out.print("Podaj tytuł książki: ");
                    String szukanyTytul = scanner.nextLine();

                    Ksiazka ksiazkaDoWypozyczenia = znajdzKsiazke(biblioteka, szukanyTytul);
                    if (ksiazkaDoWypozyczenia != null && ksiazkaDoWypozyczenia.wypozycz()) {
                        System.out.println("Książka została wypożyczona.");
                    } else {
                        System.out.println("Książka jest niedostępna lub nie istnieje.");
                    }
                    break;

                case 3: 
                    System.out.print("Podaj tytuł książki: ");
                    String tytulZwrotu = scanner.nextLine();

                    Ksiazka ksiazkaDoZwrotu = znajdzKsiazke(biblioteka, tytulZwrotu);
                    if (ksiazkaDoZwrotu != null) {
                        ksiazkaDoZwrotu.zwroc();
                        System.out.println("Książka została zwrócona.");
                    } else {
                        System.out.println("Nie znaleziono takiej książki.");
                    }
                    break;

                case 4: 
                    System.out.println("\nLista książek:");
                    for (Ksiazka ksiazka : biblioteka) {
                        System.out.println(ksiazka);
                    }
                    break;
    }
}