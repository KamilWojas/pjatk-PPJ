import java.util.ArrayList;
import java.util.List;

class Osoba {
    private String imie;
    private static List<Osoba> ekstensja = new ArrayList<>();

    public Osoba(String imie) {
        this.imie = imie;
        ekstensja.add(this);
    }

    public static void pokazEkstensje() {
        for (Osoba o : ekstensja) {
            System.out.println(o.imie);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        new Osoba("Jan");
        new Osoba("Anna");
        Osoba.pokazEkstensje();
    }
}