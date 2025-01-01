// Klasa abstrakcyjna
abstract class Zwierzę {
    String nazwa;

    public void ustawNazwę(String nazwa) {
        this.nazwa = nazwa;
    }
    // Metoda abstrakcyjna (bez implementacji)
    public abstract void wydajDzwiek();
}













    // Program główny
public class KlasaAbstrakcyjnaExample {
    public static void main(String[] args) {
        Zwierzę pies = new Pies();
        pies.ustawNazwę("Burek");
        System.out.println("Pies o imieniu: " + pies.nazwa);
        pies.wydajDzwiek();

        Zwierzę kot = new Kot();
        kot.ustawNazwę("Mruczek");
        System.out.println("Kot o imieniu: " + kot.nazwa);
        kot.wydajDzwiek();
    }
}