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

    public String getNumerTelefonu() {
        return numerTelefonu;
    }

    public void setNumerTelefonu(String numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }

    //Metoda sprawdzająca
    public void wyswietlInformacje(){
        System.out.println("Imie: " + imie + ", wiek" + wiek);
        System.out.println("Nr telefonu: " + (numerTelefonu !=null ? numerTelefonu : "Brak"));
    }
}

//Metoda testowa
public class Main{
    public static void main(String[] args){

    }
}