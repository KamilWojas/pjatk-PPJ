interface Pojazd {
    void uruchom();
}

class Samochod implements Pojazd {
    public void uruchom() {
        System.out.println("Samochód uruchomiony");
    }
}