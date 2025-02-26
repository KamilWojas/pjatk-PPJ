public class Overlapping {
    private String imie;

    public Overlapping(String imie){
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }
    public void wyswietlInformacje(){
        System.out.println("Pracownik " + imie);
    }
}

//interfejs programista
interface Programista{
    void piszKod();
}

interface Menadzer{
    void zarzadzajZespolem();
}

interface Tester{
    void testujAplikacje();
}

class PracownikIT extends Overlapping implements Programista,Menadzer, Tester{
    public PracownikIT(String imie){
        super(imie);
    }
    @Override
    public void piszKod() {
        System.out.println(getImie() + " Pisz kod");
    }

    @Override
    public void zarzadzajZespolem() {
        System.out.println(getImie() + " zarzadzaj zespołem");
    }

    @Override
    public void testujAplikacje() {
        System.out.println(getImie() + " testuje aplikacje");
    }
}

