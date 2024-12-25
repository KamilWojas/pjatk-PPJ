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