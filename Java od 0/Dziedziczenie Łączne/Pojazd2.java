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