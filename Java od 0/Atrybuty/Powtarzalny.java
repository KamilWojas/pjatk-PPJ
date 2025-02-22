import java.util.ArrayList;
import java.util.List;

public class Powtarzalny {
    private String imie;
    private List<String> numerTelefonu; //Atrynut powtarzalny

    public Powtarzalny(String imie){
        this.imie = imie;
        this.numerTelefonu = new ArrayList<>();
    }

    //Metoda dodająca nr telefonu
    public void dodajNumerTelefonu(String numer){
        if (numer != null && !numer.isEmpty()){
            numerTelefonu.add(numer);
        }else {
            throw new IllegalArgumentException("Numer telefonu nie może być pusty");
        }
    }

    //Metoda usuwająca numer telefonu
    public void usunNumerTelefonu(String numer){
        numerTelefonu.remove(numer);
    }

    //Zwracamy listę nr telefonów

    public List<String> getNumerTelefonu() {
        return new ArrayList<>(numerTelefonu);
    }
}