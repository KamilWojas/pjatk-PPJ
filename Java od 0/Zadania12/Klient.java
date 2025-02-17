import java.util.HashMap;
import java.util.Map;

class Klient {
    private String imie;
    private Map<Produkt, Integer> koszyk;

    public Klient(String imie) {
        this.imie = imie;
        this.koszyk = new HashMap<>();
    }

    public void dodajProdukt(Produkt produkt) {
        koszyk.put(produkt, koszyk.getOrDefault(produkt, 0) + 1);
    }