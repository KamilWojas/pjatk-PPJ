

// Klasa bazowa
class Zwierzę {
    String nazwa;

    public void ustawNazwę(String nazwa) {
        this.nazwa = nazwa;
    }

    public void wydajDzwiek() {
        System.out.println("Zwierzę wydaje dźwięk");
    }
}
// Klasa pochodna Pies
class Pies extends Zwierzę {
    @Override
    public void wydajDzwiek() {
        System.out.println("Hau!");
    }
}











// Program główny
public class ZwierzęExampleExtended {
    public static void main(String[] args) {
        // Tworzymy obiekt klasy Pies
        Pies pies = new Pies();
        pies.ustawNazwę("Burek");
        System.out.println("Pies o imieniu: " + pies.nazwa);
        pies.wydajDzwiek();
        // Tworzymy obiekt klasy Kot
        Kot kot = new Kot();
        kot.ustawNazwę("Mruczek");
        System.out.println("Kot o imieniu: " + kot.nazwa);
        kot.wydajDzwiek();
    }
}