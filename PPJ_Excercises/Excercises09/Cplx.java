
public class Cplx {
    // Prywatne pola obu liczb
    private double re; // Część rzeczywista
    private double im; // Część urojona

    // Dwuparametrowy konstruktor
    public Cplx(double re, double im) {
        this.re = re;
        this.im = im;
    }

    // Funkcja dodawania
    public Cplx add(Cplx other) {
        return new Cplx(this.re + other.re, this.im + other.im);
    }


    // Funkcja odejmowania
    public Cplx sub(Cplx other) {
        return new Cplx(this.re - other.re, this.im - other.im);
    }

    // Funkcja mnożenia
    public Cplx mul(Cplx other) {
        double realPart = this.re * other.re - this.im * other.im;
        double imaginaryPart = this.re * other.im + this.im * other.re;
        return new Cplx(realPart, imaginaryPart);
    }

    // Funkcja zwiększająca część rzeczywistą o jeden
    public void inc() {
        this.re += 1;
    }

    // Funkcja show wyświetlająca liczbę zespoloną
    public void show() {
        System.out.println(this.re + " + " + this.im + "i");
    }

    // Przykładowe użycie
    public static void main(String[] args) {
        // Tworzenie liczb zespolonych
        Cplx c1 = new Cplx(4, 5);
        Cplx c2 = new Cplx(2, -3);

        // Wyświetlenie liczby c1
        System.out.print("Liczba c1: ");
        c1.show();

        // Dodawanie
        Cplx c3 = c1.add(c2);
        System.out.print("Dodawanie (c1 + c2): ");
        c3.show();

        // Odejmowanie
        Cplx c4 = c1.sub(c2);
        System.out.print("Odejmowanie (c1 - c2): ");
        c4.show();

        // Mnożenie
        Cplx c5 = c1.mul(c2);
        System.out.print("Mnożenie (c1 * c2): ");
        c5.show();

        // Zwiększenie części rzeczywistej o jeden
        System.out.print("Zwiększenie części rzeczywistej c1: ");
        c1.inc();
        c1.show();
    }
}

/*
Prywatne pola:

re dla części rzeczywistej i im dla części urojonej.
Konstruktor:

Inicjalizuje wartości pól re i im.
Metody matematyczne:

add(Cplx other): Dodaje dwie liczby zespolone.
sub(Cplx other): Odejmuje dwie liczby zespolone.
mul(Cplx other): Mnoży dwie liczby zespolone.
Metoda inc:

Zwiększa część rzeczywistą o 1.
Metoda show:

Wyświetla liczbę zespoloną w formacie a + bi.
Przykłady użycia:

W metodzie main stworzono trzy liczby zespolone i przeprowadzono na nich operacje dodawania, odejmowania i mnożenia oraz wywołano metodę inc.
 */

/*
Liczba c1: 4.0 + 5.0i
Dodawanie (c1 + c2): 6.0 + 2.0i
Odejmowanie (c1 - c2): 2.0 + 8.0i
Mnożenie (c1 * c2): 23.0 + 14.0i
Zwiększenie części rzeczywistej c1: 5.0 + 5.0i
 */