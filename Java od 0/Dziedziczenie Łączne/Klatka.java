class Klatka{
    private int numer;

    public Klatka(int numer){
        this.numer = numer;
    }
    public void otworz(){
        System.out.println("Klatka nr " + numer + " została otwarta");
    }
}

interface Lodowe{
    void biegaj();
}

interface Wodne{
    void plywaj();
}

interface Latajace{
    void lataj();
}

class Zwierze implements Latajace, Wodne, Latajace{
    private String gatunek;
    private Klatka klatka;
    private boolean jestLodowe;
    private boolean jestWodne;
    private boolean jestLatajace;

    public Zwierze(String gatunek, int numerKlatki, boolean jestLodowe, boolean jestWodne,
                   boolean jestLatajace){
        this.gatunek = gatunek;
        this.klatka = new Klatka(numerKlatki);
        this.jestLodowe = lodowe;
        this.jestWodne = wodne;
        this.jestLatajace = latajace;
    }

    public void aktywnosc(){
        System.out.println(gatunek + " wykonuje swoją aktywność");

        if (jestLodowe){
            biegaj();
        }
        if (jestWodne){
            plywaj();
        }
        if (jestLatajace){
            lataj();
        }
    }
}