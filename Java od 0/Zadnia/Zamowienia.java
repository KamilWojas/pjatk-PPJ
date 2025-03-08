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

        while (true){
            System.out.println("Podaj nazwę produktu");
            String nazwaProduktu = scanner.nextLine();

            System.out.print("Podaj ilość: ");
            int ilosc = scanner.nextInt();

            System.out.print("Podaj cenę jednostkową: ");
            double cenaJednostkowa = scanner.nextDouble();
            scanner.nextLine();

            Zamowienie zamowienie = new Zamowienie(nazwaProduktu, ilosc, cenaJednostkowa);
            zamowienia.add(zamowienie);

            System.out.print("Czy chcesz dodać kolejne zamówienie? (tak/nie): ");
            String odpowiedz = scanner.nextLine().trim().toLowerCase();
            if (odpowiedz.equals("nie")) {
                break;

        }
    }
        System.out.println("\nLista zamówień:");
        double suma = 0;
        for (int i = 0; i < zamowienia.size(); i++) {
}