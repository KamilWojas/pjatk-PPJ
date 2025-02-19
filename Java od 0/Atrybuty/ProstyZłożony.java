public class ProstyZłożony {
    private String imie; //atrybut prosty
    private int wiek;
    private Adres adres; //atrybut złożony

    public ProstyZłożony(String imie, int wiek, Adres adres){
        this.imie = imie;
        this.wiek = wiek;
        this.adres = adres;
    }

    //Gettery i settery
    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;

    }
    public int getWiek() {
        return wiek;

    }
    public void setWiek(int wiek) {
        if (wiek >= 0){
            this.wiek = wiek;
        }else {
            System.out.println("Wiek nie może być ujemny");
        }
    }
    public Adres getAdres() {
        return adres;

    }
    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    //Metoda wyświetlająca informację
    public void wyswietlInformacje(){
        System.out.println("Imię: " + imie + ", wiek " + wiek);
        System.out.println("Adres: " + adres.getPełenAdres);
    }
}