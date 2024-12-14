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
