import java.util.UUID;

abstract class Pracownik{
    private final String id;
    private String imie;
    private int wiek;
    private double pensja;

    public Pracownik(String imie, int wiek, double pensja){
        this.id = UUID.randomUUID().toString(); //generowanie ID
        this.imie = imie;
        this.wiek = wiek;
        this.pensja = pensja;
    }

    public double getPensjaRoczna() {
        return pensja;
    }
}
