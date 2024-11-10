package Zdanie1102;

import java.util.Random;

class Owoc {
    private String nazwa;
    private double masa; // masa w gramach

    public Owoc(String nazwa) {
        this.nazwa = nazwa;
        this.masa = losujMase();
    }

    private double losujMase() {
        Random rand = new Random();
        return 100 + rand.nextInt(151); // losuje masę w przedziale 100-250g
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getMasa() {
        return masa;
    }

    public String toString() {
        return nazwa + " o masie " + masa + " g";
    }
}

class Jablko extends Owoc {
    public Jablko() {
        super("Jablko");
    }
}

class Pomarancza extends Owoc {
    public Pomarancza() {
        super("Pomarancza");
    }
}

class Gruszka extends Owoc {
    public Gruszka() {
        super("Gruszka");
    }
}

class Drzewo {
    private Random rand = new Random();

    public Owoc zerwijOwoc() {
        int los = rand.nextInt(3);
        switch (los) {
            case 0:
                return new Jablko();
            case 1:
                return new Pomarancza();
            case 2:
                return new Gruszka();
            default:
                return null; // to nie powinno się zdarzyć
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Drzewo drzewo = new Drzewo();
        Owoc[] kosz = new Owoc[100];
        double sumaMasy = 0;
        int licznik = 0;

        while (sumaMasy < 5000 && licznik < kosz.length) {
            Owoc zerwanyOwoc = drzewo.zerwijOwoc();
            kosz[licznik] = zerwanyOwoc;
            sumaMasy += zerwanyOwoc.getMasa();
            licznik++;
        }

        int liczbaJablek = 0;
        int liczbaPomaranczy = 0;
        int liczbaGruszek = 0;

        for (int i = 0; i < licznik; i++) {
            if (kosz[i] instanceof Jablko) liczbaJablek++;
            if (kosz[i] instanceof Pomarancza) liczbaPomaranczy++;
            if (kosz[i] instanceof Gruszka) liczbaGruszek++;
        }

        System.out.println("Zebrano łącznie " + licznik + " owoców o łącznej masie " + sumaMasy + " g.");
        System.out.println("Liczba jablek: " + liczbaJablek);
        System.out.println("Liczba pomaranczy: " + liczbaPomaranczy);
        System.out.println("Liczba gruszek: " + liczbaGruszek);
    }
}

