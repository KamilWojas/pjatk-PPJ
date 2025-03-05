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