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