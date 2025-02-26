public class Disjoint {
    private String marka;

    public Disjoint(String marka){
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }
    public abstract void wyswietlInformacje(){
    }

class Samochod extends Disjoint{
    private int liczbaDrzwi;

    public Samochod(String marka,int liczbaDrzwi){
        super(marka);
        this.liczbaDrzwi = liczbaDrzwi;
    }

    @Override
    public void wyswietlInformacje() {
        System.out.println("Samochód marki " + getMarka() + " z " + liczbaDrzwi + " drzwiami");
    }
}

class Motocykl extends Disjoint{
    private boolean maKask;

    public Motocykl(String marka, boolean maKask){
        super(marka);
        this.maKask = maKask;
    }

    @Override
    public void wyswietlInformacje() {
        System.out.println("Motocykl marki " + getMarka() + (maKask ? " z kaskiem. " : " bez kasku."));
    }
}

class Rower extends Disjoint{
    private boolean elektryczny;

    public Rower(String marka, boolean elektryczny){
        super(marka);
        this.elektryczny = elektryczny;
    }

    @Override
    public void wyswietlInformacje() {
        System.out.println("Rower marki " + getMarka() + (elektryczny ? " elektryczny " : "Tradycyjny"));
    }
}

public class Main{
    public static void main(String[] args) {
        Disjoint pojazd1 = new Samochod("Toyata", 5);
        Disjoint pojazd2 = new Motocykl("Yamaha", true);
        Disjoint pojazd3 = new Rower("Romet", false);

        pojazd1.wyswietlInformacje();
        pojazd2.wyswietlInformacje();
        pojazd3.wyswietlInformacje();
    }
}