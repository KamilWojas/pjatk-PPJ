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

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}