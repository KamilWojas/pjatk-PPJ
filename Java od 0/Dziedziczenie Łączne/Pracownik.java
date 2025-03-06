import java.util.UUID;

abstract class Pracownik{
    private final String id;
    private String imie;
    private int wiek;
    private double pensja;

    public Pracownik(String imie, int wiek, double pensja){
        this.id = UUID.randomUUID().toString(); //generowanie ID
        this.imie = imie;
        this.wiek = wiek;
        this.pensja = pensja;
    }

    public double getPensjaRoczna() {
        return pensja;
    }
    public void wyswietlInformacje(){
        System.out.println("ID " + id);
        System.out.println("Imie " + imie);
        System.out.println("Wiek " + wiek);
        System.out.println("Pensja " + pensja + " zł ");
        System.out.println("Pensja roczna " + getPensjaRoczna() + " zł ");
    }
}

interface Programista{
    void piszKod();
}

interface Menadzer{
    void zarzadzajZespolem();
}

interface Tester{
    void testujOprogramowanie();
}

class ProgramistaImpl extends Pracownik implements Programista{
    public ProgramistaImpl(String imie, int wiek, double pensja){
        super(imie, wiek, pensja);
    }

    @Override
    public void piszKod() {
        System.out.println("Programista pisze kod");
    }

    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Rola: progamista");
    }
}

class MenadzerImpl extends Pracownik implements Menadzer{
    public MenadzerImpl(String imie, int wiek, double pensja){
        super(imie, wiek, pensja);
    }

    @verride
    public void zarzadzajZespolem() {
        System.out.println("Menadżer zarządza zespołem");
    }

    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Rola: Menadżer zespołu");
    }
}

class TesterImpl extends Pracownik implements Tester{
    public TesterImpl(String imie, int wiek, double pensja){
        super(imie, wiek, pensja);
    }

    @Override
    public void testojOprogramowanie() {
        System.out.println("Tester testuje oprogramowanie ");
    }
}