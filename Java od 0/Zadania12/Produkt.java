import java.util.ArrayList;
import java.util.List;

class Produkt {
    private String nazwa;
    private double cena;

    public Produkt(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }
    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return nazwa + " - " + cena + " PLN";
    }
}

class Klient {
    private String imie;
    private List<Produkt> koszyk;

    public Klient(String imie) {
        this.imie = imie;
        this.koszyk = new ArrayList<>();
    }

    public void dodajProdukt(Produkt produkt) {
        koszyk.add(produkt);
    }
    public void wyswietlKoszyk() {
        System.out.println("Koszyk klienta: " + imie);
        for (Produkt p : koszyk) {
            System.out.println(p);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Klient klient1 = new Klient("Jan Kowalski");

        Produkt p1 = new Produkt("Chleb", 3.50);
        Produkt p2 = new Produkt("Mleko", 2.80);

        klient1.dodajProdukt(p1);
        klient1.dodajProdukt(p2);
        klient1.dodajProdukt(p1); 
        klient1.dodajProdukt(p2);


