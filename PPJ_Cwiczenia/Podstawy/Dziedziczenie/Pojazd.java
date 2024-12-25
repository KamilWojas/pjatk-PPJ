// Klasa bazowa
class Pojazd {
    String marka;

    public void ustawMarke(String marka) {
        this.marka = marka;
    }

    public void wyswietlInformacje() {
        System.out.println("Marka pojazdu: " + marka);
    }
}
// Klasa pochodna
class Samochód extends Pojazd {
    String model;

    public void ustawModel(String model) {
        this.model = model;
    }
