class Silnik{
    private String typ'

        public Silnik(String typ){
        this.typ = typ;
        }

        public void uruchom(){
            System.out.println("Silnik " + typ + " został uruchomiony");
        }
}

interface Spalinowy{
    void zatankuj();
}

interface Elektryczny{
    void naladuj();
}

abstract class Pojazd{
    private String marka;

    public Pojazd(String marka){
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }

    public abstract void wyswietlInformacje();
}

class Samochod extends Pojazd implements Spalinowy{
    public Silnik silnik;

    public Samochod(String marka, String typSilnika){
        super(marka);
        this.silnik = new Silnik(typSilnika); //Kompozycja – Silnik istnieje tylko z Samochodem
    }

    @Override
    public void zatankuj() {
        System.out.println(getMarka() + " zatankowano paliwo. ");

    }

    @Override
    public void wyswietlInformacje() {
        System.out.println("Samochód spalinowy marki " + getMarka());
        silnik.uruchom();

    }
}
