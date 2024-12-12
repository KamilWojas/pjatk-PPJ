// Klasa Prostokat
class Prostokat {
    private double dlugosc;
    private double szerokosc;

    // Konstruktor
    public Prostokat(double dlugosc, double szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    // Metoda obliczająca pole powierzchni prostokąta
    public double obliczPole() {
        return dlugosc * szerokosc;
    }
}

// Klasa Prostopadloscian dziedzicząca po Prostokat
class Prostopadloscian extends Prostokat {
    private double wysokosc;

    // Konstruktor
    public Prostopadloscian(double dlugosc, double szerokosc, double wysokosc) {
        super(dlugosc, szerokosc);
        this.wysokosc = wysokosc;
    }

    // Metoda obliczająca objętość prostopadłościanu
    public double obliczObjetosc() {
        return obliczPole() * wysokosc;
    }

    // Metoda wyświetlająca pole powierzchni i objętość
    public void show() {
        System.out.println("Pole powierzchni prostopadłościanu: " + obliczPole());
        System.out.println("Objętość prostopadłościanu: " + obliczObjetosc());
    }
}

// Klasa Trojkat
class Trojkat {
    private double bok;

    // Konstruktor
    public Trojkat(double bok) {
        this.bok = bok;
    }

    // Metoda obliczająca pole powierzchni trójkąta równobocznego
    public double obliczPole() {
        return (Math.sqrt(3) / 4) * bok * bok;
    }
}

// Klasa Ostroslup dziedzicząca po Trojkat
class Ostroslup extends Trojkat {
    private double wysokosc;

    // Konstruktor
    public Ostroslup(double bok, double wysokosc) {
        super(bok);
        this.wysokosc = wysokosc;
    }

    // Metoda obliczająca objętość ostrosłupa
    public double obliczObjetosc() {
        return (1.0 / 3) * obliczPole() * wysokosc;
    }

    // Metoda wyświetlająca pole powierzchni i objętość
    public void show() {
        System.out.println("Pole powierzchni ostrosłupa: " + obliczPole());
        System.out.println("Objętość ostrosłupa: " + obliczObjetosc());
    }
}

// Klasa Graniastoslup dziedzicząca po Trojkat
class Graniastoslup extends Trojkat {
    private double wysokosc;

    // Konstruktor
    public Graniastoslup(double bok, double wysokosc) {
        super(bok);
        this.wysokosc = wysokosc;
    }

    // Metoda obliczająca objętość graniastosłupa
    public double obliczObjetosc() {
        return obliczPole() * wysokosc;
    }

    // Metoda wyświetlająca pole powierzchni i objętość
    public void show() {
        System.out.println("Pole powierzchni graniastosłupa: " + obliczPole());
        System.out.println("Objętość graniastosłupa: " + obliczObjetosc());
    }
}

// Klasa główna do testowania
public class Main {
    public static void main(String[] args) {
        // Test dla Prostopadloscianu
        Prostopadloscian prostopadloscian = new Prostopadloscian(3, 4, 5);
        prostopadloscian.show();

        // Test dla Ostroslupa
        Ostroslup ostroslup = new Ostroslup(4, 6);
        ostroslup.show();

        // Test dla Graniastoslupa
        Graniastoslup graniastoslup = new Graniastoslup(4, 6);
        graniastoslup.show();
    }
}


/*
Pole powierzchni prostopadłościanu: 12.0
Objętość prostopadłościanu: 60.0
Pole powierzchni ostrosłupa: 6.928203230275509
Objętość ostrosłupa: 13.856406460551018
Pole powierzchni graniastosłupa: 6.928203230275509
Objętość graniastosłupa: 41.56921938165305
 */