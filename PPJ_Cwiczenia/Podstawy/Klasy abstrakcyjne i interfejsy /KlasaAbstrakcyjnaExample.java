// Klasa abstrakcyjna
abstract class Zwierzę {
    String nazwa;

    public void ustawNazwę(String nazwa) {
        this.nazwa = nazwa;
    }
    // Metoda abstrakcyjna (bez implementacji)
    public abstract void wydajDzwiek();
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

/*
Wyjaśnienie:
Klasa abstrakcyjna Zwierzę:
Zawiera pole nazwaoraz dodatek ustawNazwęz implementacją.
Posiada funkcję abstrakcyjną wydajDzwiek, która nie ma implementacji – musi być nadpisana w klasach pochodnych.
Klasy Piesi Kot:
Dziedziczą po Zwierzęi wdrażają wydajDzwiek.
Program główny:
Obiekty Piesi Kotsą urządzeniami jako typ Zwierzę, ale są stosowane w metodach usuwania implementacji.

 */