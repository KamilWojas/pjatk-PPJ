/*
Ćwiczenie: Klasy ZwierzęiPies
Utwórz klasę Zwierzę, która ma pole nazwai tworzy wydajDzwiek.
Utwórz klasę Pies, która dziedziczy po Zwierzęi nadpisuje wydajDzwiek, aby wypisać "Hau!".
 */

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