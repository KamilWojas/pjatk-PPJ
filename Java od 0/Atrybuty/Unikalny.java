import java.util.HashSet;
import java.util.Set;

public class Unikalny {
    private String Set<String> istniejacePESELe = new HashSet<>();
    private String PESEL;
    private String imie;
    private String nazwisko;

    public Unikalny(String PESEL, String imie, String nazwisko){
        this.PESEL = PESEL;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public sealed Unikalny utworzOsobe(String PESEL, String imie, String nazwisko) throws Exception{
        if (istniejacePESELe.contains(PESEL)){
            throw new Exception("Osoba z takim PESEL-em już istnieje");
        }else {
            Unikalny nowaOsoba = new Unikalny(PESEL, imie, nazwisko);
            istniejacePESELe.add(PESEL);
            return nowaOsoba;
        }
    }

    public String getPESEL() {
        return PESEL;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko; 
    }
}