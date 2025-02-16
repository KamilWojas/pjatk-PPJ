import java.util.*;

class Aktor {
    private String imieNazwisko;

    public Aktor(String imieNazwisko) {
        this.imieNazwisko = imieNazwisko;
    }

    public String getImieNazwisko() {
        return imieNazwisko;
    }
}

class Film {
    private static Map<String, List<Aktor>> filmy = new HashMap<>();

    public static void dodajAktorDoFilmu(String tytul, Aktor aktor) {
        filmy.computeIfAbsent(tytul, k -> new ArrayList<>()).add(aktor);
    }

    public static List<Aktor> pobierzAktorowZFilmu(String tytul) {
        return filmy.getOrDefault(tytul, Collections.emptyList());
    }
}