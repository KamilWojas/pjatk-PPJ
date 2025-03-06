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
    public void testujOprogramowanie() {
        System.out.println("Tester testuje oprogramowanie ");
    }

    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Rola: Tester oprogramowania ");
    }
}

class FullStackPracownik extends Pracownik implements Programista, Tester{
    public FullStackPracownik(String imie, int wiek, double pensja){
        super(imie, wiek, pensja);
    }

    @Override
    public void piszKod() {
        System.out.println("Fullstack developer pisze kod");

    }

    @Override
    public void testujOprogramowanie() {
        System.out.println("Fullstac tester testuje oprogramownie");

    }

    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Rola : fullstac Developer");
    }
}

public class Main{
    public static void main(String[] args) {
        Pracownik programista = new ProgramistaImpl("Kamil Wojas", 28, 15000);
        Pracownik menadzer = new MenadzerImpl("Jan Matejko", 33, 22000);
        Pracownik tester = new TesterImpl("Krzystof Krawczyk", 45, 9500);
        Pracownik fullstack = new FullStackPracownik("Leo Messi", 37, 123456);
        
        programista.wyswietlInformacje();
        ((Programista)programista).piszKod();
        System.out.println();
        
        menadzer.wyswietlInformacje();
        ((Menadzer)menadzer).zarzadzajZespolem();
        System.out.println();
        
        tester.wyswietlInformacje();
        ((Tester)tester).testujOprogramowanie();
        System.out.println();
        
        fullstack.wyswietlInformacje();
        ((FullStackPracownik)fullstack).piszKod();
        ((FullStackPracownik)fullstack).testujOprogramowanie();
    }
}