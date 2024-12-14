// Klasa bazowa Książka
class Książka {
    protected String tytuł;
    protected String autor;

    // Konstruktor
    public Książka(String tytuł, String autor) {
        this.tytuł = tytuł;
        this.autor = autor;
    }

    // Metoda opisująca książkę
    public String opis() {
        return "Tytuł: " + tytuł + ", Autor: " + autor;
    }
}

// Klasa Ebook dziedzicząca po Książka
class Ebook extends Książka {
    private double rozmiarPlikuMB;

    // Konstruktor
    public Ebook(String tytuł, String autor, double rozmiarPlikuMB) {
        super(tytuł, autor); // Wywołanie konstruktora klasy bazowej
        this.rozmiarPlikuMB = rozmiarPlikuMB;
    }

    // Nadpisanie metody opis
    @Override
    public String opis() {
        return super.opis() + ", Rozmiar pliku: " + rozmiarPlikuMB + " MB";
    }
}

// Klasa Audiobook dziedzicząca po Książka
class Audiobook extends Książka {
    private double czasTrwania;
    private String lektor;

    // Konstruktor
    public Audiobook(String tytuł, String autor, double czasTrwania, String lektor) {
        super(tytuł, autor); // Wywołanie konstruktora klasy bazowej
        this.czasTrwania = czasTrwania;
        this.lektor = lektor;
    }

    // Nadpisanie metody opis
    @Override
    public String opis() {
        return super.opis() + ", Czas trwania: " + czasTrwania + " godzin, Lektor: " + lektor;
    }
}

// Klasa główna
import java.util.ArrayList;
        import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektów
        Książka książka = new Książka("Duma i Uprzedzenie", "Jane Austen");
        Ebook ebook = new Ebook("Java dla początkujących", "John Doe", 1.5);
        Audiobook audiobook = new Audiobook("Sherlock Holmes", "Arthur Conan Doyle", 8.0, "Jan Kowalski");

        // Tworzenie listy książek
        List<Książka> biblioteka = new ArrayList<>();
        biblioteka.add(książka);
        biblioteka.add(ebook);
        biblioteka.add(audiobook);

        // Wyświetlanie opisów książek
        for (Książka ks : biblioteka) {
            System.out.println(ks.opis());
        }
    }
}


/*
Wynik działania programu
Dla książek:

Tytuł: "Duma i Uprzedzenie", autor: "Jane Austen".
Ebook: "Java dla początkujących", autor: "John Doe", rozmiar: 1.5 MB.
Audiobook: "Sherlock Holmes", autor: "Arthur Conan Doyle", czas trwania: 8 godzin, lektor: "Jan Kowalski".
 */