// Klasa Osoba
class Osoba {
    private String imie;

    // Konstruktor
    public Osoba(String imie) {
        this.imie = imie;
    }

    // Metoda wyświetlająca informacje o obiekcie klasy Osoba
    public String wyswietl() {
        return "Imię: " + imie;
    }
}

// Klasa Spawacz dziedzicząca po Osoba
class Spawacz extends Osoba {
    private int stazPracy;

    // Konstruktor
    public Spawacz(String imie, int stazPracy) {
        super(imie); // Wywołanie konstruktora klasy bazowej
        this.stazPracy = stazPracy;
    }

    // Metoda wyświetlająca informacje o obiekcie klasy Spawacz
    @Override
    public String wyswietl() {
        return super.wyswietl() + ", Staż pracy: " + stazPracy + " lat";
    }
}

// Klasa główna do testowania
public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektu klasy Osoba
        Osoba osoba = new Osoba("Jan");

        // Tworzenie obiektu klasy Spawacz
        Spawacz spawacz = new Spawacz("Adam", 10);

        // Wyświetlanie informacji o obiektach
        System.out.println(osoba.wyswietl());
        System.out.println(spawacz.wyswietl());
    }
}

/*
Zawiera prywatne pole imie.
Konstruktor klasy inicjalizuje pole imie.
Metoda wyswietl zwraca informacje o imieniu.
Klasa Spawacz:

Dziedziczy po klasie Osoba.
Dodaje pole stazPracy reprezentujące staż pracy w latach.
Konstruktor wywołuje konstruktor klasy bazowej za pomocą super.
Nadpisuje metodę wyswietl, która wykorzystuje super.wyswietl do pobrania informacji z klasy bazowej i dodaje informacje o stażu pracy.
Klasa Main:

Tworzy obiekt klasy Osoba i obiekt klasy Spawacz.
Wywołuje metodę wyswietl dla obu obiektów i wypisuje wyniki na konsolę.

 */

/*
Imię: Jan
Imię: Adam, Staż pracy: 10 lat

 */