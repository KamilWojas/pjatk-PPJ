class Komputer{
    private String model;

    public Komputer(String model){
        this.model = model;
    }

    public void uruchom(){
        System.out.println("Komputer " + model + " Został uruchomiony ");
    }
}

interface Programista{
    void piszKod();
}

interface Menadzer{
    void zarzadzajZespolem();
}

interface Teste{
    void testujAplikacje();
}

class Pracownik implements Programista, Menadzer, Teste{
    
}