class Silnik{
    private Silnik typ;

    public Silnik(Silnik typ){
        this.typ = typ;
    }

    public void uruchom(){
        System.out.println("Silnik " + typ + " został uruchomiony");
    }
}

//overlapping
interface Ladowe{
    void jedz();
}

interface Wodne{
    void plyn();
}

interface Latajace{
    void lec();
}

abstract class Pojazd2 implements Ladowe, Wodne, Latajace{
    private String  numerID;
    private Silnik silnik;
    private boolean jestLadowwy;
    private boolean jestWodny;
    private boolean jestLatajacy;

}