//Użycie Optional<T> pozwala uniknąć null i ułatwia obsługę opcjonalnych wartości.

public class OpcjonalnyOptional {
    public String imie;
    public int wiek;
    public Optiona<String> numerTelefonu; //Opcjonalny nr telefonu

    //Konstruktor z bez nr telefonu
    public OpcjonalnyOptional(String imie, int wiek){
        this.imie = imie;
        this.wiek = wiek;
        this.numerTelefon = Optional.empty(); //brak nr
    }
    //Konstruktor z nr telefonu
    public OpcjonalnyOptional(String imie, int wiek, String numerTelefonu){
        this.imie = imie;
        this.wiek = wiek;
        this.numerTelefon = Optional.of(numerTelefonu);
    }

    public Optiona<String> getNumerTelefonu() {
        return numerTelefonu;
    }

    public void setNumerTelefonu(Optiona<String> numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }

    //Metoda sprawdzająca
    public void wyswietlInformacje(){
        System.out.println("Imie: " + imie + ", wiek " + wiek);
        System.out.println("Numer telefonu " + numerTelefonu.orElse("Brak"));
    }
}

//Metoda testowa
public class Main{
    public static void main(String[] args) {
        
    }
}