class Silnik{
    private String typ;

    public Silnik(String typ){
        this.typ = typ;
    }

    public void uruchom(){
        System.out.println("Silniik " + typ + " został uruchomiony ");
    }
}