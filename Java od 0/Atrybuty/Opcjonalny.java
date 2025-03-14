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
        Opcjonalny osobaBezTelefonu = new Opcjonalny("Jan", 22);
        Opcjonalny osobaZTelefonem = new Opcjonalny('Kasia', 28, "321-123-456");

        osobaBezTelefonu.wyswietlInformacje();
        osobaZTelefonem.wyswietlInformacje();

        osobaBezTelefonu.setNumerTelefonu("123-123-123");
        osobaZTelefonem.wyswietlInformacje();
    }
}


//Imię: Jan, Wiek: 30
//        Numer telefonu: Brak
//        Imię: Anna, Wiek: 25
//        Numer telefonu: 123-456-789
//        Imię: Jan, Wiek: 30
//      Numer telefonu: 987-654-321