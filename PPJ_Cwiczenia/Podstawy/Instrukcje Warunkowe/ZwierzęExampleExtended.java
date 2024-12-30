

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
// Klasa pochodna Kot
class Kot extends Zwierzę {
    @Override
    public void wydajDzwiek() {
        System.out.println("Miau!");
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

/*
Wyjaśnienie:
Klasa Kot:
Dziedziczy wszystkie pola i metody klasy Zwierzę.
Nadpisuje wydajDzwiek, aby wypisać "Miau!".
Program główny:
Tworzymy obiekt Kot, ustawiamy jego obecność i obecność wydajDzwiek.

Wynik programu:

Pies o imieniu: Burek
Hau!
Kot o imieniu: Mruczek
Miau!
 */