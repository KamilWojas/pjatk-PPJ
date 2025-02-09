abstract class Platnosc {
    abstract void wykonajPlatnosc(double kwota);
}

class PlatnoscKarta extends Platnosc {
    @Override
    void wykonajPlatnosc(double kwota) {
        System.out.println("Płatność kartą na kwotę: " + kwota + " zł.");
    }
}

class PlatnoscBlik extends Platnosc {
    @Override
    void wykonajPlatnosc(double kwota) {
        System.out.println("Płatność BLIK na kwotę: " + kwota + " zł.");
    }
}

public class Task14 {
    public static void main(String[] args) {
        Platnosc p1 = new PlatnoscKarta();
        Platnosc p2 = new PlatnoscBlik();

        p1.wykonajPlatnosc(100);
        p2.wykonajPlatnosc(50);
    }
}