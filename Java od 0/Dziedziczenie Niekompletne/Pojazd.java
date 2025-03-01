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