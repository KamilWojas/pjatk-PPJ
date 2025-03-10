class Silnik{
    private String typ;

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
    private Silnik silnik;

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

class Skuter extends Pojazd implements Elektryczny{
    public Skuter(String marka){
        super(marka);
    }

    @Override
    public void naladuj() {
        System.out.println(getMarka() + " ładowanie baterii ");
    }

    @Override
    public void wyswietlInformacje() {
        System.out.println("Elektryczny skuter marki " + getMarka());

    }
}

public class Main{
    public static void main(String[] args) {
        Samochod samochod = new Samochod("Toyota", "V8");
        Skuter skuter = new Skuter("Ducati");

        samochod.wyswietlInformacje();
        samochod.zatankuj();

        skuter.wyswietlInformacje();
        skuter.naladuj();
    }
}
