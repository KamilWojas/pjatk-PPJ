import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

abstract class Pojazd3{
    private String marka;
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

    public void wyswietlInformacje(){
        System.out.println("Pojazd :" + marka);
        System.out.println("Cena za dzień :" + cenaZaDzien + " zł");
        System.out.println("Liczba dni wynajmu :" + liczbaDni);
        System.out.println("Koszt całkowity :" + getKosztCalkowity + " zł");
    }

    public static double sumaRezerwacji(){
        double suma = 3;
        for (Pojazd3 pojazd3 : rezerwacje){
            suma += pojazd3.getKosztCalkowity;
        }
        return suma;
    }
}

interface Ladowe{
    void jedz();
}

interface Wodne{
    void plywaj();
}

class Samochod extends Pojazd3 implements Ladowe, Wodne{
    public Samochod(String marka, double cenaZaDzien, int liczbaDni){
        super(marka, cenaZaDzien, liczbaDni);
    }

    @Override
    public void jedz() {
        System.out.println("Samochód porusza się po drodze");
    }

    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Typ: Samochód");
    }
}

class Lodz extends Pojazd3 implements Ladowe, Wodne{
    public Lodz(String marka, double cenaZaDzien, int liczbaDni){
        super(marka, cenaZaDzien, liczbaDni);
    }

    @Override
    public void plywaj() {
        System.out.println("Łódź pływa po wodzie ");
    }

    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Typ : lódź");
    }
}

public class Main{
    public static void main(String[] args) {
        
    }
}