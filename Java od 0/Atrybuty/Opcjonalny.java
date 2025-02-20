public class Opcjonalny {
    public String imie;
    public int wiek;
    public String numerTelefonu; //może być null

    public Opcjonalny(String imie, int wiek, String numerTelefonu){
        this.imie = imie;
        this.wiek = wiek;
        this.numerTelefonu = null;
    }

    public Opcjonalny(String imie, int wiek, String numerTelefonu){
        this.imie = imie;
        this.wiek = wiek;
        this.numerTelefonu = numerTelefonu;
    }
}