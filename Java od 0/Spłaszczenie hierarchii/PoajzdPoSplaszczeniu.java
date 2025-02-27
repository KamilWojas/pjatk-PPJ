class PojazdPoSplaszczeniu {
    public enum TypPojazdu { SAMOCHOD, MOTOCYKL, ROWER }

    private String marka;
    private int predkoscMaksymalna;
    private TypPojazdu typ;
    private int liczbaDrzwi;  
    private boolean maKask;   
    private boolean elektryczny;

    public Pojazd(String marka, int predkoscMaksymalna, TypPojazdu typ) {
        this.marka = marka;
        this.predkoscMaksymalna = predkoscMaksymalna;
        this.typ = typ;
    }

    public void ustawLiczbeDrzwi(int liczbaDrzwi) {
        if (typ == TypPojazdu.SAMOCHOD) {
            this.liczbaDrzwi = liczbaDrzwi;
        } else {
            throw new IllegalArgumentException("Liczba drzwi dotyczy tylko samochodu.");
        }
    }