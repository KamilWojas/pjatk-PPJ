/*
Napisz program sprawdzający,

 */

// Klasa bazowa
class Zwierzę {
    String nazwa; // Pole przechowujące nazwę zwierzęcia

    // Metoda ustawiająca nazwę zwierzęcia
    public void ustawNazwę(String nazwa) {
        this.nazwa = nazwa;
    }









    // Program główny
public class ZwierzęExample {
    public static void main(String[] args) {
        // Tworzymy obiekt klasy Pies
        Pies pies = new Pies();
        pies.ustawNazwę("Burek"); // Ustawiamy nazwę psa
        System.out.println("Pies o imieniu: " + pies.nazwa);
        pies.wydajDzwiek(); // Wywołujemy metodę, aby pies zaszczekał
    }
}