// Klasa bazowa Urządzenie
class Urządzenie {
    protected String producent;
    protected String model;

    // Konstruktor
    public Urządzenie(String producent, String model) {
        this.producent = producent;
        this.model = model;
    }
    // Metoda opisująca urządzenie
    public String opis() {
        return "Producent: " + producent + ", Model: " + model;
    }
}

// Klasa dziedzicząca Komputer
class Komputer extends Urządzenie {
    private double mocObliczeniowa; // Moc obliczeniowa w GFLOPS

    // Konstruktor
    public Komputer(String producent, String model, double mocObliczeniowa) { 
        super(producent, model); // Wywołanie konstruktora klasy bazowej
        this.mocObliczeniowa = mocObliczeniowa;
    }

    // Nadpisanie metody opis
    @Override
    public String opis() {
        return super.opis() + ", Moc obliczeniowa: " + mocObliczeniowa + " GFLOPS";
    }
}

// Klasa dziedzicząca Telefon 
class Telefon extends Urządzenie {
    private boolean dualSIM; // Czy obsługuje dual SIM

    // Konstruktor
    public Telefon(String producent, String model, boolean dualSIM) {
        super(producent, model); // Wywołanie konstruktora klasy bazowej
        this.dualSIM = dualSIM;
    }

    // Nadpisanie metody opis
    @Override
    public String opis() {
        return super.opis() + ", Dual SIM: " + dualSIM;
    }
}

// Klasa główna
import java.util.ArrayList;
        import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektów
        Komputer komputer = new Komputer("Dell", "XPS 15", 250.0);
        Telefon telefon = new Telefon("Samsung", "Galaxy S21", true);
        Telefon telefon2 = new Telefon("Apple", "iPhone 13", false);

        // Tworzenie listy urządzeń
        List<Urządzenie> urządzenia = new ArrayList<>();
        urządzenia.add(komputer);
        urządzenia.add(telefon);
        urządzenia.add(telefon2);

        // Wyświetlanie opisów urządzeń
        for (Urządzenie urządzenie : urządzenia) {
            System.out.println(urządzenie.opis());
        }
    }
}


/*
Wyjaśnienie
Klasa Urządzenie:

Klasa bazowa dla wszystkich urządzeń.
Zawiera pola producent i model oraz metodę opis().
Klasa Komputer:

Dziedziczy po Urządzenie.
Dodaje pole mocObliczeniowa i nadpisuje metodę opis().
Klasa Telefon:

Dziedziczy po Urządzenie.
Dodaje pole dualSIM i nadpisuje metodę opis().
Klasa Main:

Demonstruje użycie hierarchii poprzez listę obiektów i wywoływanie metody opis().
 */

/*
Wynik działania programu
Dla urządzeń:

Komputer: producent Dell, model XPS 15, moc obliczeniowa 250 GFLOPS.
Telefon 1: producent Samsung, model Galaxy S21, dual SIM true.
Telefon 2: producent Apple, model iPhone 13, dual SIM false.

Wynik działania:
Producent: Dell, Model: XPS 15, Moc obliczeniowa: 250.0 GFLOPS
Producent: Samsung, Model: Galaxy S21, Dual SIM: true
Producent: Apple, Model: iPhone 13, Dual SIM: false
*/