// Klasa bazowa Pracownik
class Pracownik {
    protected String imię;
    protected String nazwisko;
    protected double wynagrodzeniePodstawowe;

    // Konstruktor
    public Pracownik(String imię, String nazwisko, double wynagrodzeniePodstawowe) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.wynagrodzeniePodstawowe = wynagrodzeniePodstawowe;
    }

    // Metoda opisująca pracownika
    public String opis() {
        return "Imię: " + imię + ", Nazwisko: " + nazwisko + ", Wynagrodzenie podstawowe: " + wynagrodzeniePodstawowe;
    }
}

// Klasa PracownikEtatowy dziedzicząca po Pracownik
class PracownikEtatowy extends Pracownik {
    private double premia;

    // Konstruktor
    public PracownikEtatowy(String imię, String nazwisko, double wynagrodzeniePodstawowe, double premia) {
        super(imię, nazwisko, wynagrodzeniePodstawowe); // Wywołanie konstruktora klasy bazowej
        this.premia = premia;
    }

    // Nadpisanie metody opis
    @Override
    public String opis() {
        return super.opis() + ", Premia: " + premia + ", Pełne wynagrodzenie: " + (wynagrodzeniePodstawowe + premia);
    }
}

// Klasa PracownikZlecenie dziedzicząca po Pracownik
class PracownikZlecenie extends Pracownik {
    private int liczbaGodzin;
    private double stawkaZaGodzinę;

    // Konstruktor
    public PracownikZlecenie(String imię, String nazwisko, double wynagrodzeniePodstawowe, int liczbaGodzin, double stawkaZaGodzinę) {
        super(imię, nazwisko, wynagrodzeniePodstawowe); // Wywołanie konstruktora klasy bazowej
        this.liczbaGodzin = liczbaGodzin;
        this.stawkaZaGodzinę = stawkaZaGodzinę;
    }

    // Nadpisanie metody opis
    @Override
    public String opis() {
        double wynagrodzenieCałkowite = liczbaGodzin * stawkaZaGodzinę;
        return "Imię: " + imię + ", Nazwisko: " + nazwisko + ", Wynagrodzenie całkowite: " + wynagrodzenieCałkowite;
    }
}

// Klasa główna
import java.util.ArrayList;
        import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektów
        Pracownik etatowy = new PracownikEtatowy("Jan", "Kowalski", 4000, 1000);
        Pracownik zlecenie = new PracownikZlecenie("Anna", "Nowak", 0, 120, 20);

        // Tworzenie listy pracowników
        List<Pracownik> pracownicy = new ArrayList<>();
        pracownicy.add(etatowy);
        pracownicy.add(zlecenie);

        // Wyświetlanie opisów pracowników
        for (Pracownik p : pracownicy) {
            System.out.println(p.opis());
        }
    }
}


/*
Wynik działania programu
Dla pracowników:

Etatowy: Jan Kowalski, wynagrodzenie podstawowe: 4000, premia: 1000.
Zlecenie: Anna Nowak, liczba godzin: 120, stawka za godzinę: 20.


Wynik działania programu
Dla pracowników:
Etatowy: Jan Kowalski, wynagrodzenie podstawowe: 4000, premia: 1000.
Zlecenie: Anna Nowak, liczba godzin: 120, stawka za godzinę: 20.
 */