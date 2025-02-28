class Silnik{
    private String typ;

    public Silnik(String typ){
        this.typ = typ;
    }

    public void uruchom(){
        System.out.println("Silniik " + typ + " został uruchomiony ");
    }
}

class Samochod{
    private String marka;
    private Silnik silnik; //Kompozycja - samochód posiada silnik

    public Samochod(String marka, String typSilnika){
        this.marka = marka;
        this.silnik = new Silnik(typSilnika);
    }
    public void uruchomSamochod(){
        System.out.println("Samochós " + marka + " uruchamianie silnika");
        silnik.uruchom();
    }
}