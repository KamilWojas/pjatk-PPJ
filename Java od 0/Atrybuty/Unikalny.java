import java.util.HashSet;
import java.util.Set;

public class Unikalny {
    private String Set<String> istniejacePESELE = new HashSet<>();
    private String PESEL;
    private String imie;
    private String nazwisko;

    public Unikalny(String PESEL, String imie, String nazwisko){
        this.PESEL = PESEL;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public sealed Unikalny utworzOsobe(String PESEL, String imie, String nazwisko) throws Exception{
        
    }
}