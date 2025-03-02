class Silnik{
    private String typ'

        public Silnik(String typ){
        this.typ = typ;
        }

        public void uruchom(){
            System.out.println("Silnik " + typ + " został uruchomiony");
        }
}

interface Spalinowy{
    void zatankuj();
}

interface Elektryczny{
    void naladuj();
}