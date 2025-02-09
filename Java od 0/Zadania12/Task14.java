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