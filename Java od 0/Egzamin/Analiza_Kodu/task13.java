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