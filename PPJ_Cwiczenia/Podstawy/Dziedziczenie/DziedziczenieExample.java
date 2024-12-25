// Klasa bazowa
class Pojazd {
    String marka;

    public void ustawMarke(String marka) {
        this.marka = marka;
    }

    public void wyswietlInformacje() {
        System.out.println("Marka pojazdu: " + marka);
    }
}
// Klasa pochodna
class Samochód extends Pojazd {
    String model;

    public void ustawModel(String model) {
        this.model = model;
    }

    @Override // Nadpisujemy metodę z klasy bazowej
    public void wyswietlInformacje() {
        super.wyswietlInformacje(); // Wywołujemy metodę z klasy bazowej
        System.out.println("Model samochodu: " + model);
    }
}

// Program główny
public class DziedziczenieExample {
    public static void main(String[] args) {
        Samochód auto = new Samochód();
        auto.ustawMarke("Toyota");
        auto.ustawModel("Corolla");
        auto.wyswietlInformacje();
    }
}


