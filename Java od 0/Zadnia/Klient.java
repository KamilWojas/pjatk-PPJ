import java.util.HashMap;
import java.util.Map;

class Klient {
    private String imie;
    private Map<Produkt, Integer> koszyk;

    public Klient(String imie) {
        this.imie = imie;
        this.koszyk = new HashMap<>();
    }
