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

    public Pojazd2(String numerID, String typSilnika, boolean jestLadowwy, boolean jestWodny,
                   boolean jestLatajacy){

    }

    public void uruchomPojazd(){
        System.out.println("Pojazd nr " + numerID + " rozpoczuna prace");
        silnik.uruchom();

        if (jestLatajacy){
            lec();
        }
        if (jestLadowwy){
            jedz();
        }
        if (jestWodny){
            plyn();
        }
    }

    @Override
    public void jedz() {
        System.out.println("Pojazd " + numerID + " jedz po drodze");

    }

    @Override
    public void lec() {
        System.out.println("Pojazd " + numerID + " leci w powietrzu");
    }

    @Override
    public void plyn() {
        System.out.println("Pojazd " + numerID + " płynie po wodzie");

    }
}