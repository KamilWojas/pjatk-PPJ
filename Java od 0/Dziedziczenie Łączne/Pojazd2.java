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

class Samochod extends Pojazd2{
    public Samochod(String numerID){
        super(numerID, "Benzynowy", true, false, false);
    }
}


class Samochod extends Pojazd2{
    public static void main(String[] args) {
        Pojazd2 samochod = new Samochod("A123");
        Pojazd2 lodz = new Lodz("B123");
        Pojazd2 samolot = new Samolot("F16");

        samochod.uruchomPojazd();
        System.out.println();
        lodz.uruchomPojazd();
        System.out.println();
        samolot.uruchomPojazd();
        System.out.println();

    }
}