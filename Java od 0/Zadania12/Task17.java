import java.util.ArrayList;
import java.util.List;

class Osoba {
    private String imie;
    private static List<Osoba> ekstensja = new ArrayList<>();

    public Osoba(String imie) {
        this.imie = imie;
        ekstensja.add(this);
    }
