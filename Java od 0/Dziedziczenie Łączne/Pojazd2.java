class Silnik{
    private Silnik typ;

    public Silnik(Silnik typ){
        this.typ = typ;
    }

    public void uruchom(){
        System.out.println("Silnik " + typ + " został uruchomiony");
    }
}