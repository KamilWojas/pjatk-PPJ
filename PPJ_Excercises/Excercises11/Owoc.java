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
// Klasy dziedziczące: Jablko, Pomarancza, Gruszka
class Jablko extends Owoc {
    public Jablko() {
        super("Jablko", losujMase());
    }

    private static double losujMase() {
        return 100 + new Random().nextInt(151); // Masa od 100 do 250 g
    }
}

class Pomarancza extends Owoc {
    public Pomarancza() {
        super("Pomarańcza", losujMase());
    }

    private static double losujMase() {
        return 100 + new Random().nextInt(151); // Masa od 100 do 250 g
    }
}

class Gruszka extends Owoc {
    public Gruszka() {
        super("Gruszka", losujMase());
    }

    private static double losujMase() {
        return 100 + new Random().nextInt(151); // Masa od 100 do 250 g
    }
}