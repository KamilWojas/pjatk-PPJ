import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Aktor {
    private String imieNazwisko;

    public Aktor(String imieNazwisko) {
        this.imieNazwisko = imieNazwisko;
    }

    public String getImieNazwisko() {
        return imieNazwisko;
    }
}

class FilmManager {
    private Map<String, List<Aktor>> filmy = new HashMap<>();

    public void dodajAktorDoFilmu(String tytul, Aktor aktor) {
        filmy.computeIfAbsent(tytul, k -> new ArrayList<>()).add(aktor);
    }