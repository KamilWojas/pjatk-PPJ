import java.util.ArrayList;
import java.util.Scanner;

class Zamowienia{
    private String nazwaProduktu;
    private int ilosc;
    private double cena;

    public Zamowienia(String nazwaProduktu, int ilosc, double cena){
        this.nazwaProduktu = nazwaProduktu;
        this.ilosc = ilosc;
        this.cena = cena;
    }
    
    public double obliczanieWartosci(){
        return ilosc * cena;
    }
    
    public String toString(){
        return nazwaProduktu + " - ilość: " + ilosc + ", cena jednostkowa " + cena + ", Wartość: " + obliczanieWartosci();
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Zamowienia> zamowienia = new ArrayList<>();
    }
}