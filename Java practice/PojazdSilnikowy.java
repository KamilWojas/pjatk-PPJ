// Klasa bazowa PojazdSilnikowy
class PojazdSilnikowy {
    protected String color;
    protected int pojemnoscSilnika;

    // Konstruktor
    public PojazdSilnikowy(String color, int pojemnoscSilnika) {
        this.color = color;
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    // Metoda opisująca pojazd
    public String opis() {
        return "Kolor: " + color + ", Pojemność silnika: " + pojemnoscSilnika + "L";
    }
}

// Klasa dziedzicząca SamochodOsobowy
class SamochodOsobowy extends PojazdSilnikowy {
    private int iloscMiejsc;

    // Konstruktor
    public SamochodOsobowy(String color, int pojemnoscSilnika, int iloscMiejsc) {
        super(color, pojemnoscSilnika); // Wywołanie konstruktora klasy bazowej
        this.iloscMiejsc = iloscMiejsc;
    }

    // Nadpisanie metody opis
    @Override
    public String opis() {
        return super.opis() + ", Ilość miejsc: " + iloscMiejsc;
    }
}

// Klasa dziedzicząca Ciezarowka
class Ciezarowka extends PojazdSilnikowy {
    private double ladownosc;

    // Konstruktor
    public Ciezarowka(String color, int pojemnoscSilnika, double ladownosc) {
        super(color, pojemnoscSilnika); // Wywołanie konstruktora klasy bazowej
        this.ladownosc = ladownosc;
    }

    // Nadpisanie metody opis
    @Override
    public String opis() {
        return super.opis() + ", Ładowność: " + ladownosc + "T";
    }
}

// Klasa główna
public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektów
        SamochodOsobowy samochod = new SamochodOsobowy("Czarny", 2, 5);
        Ciezarowka ciezarowka = new Ciezarowka("Biały", 6, 10);

        // Wyświetlanie opisu pojazdów
        System.out.println(samochod.opis());
        System.out.println(ciezarowka.opis());
    }
}


/*
Wyjaśnienie
Klasa PojazdSilnikowy:

To klasa bazowa definiująca wspólne cechy dla wszystkich pojazdów silnikowych (kolor i pojemność silnika).
Metoda opis() wyświetla te właściwości.
Klasa SamochodOsobowy:

Dziedziczy po PojazdSilnikowy.
Dodaje pole iloscMiejsc i odpowiednio modyfikuje metodę opis().
Klasa Ciezarowka:

Dziedziczy po PojazdSilnikowy.
Dodaje pole ladownosc i odpowiednio modyfikuje metodę opis().
Klasa Main:

Demonstruje działanie hierarchii klas, tworząc obiekty i wyświetlając ich opisy.
 */

/*
Wynik działania programu
Dla danych:

Samochód osobowy: kolor Czarny, pojemność silnika 2L, liczba miejsc 5.
Ciężarówka: kolor Biały, pojemność silnika 6L, ładowność 10T.

Kolor: Czarny, Pojemność silnika: 2L, Ilość miejsc: 5
Kolor: Biały, Pojemność silnika: 6L, Ładowność: 10T

 */