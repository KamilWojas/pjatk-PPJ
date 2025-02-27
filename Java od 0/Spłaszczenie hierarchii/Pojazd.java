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

}