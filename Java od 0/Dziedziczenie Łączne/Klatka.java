class Klatka{
    private int numer;

    public Klatka(int numer){
        this.numer = numer;
    }
    public void otworz(){
        System.out.println("Klatka nr " + numer + " została otwarta");
    }
}

interface Ladowe{
    void biegaj();
}

interface Wodne{
    void plywaj();
}

interface Latajace{
    void lataj();
}

class Zwierze implements Ladowe, Wodne, Latajace{
    private String gatunek;
    private Klatka klatka;
    private boolean jestLadowe;
    private boolean jestWodne;
    private boolean jestLatajace;

    public Zwierze(String gatunek, int numerKlatki, boolean jestLadowe, boolean jestWodne,
                   boolean jestLatajace){
        this.gatunek = gatunek;
        this.klatka = new Klatka(numerKlatki);
        this.jestLadowe = ladowe;
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

    @Override
    public void biegaj() {
        System.out.println(gatunek + " biega po lesie");
    }

    @Override
    public void plywaj() {
        System.out.println(gatunek + " pływa w oceaniue");
    }

    @Override
    public void lataj() {
        System.out.println(gatunek + " lata");
    }
}