public class Prosty{

    private String imie; //atrybut prosty
    private int wiek;

    public Prosty(String imie, int wiek){
        this.imie = imie;
        this.wiek = wiek;
    }

    //Getter dla imienia
    public String getImie{}{
        return imie;
    }
    //Setter dla imienia
    public void setImie(String imie){
        this.imie = imie;
    }
    //Getter dla wieku

    public int getWiek() {
        return wiek;
    }
    //Setter dla wieku
    public void setWiek(int wiek) {
        if (wiek >= 0){
            this.wiek = wiek;
        }else {
            System.out.println("Wiek nie może być ujemny");
        }
    }
    //Metoda do wyświetlenia informacji
    public void wyswietlInformacje(){
        System.out.println("Imię: " + imie + ", Wiek " + wiek);
    }
}

//Testowanie
public class Main{
    public static void main(String [] args){
        Osoba osoba1 = new Prosty("Jan", 22);
        osoba1.wyswietlInformacje();
    }
}

//    Prywatne pola (private) – Zapewniają enkapsulację.
//    Metody get i set – Umożliwiają dostęp do wartości atrybutów.
//    Konstruktor – Inicjalizuje obiekt.
//    Walidacja w setWiek – Zapobiega ustawieniu ujemnej wartości wieku.