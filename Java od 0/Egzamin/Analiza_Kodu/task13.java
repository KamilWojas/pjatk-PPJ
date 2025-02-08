interface Pojazd {
    void uruchom();
}

class Samochod implements Pojazd {
    public void uruchom() {
        System.out.println("Samochód uruchomiony");
    }
}

class Rower implements Pojazd {
    public void uruchom() {
        System.out.println("Rower gotowy do jazdy");
    }
}

public class Task13 {
    public static void main(String[] args) {
        Pojazd p1 = new Samochod();
        Pojazd p2 = new Rower();
    }