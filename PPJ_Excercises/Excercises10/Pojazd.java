// Klasa bazowa Pojazd
class Pojazd {
    protected String color;

    // Konstruktor
    public Pojazd(String color) {
        this.color = color;
    }

    // Metoda wyświetlająca kolor pojazdu
    public String getColor() {
        return "Kolor pojazdu: " + color;
    }
}

// Klasa pochodna PojazdKolowy
class PojazdKolowy extends Pojazd {
    private int iloscOsi;

    // Konstruktor
    public PojazdKolowy(String color, int iloscOsi) {
        super(color); // Wywołanie konstruktora klasy bazowej
        this.iloscOsi = iloscOsi;
    }

    // Metoda wyświetlająca ilość osi
    public int getIloscOsi() {
        return iloscOsi;
    }
}

// Klasa pochodna CiagnikSiodlowy
class CiagnikSiodlowy extends PojazdKolowy {
    private double masa; // Masa pojazdu

    // Konstruktor
    public CiagnikSiodlowy(String color, int iloscOsi, double masa) {
        super(color, iloscOsi); // Wywołanie konstruktora klasy bazowej
        this.masa = masa;
    }

    // Metoda rozpoczynająca jazdę
    public void rozpocznijJazde() {
        double naciskNaOs = masa / getIloscOsi();
        if (naciskNaOs > 11) {
            System.out.println("Jazda niebezpieczna, odmowa uruchomienia silnika.");
        } else {
            System.out.println("Jazda bezpieczna, silnik uruchomiony.");
        }
    }
}

// Klasa główna do testowania
public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektu CiagnikSiodlowy
        CiagnikSiodlowy ciagnik = new CiagnikSiodlowy("Czerwony", 4, 40);

        // Wyświetlanie koloru i ilości osi
        System.out.println(ciagnik.getColor());
        System.out.println("Ilość osi: " + ciagnik.getIloscOsi());

        // Sprawdzanie jazdy
        ciagnik.rozpocznijJazde();
    }
}
