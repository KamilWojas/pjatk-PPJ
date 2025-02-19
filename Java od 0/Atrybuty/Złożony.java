public class Złożony {
    private String ulica;
    private String miasto;
    private String kodPocztowy;

    public Złożony(String ulica, String miasto, String kodPocztowy){
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
        this.ulica = ulica;
    }

    //Gettery i Settery
    public String getMiasto(){
        return miasto;
    }
    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }
    public String getUlica() {
        return ulica;
    }
    public void setUlica(String ulica) {
        this.ulica = ulica;
    }
    public String getKodPocztowy() {
        return kodPocztowy;
    }
    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getPełenAdres(){
        return ulica + ", " + miasto + ", " + kodPocztowy + ", ";
    }
}