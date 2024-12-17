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
// Klasa główna
public class Main {
    public static void main(String[] args) {
        Drzewo drzewo = new Drzewo();
        Owoc[] kosz = new Owoc[100]; // Tablica na zerwane owoce
        double sumaMasy = 0;
        int liczbaJablek = 0, liczbaPomaranczy = 0, liczbaGruszek = 0;

        int index = 0;
        while (sumaMasy < 5000 && index < 100) { // 5000 gram = 5 kg
            Owoc owoc = drzewo.zerwijOwoc();
            sumaMasy += owoc.getMasa();
            kosz[index++] = owoc;

            // Zliczanie owoców
            if (owoc.getNazwa().equals("Jablko")) liczbaJablek++;
            else if (owoc.getNazwa().equals("Pomarańcza")) liczbaPomaranczy++;
            else if (owoc.getNazwa().equals("Gruszka")) liczbaGruszek++;
        }

        // Wyświetlenie wyników
        System.out.println("Suma masy owoców: " + sumaMasy / 1000 + " kg");
        System.out.println("Liczba zerwanych jabłek: " + liczbaJablek);
        System.out.println("Liczba zerwanych pomarańczy: " + liczbaPomaranczy);
        System.out.println("Liczba zerwanych gruszek: " + liczbaGruszek);
    }
}