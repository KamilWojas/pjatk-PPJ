mport java.util.Random;

// Klasa bazowa Owoc
class Owoc {
    private String nazwa;
    private double masa;

    public Owoc(String nazwa, double masa) {
        this.nazwa = nazwa;
        this.masa = masa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getMasa() {
        return masa;
    }
}