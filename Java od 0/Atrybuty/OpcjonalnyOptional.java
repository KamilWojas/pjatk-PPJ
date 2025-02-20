//Użycie Optional<T> pozwala uniknąć null i ułatwia obsługę opcjonalnych wartości.

public class OpcjonalnyOptional {
    public String imie;
    public int wiek;
    public Optiona<String> numerTelefon; //Opcjonalny nr telefonu

    public OpcjonalnyOptional(String imie, int wiek){
        this.imie = imie;
        this.wiek = wiek;
        this.numerTelefon = Optional.empty(); //brak nr
    }
}