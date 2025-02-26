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
}
