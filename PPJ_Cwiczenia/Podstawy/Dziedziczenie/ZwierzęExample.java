
// Klasa bazowa
class Zwierzę {
    String nazwa;

    public void ustawNazwę(String nazwa) {
        this.nazwa = nazwa;
    }







// Klasa pochodna
class Pies extends Zwierzę {
    @Override
    public void wydajDzwiek() {
        System.out.println("Hau!");
    }
}

// Program główny
public class ZwierzęExample {
    public static void main(String[] args) {
        Pies pies = new Pies();
        pies.ustawNazwę("Burek");
        pies.wydajDzwiek();
    }
}