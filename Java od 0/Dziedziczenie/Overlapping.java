public class Overlapping {
    private String imie;

    public Overlapping(String imie){
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }
    public void wyswietlInformacje(){
        System.out.println("Pracownik " + imie);
    }
}

//interfejs programista
interface Programista{
    void piszKod();
}

interface Menadzer{
    void zarzadzajZespolem();
}