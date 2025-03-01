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
