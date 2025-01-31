interface PojazdInfo {
    void pokazInformacje();
}


interface Silnikowy {
    void uruchomSilnik();
}

class Pojazd implements PojazdInfo {
    private int maksymalnaPrędkość;

    public Pojazd(int maksymalnaPrędkość) {
        this.maksymalnaPrędkość = maksymalnaPrędkość;
    }

    public int getMaksymalnaPrędkość() {
        return maksymalnaPrędkość;
    }

    @Override
    public void pokazInformacje() {
        System.out.println("Pojazd: maksymalna prędkość = " + maksymalnaPrędkość + " km/h");
    }
}
class Samochód extends Pojazd implements Silnikowy {
    private int liczbaDrzwi;

    public Samochód(int maksymalnaPrędkość, int liczbaDrzwi) {
        super(maksymalnaPrędkość);
        this.liczbaDrzwi = liczbaDrzwi;
    }

    @Override
    public void pokazInformacje() {
        System.out.println("Samochód: maksymalna prędkość = " + getMaksymalnaPrędkość() + " km/h, liczba drzwi = " + liczbaDrzwi);
    }

    @Override
    public void uruchomSilnik() {
        System.out.println("Silnik samochodu uruchomiony! 🔥🚗");
    }
}

class Motocykl extends Pojazd implements Silnikowy {
    private String typKierownicy;

    public Motocykl(int maksymalnaPrędkość, String typKierownicy) {
        super(maksymalnaPrędkość);
        this.typKierownicy = typKierownicy;
    }

    @Override
    public void pokazInformacje() {
        System.out.println("Motocykl: maksymalna prędkość = " + getMaksymalnaPrędkość() + " km/h, typ kierownicy = " + typKierownicy);
    }

    @Override
    public void uruchomSilnik() {
        System.out.println("Silnik motocykla uruchomiony! 🏍️🔥");
    }
}

public class Task11 {
    public static void main(String[] args) {

        Samochód auto = new Samochód(220, 5);
        Motocykl motor = new Motocykl(180, "sportowa");

        auto.pokazInformacje();
        auto.uruchomSilnik();

    }




}