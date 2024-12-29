/*
Napisz program sprawdzający,

 */

// Klasa bazowa
class Zwierzę {
    String nazwa; // Pole przechowujące nazwę zwierzęcia

    // Metoda ustawiająca nazwę zwierzęcia
    public void ustawNazwę(String nazwa) {
        this.nazwa = nazwa;
    }

    // Metoda do wydawania dźwięku
    public void wydajDzwiek() {
        System.out.println("Zwierzę wydaje dźwięk");
    }
}

// Klasa pochodna
class Pies extends Zwierzę {
    // Nadpisujemy metodę wydajDzwiek, aby pies szczekał
    @Override
    public void wydajDzwiek() {
        System.out.println("Hau!");
    }
}

    // Program główny
public class ZwierzęExample {
    public static void main(String[] args) {
        // Tworzymy obiekt klasy Pies
        Pies pies = new Pies();
        pies.ustawNazwę("Burek"); // Ustawiamy nazwę psa
        System.out.println("Pies o imieniu: " + pies.nazwa);
        pies.wydajDzwiek(); // Wywołujemy metodę, aby pies zaszczekał
    }
}


Wyjaśnienie:
        Klasa Zwierzę:
        Zawiera pole nazwaoraz metody ustawNazwęi wydajDzwiek.
        wydajDzwiekw tej klasie wypisuje ogólny tekst: „Zwierzę wydaje dźwięk”.
        Klasa Pies:
        Dziedziczy wszystkie pola i metody klasy Zwierzę.
        Nadpisuje wydajDzwiek, aby wypisać "Hau!".
        Program główny:
        Tworzy obiekt Pies, ustala jego pozostałości i metody alternatywne.