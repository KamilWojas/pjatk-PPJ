// Klasa bazowa – abstrakcyjna (bo dziedziczenie jest niekompletne)
abstract class Pojazd {
    private String marka;

    public Pojazd(String marka) {
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }

    public abstract void wyswietlInformacje();
}
class Samochod extends Pojazd {
    private int liczbaDrzwi;

    public Samochod(String marka, int liczbaDrzwi) {
        super(marka);
        this.liczbaDrzwi = liczbaDrzwi;
    }

    @Override
    public void wyswietlInformacje() {
        System.out.println("Samochód marki " + getMarka() + " z " + liczbaDrzwi + " drzwiami.");
    }
}

class Motocykl extends Pojazd {
    private boolean maKask;

    public Motocykl(String marka, boolean maKask) {
        super(marka);
        this.maKask = maKask;
    }

    @Override
    public void wyswietlInformacje() {
        System.out.println("Motocykl marki " + getMarka() + (maKask ? " z kaskiem." : " bez kasku."));
    }
}

public class Main {
    public static void main(String[] args) {
        Pojazd samochod = new Samochod("Toyota", 5);
        Pojazd motocykl = new Motocykl("Yamaha", true);

        samochod.wyswietlInformacje();
        motocykl.wyswietlInformacje();

    }
}