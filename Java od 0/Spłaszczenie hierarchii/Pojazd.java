abstract class Pojazd{
    private String marka;
    private int predkoscMaksymalna;

    public Pojazd(String marka, int predkoscMaksymalna) {
        this.marka = marka;
        this.predkoscMaksymalna = predkoscMaksymalna;
    }

    public String getMarka() {
        return marka;
    }

    public int getPredkoscMaksymalna() {
        return predkoscMaksymalna;
    }

    public abstract void wyswietlInformacje();
}

class Samochod extends Pojazd {
    private int liczbaDrzwi;

    public Samochod(String marka, int predkoscMaksymalna, int liczbaDrzwi) {
        super(marka, predkoscMaksymalna);
        this.liczbaDrzwi = liczbaDrzwi;
    }

    @Override
    public void wyswietlInformacje() {
        System.out.println("Samochód marki " + getMarka() + " z " + liczbaDrzwi + " drzwiami, prędkość maksymalna: " + getPredkoscMaksymalna() + " km/h.");
    }
}

class Motocykl extends Pojazd {
    private boolean maKask;

    public Motocykl(String marka, int predkoscMaksymalna, boolean maKask) {
        super(marka, predkoscMaksymalna);
        this.maKask = maKask;
    }

    @Override
    public void wyswietlInformacje() {
        System.out.println("Motocykl marki " + getMarka() + (maKask ? " z kaskiem" : " bez kasku") + ", prędkość maksymalna: " + getPredkoscMaksymalna() + " km/h.");
    }
}
