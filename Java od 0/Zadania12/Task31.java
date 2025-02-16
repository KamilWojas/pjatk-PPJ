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

public class Task31 {
    public static void main(String[] args) {
        Aktor aktor1 = new Aktor("Leonardo DiCaprio");
        Aktor aktor2 = new Aktor("Joseph Gordon-Levitt");

        Film.dodajAktorDoFilmu("Incepcja", aktor1);
        Film.dodajAktorDoFilmu("Incepcja", aktor2);
        Film.dodajAktorDoFilmu("Titanic", aktor1);

        System.out.println("Aktorzy w filmie 'Incepcja':");
        for (Aktor a : Film.pobierzAktorowZFilmu("Incepcja")) {
            System.out.println("- " + a.getImieNazwisko());
        }