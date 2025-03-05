class Ekwipunek{
    private String nazwa;

    public Ekwipunek(String nazwa){
        this.nazwa = nazwa;
    }

    public void uzyj(){
        System.out.println("Używasz :" + nazwa);
    }
}

interface Walczy{
    void atakWrecz();
}

interface Strzela{
    void strzela();
}

interface RzucaZaklecia{
    void rzycaZaklecia();
}

abstract class Postac implements Walczy, Strzela, RzucaZaklecia{
    private String imie;
    private Ekwipunek ekwipunek;
    private boolean jestWojownikiem;
    private boolean jestLucznikiem;
    private boolean jastMagiem;

    private Postac(String imie, String ekwipunek, boolean wojownik, boolean lucznik, boolean mag){
        this.imie = imie;
        this.ekwipunek = new Ekwipunek(ekwipunek);

    }
}