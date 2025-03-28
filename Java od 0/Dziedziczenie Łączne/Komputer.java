class Komputer{
    private String model;

    public Komputer(String model){
        this.model = model;
    }

    public void uruchom(){
        System.out.println("Komputer " + model + " Został uruchomiony ");
    }
}

interface Programista{
    void piszKod();
}

interface Menadzer{
    void zarzadzajZespolem();
}

interface Teste{
    void testujAplikacje();
}

class Pracownik implements Programista, Menadzer, Teste{
    private String imie;
    private Komputer komputer; //Kompozycja - każdy pracownik ma komputer
    private boolean jestProgramista;
    private boolean jestMenadzerem;
    private boolean jestTesterem;

    public Pracownik(String imie, String modelKomputera, boolean jestMenadzerem, boolean jestProgramista,
                     boolean jestTesterem){
        this.imie = imie;
        this.komputer = new Komputer(modelKomputera);
        this.jestMenadzerem = menadzer;
        this.jestProgramista = programista;
        this.jestTesterem = tester;
    }

    public void rozpocznijPrace(){
        System.out.println(imie + " rozpoczyna prace");
        komputer.uruchom();

        if (jestProgramista){
            piszKod();
        }
        if (jestMenadzerem){
            zarzadzajZespolem();
        }
        if (jestTesterem){
            testujAplikacje();
        }
    }

    @Override
    public void piszKod() {
        System.out.println(imie + " pisze kod jako programista");
    }

    @Override
    public void zarzadzajZespolem() {
        System.out.println(imie + " zarządza zespołem");
    }

    @Override
    public void testujAplikacje() {
        System.out.println(imie + " testuje apliakcje");
    }
}

public class Main{
    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik("Kamil Wojas", "Mac pro 16", true, false, false);
        Pracownik pracownik2 = new Pracownik("Jan Kowalski", "Dell xps", false, false, true);
        
        pracownik1.rozpocznijPrace();
        System.out.println();
        pracownik2.rozpocznijPrace();
    }
}