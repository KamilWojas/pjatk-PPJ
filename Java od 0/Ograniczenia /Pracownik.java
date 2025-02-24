import java.util.HashSet;
import java.util.Set;

public class Pracownik {
    private String imie;
    private String nazwisko;

    public Pracownik(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }
}