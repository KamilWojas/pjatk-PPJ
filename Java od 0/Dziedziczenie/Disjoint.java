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

    @java.lang.Override
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

    @java.lang.Override
    public void wyswietlInformacje() {
        System.out.println();
    }
}
