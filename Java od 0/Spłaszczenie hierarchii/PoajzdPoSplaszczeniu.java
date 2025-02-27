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

    public void ustawKask(boolean maKask) {
        if (typ == TypPojazdu.MOTOCYKL) {
            this.maKask = maKask;
        } else {
            throw new IllegalArgumentException("Kask dotyczy tylko motocykla.");
        }
    }

    public void ustawElektryczny(boolean elektryczny) {
        if (typ == TypPojazdu.ROWER) {
            this.elektryczny = elektryczny;
        } else {
            throw new IllegalArgumentException("Elektryczność dotyczy tylko roweru.");
        }
    }

    public void wyswietlInformacje() {
        System.out.println("Pojazd: " + marka + ", prędkość maksymalna: " + predkoscMaksymalna + " km/h, typ: " + typ);
        if (typ == TypPojazdu.SAMOCHOD) {
            System.out.println("Liczba drzwi: " + liczbaDrzwi);
        } else if (typ == TypPojazdu.MOTOCYKL) {
            System.out.println("Motocykl " + (maKask ? "z kaskiem" : "bez kasku"));
        } else if (typ == TypPojazdu.ROWER) {
            System.out.println("Rower " + (elektryczny ? "elektryczny" : "tradycyjny"));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Pojazd samochod = new Pojazd("Toyota", 180, Pojazd.TypPojazdu.SAMOCHOD);
        samochod.ustawLiczbeDrzwi(4);

        Pojazd motocykl = new Pojazd("Yamaha", 220, Pojazd.TypPojazdu.MOTOCYKL);
        motocykl.ustawKask(true);