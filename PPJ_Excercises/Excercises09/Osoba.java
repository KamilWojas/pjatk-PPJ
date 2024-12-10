// Klasa Osoba
public class Osoba {
    public String imie;
    public String nazwisko;
    public int rokUrodzenia;

    public static void main(String[] args) {
        // Tworzenie obiektu klasy Osoba
        Osoba osoba = new Osoba();

        // Przypisanie wartości do pól
        osoba.imie = "Jan";
        osoba.nazwisko = "Kowalski";
        osoba.rokUrodzenia = 1990;


        // Wyświetlenie wartości pól
        System.out.println("Imię: " + osoba.imie);
        System.out.println("Nazwisko: " + osoba.nazwisko);
        System.out.println("Rok urodzenia: " + osoba.rokUrodzenia);
    }
}

