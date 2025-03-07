import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

abstract class Pojazd3{
    private double cenaZaDzien;
    private int liczbaDni;

    // Lista przechowująca wszystkie rezerwacje (dla metody klasowej)
    private static List<Pojazd> rezerwacje = new ArrayList<>();

    public Pojazd(String marka, double cenaZaDzien, int liczbaDni) {
        this.marka = marka;
        this.cenaZaDzien = cenaZaDzien;
        this.liczbaDni = liczbaDni;
        rezerwacje.add(this);  // Automatycznie dodaje pojazd do listy rezerwacji
    }

    public double getKosztCalkowity{
        return cenaZaDzien = liczbaDni;
    } 

}