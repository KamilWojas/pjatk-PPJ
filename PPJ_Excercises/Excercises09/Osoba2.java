// Klasa Osoba2
public class Osoba2 {
    // Pola klasy
    public String imie;
    public String nazwisko;
    public int rokUrodzenia;

    // Konstruktor inicjalizujący wszystkie pola
    public Osoba2(String imie, String nazwisko, int rokUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    // Metoda show wyświetlająca stan wszystkich pól
    public void show() {
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Rok urodzenia: " + rokUrodzenia);
    }

    public static void main(String[] args) {
        // Tworzenie obiektu klasy Osoba2
        Osoba2 osoba2 = new Osoba2("Jan", "Kowalski", 1990);

        // Wywołanie metody show
        osoba2.show();
    }
}
