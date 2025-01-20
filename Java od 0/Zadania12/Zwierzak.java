public class Zwierzak {

    private String name;
    private int wiek;
    private int waga;

    public Zwierzak(String imie, int wiek) {
        this.name = imie;
        this.wiek = wiek;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }
    public void setWaga(int waga, String dataBadania){
        this.waga = waga;
        System.out.println("Pomiar wagi u zwierzaka " +
                this.name + " w dniu " + dataBadania + " waga wynosiła " + waga);
    }

    public void incWiek(){
        this.wiek++;
    }
