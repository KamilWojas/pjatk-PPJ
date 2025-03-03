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