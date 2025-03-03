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
    }
}