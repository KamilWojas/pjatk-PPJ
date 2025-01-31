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

}