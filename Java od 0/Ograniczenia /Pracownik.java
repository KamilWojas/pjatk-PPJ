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
class Brygada{
    private String nazwa;
    private Set<Pracownik> pracpwnicy = new HashSet<>();

    public Brygada(String nazwa){
        this.nazwa = nazwa;
    }
    public void dodajPracownika(Pracownik pracownik){
        pracpwnicy.add(pracownik);
    }
    public boolean czyNalezy(Pracownik pracownik){
        return pracpwnicy.contains(pracownik);
    }

    public String getNazwa() {
        return nazwa;
    }
}