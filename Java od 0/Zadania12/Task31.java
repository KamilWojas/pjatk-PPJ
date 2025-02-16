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

// Klasa reprezentująca Film, implementująca asocjację kwalifikowaną
class Film {
    // Mapa: kluczem jest tytuł filmu, wartością - lista aktorów grających w tym filmie
    private static Map<String, List<Aktor>> filmy = new HashMap<>();

    // Dodanie aktora do filmu
    public static void dodajAktorDoFilmu(String tytul, Aktor aktor) {
        filmy.computeIfAbsent(tytul, k -> new ArrayList<>()).add(aktor);
    }