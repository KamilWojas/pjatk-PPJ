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