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
// Klasa Drzewo
class Drzewo {
    public Owoc zerwijOwoc() {
        Random random = new Random();
        int wybor = random.nextInt(3);
        if (wybor == 0) return new Jablko();
        if (wybor == 1) return new Pomarancza();
        return new Gruszka();
    }
}