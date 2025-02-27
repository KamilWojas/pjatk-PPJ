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