abstract class Platnosc {
    abstract void wykonajPlatnosc(double kwota);
}

class PlatnoscKarta extends Platnosc {
    @Override
    void wykonajPlatnosc(double kwota) {
        System.out.println("Płatność kartą na kwotę: " + kwota + " zł.");
    }
}