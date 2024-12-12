public class Walec {
    private double promien;
    private double wysokosc;

    // Konstruktor
    public Walec(double promien, double wysokosc) {
        this.promien = promien;
        this.wysokosc = wysokosc;
    }

    // Metoda show wyświetlająca pole powierzchni podstawy i objętość walca
    public void show() {
        double polePodstawy = Math.PI * promien * promien; // Pole podstawy walca
        double objetoscWalca = polePodstawy * wysokosc; // Objętość walca
        System.out.println("Pole powierzchni podstawy: " + polePodstawy);
        System.out.println("Objętość walca: " + objetoscWalca);
    }

    // Przykład użycia klasy
    public static void main(String[] args) {
        Walec walec = new Walec(3.0, 5.0); // Tworzymy walec o promieniu 3 i wysokości 5
        walec.show();
    }
}

/*
Pole powierzchni podstawy: 28.274333882308138
Objętość walca: 141.3716694115407
 */