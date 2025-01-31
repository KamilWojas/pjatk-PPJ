interface PojazdInfo {
    void pokazInformacje();
}


interface Silnikowy {
    void uruchomSilnik();
}

class Pojazd implements PojazdInfo {
    private int maksymalnaPrędkość;

    public Pojazd(int maksymalnaPrędkość) {
        this.maksymalnaPrędkość = maksymalnaPrędkość;
    }

    public int getMaksymalnaPrędkość() {
        return maksymalnaPrędkość;
    }

    @Override
    public void pokazInformacje() {
        System.out.println("Pojazd: maksymalna prędkość = " + maksymalnaPrędkość + " km/h");
    }
}
class Samochód extends Pojazd implements Silnikowy {
    private int liczbaDrzwi;

    public Samochód(int maksymalnaPrędkość, int liczbaDrzwi) {
        super(maksymalnaPrędkość);
        this.liczbaDrzwi = liczbaDrzwi;
    }

    @Override
    public void pokazInformacje() {
        System.out.println("Samochód: maksymalna prędkość = " + getMaksymalnaPrędkość() + " km/h, liczba drzwi = " + liczbaDrzwi);
    }


}