class Test {
    public Test() {
        System.out.println("Konstruktor!");
    }
}

public class Main {
    public static void main(String[] args) {
        Test t = new Test();
    }
}

//Rozwiązanie:
//   Konstruktor Test() uruchamia się automatycznie przy tworzeniu obiektu new Test();
//   Wypisze: Konstruktor!



==========================================================================================
//Co wypisze kod?

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < arr.length / 2; i++) {
        System.out.print(
        arr[i % 3 == 0 ? arr.length - 1 - i : i]
        );
        }

//        Rozwiązanie:
//
//        arr.length = 9 → arr.length / 2 = 4 → pętla od i=0 do i<4
//        Dla każdego i:
//
//        i=0 → 0%3==0 → arr[8] = 8
//
//        i=1 → 1%3!=0 → arr[1] = 1
//
//        i=2 → 2%3!=0 → arr[2] = 2
//
//        i=3 → 3%3==0 → arr[5] = 5 (arr[8 - 3] = arr[5])
//
//        Odpowiedź: 8125

==========================================================================================

      Jaki wynik daje 4 | 1 i 5 & 3?
//
//        Rozwiązanie:
//
//        4 = 0100
//
//        1 = 0001
//
//        4 | 1 = 0101 = 5
//        (operacja OR ustawia bit na 1, jeśli choć jeden z operandów ma 1)
//
//        5 = 0101
//
//        3 = 0011
//
//        5 & 3 = 0001 = 1
//        (AND daje 1 tylko tam, gdzie oba bity to 1)
//
//        Odpowiedź:
//        4 | 1 = 5
//        5 & 3 = 1


==========================================================================================

//       Ile razy wykona się pętla do-while?

        int i = 5;
        do {
        System.out.println(i);
        i++;
        } while (i < 5);

//        Rozwiązanie: Pętla do-while zawsze wykona się minimum raz, nawet jeśli warunek jest fałszywy.
//        Tutaj:
//
//        i = 5, warunek i < 5 jest fałszywy.
//
//        Ale do {} wykona się raz, więc wypisze: 5
//        Odpowiedź: 1 raz


//Ile minimum razy wykona się pętla do-while?

        int i = 10;
        do {
        System.out.println(i);
        i++;
        } while (i < 0);

//Pętla wykona się dokładnie raz.
//W do-while ciało pętli zawsze wykona się przynajmniej jeden raz, nawet jeśli warunek jest fałszywy.


==========================================================================================

//Jaki wynik da operacja 4 | 1?

        4 = 100
        1 = 001
        ---------
        4 | 1 = 101 (czyli 5)

//        Odpowiedź: 5
//        Operator | (bitowe OR) porównuje każdy bit osobno i ustawia 1,
//        jeśli przynajmniej jeden z bitów ma wartość 1.



==========================================================================================

//        Czym różni się przeciążenie (overloading) od przesłonięcia (overriding)?
//
//        Overloading (przeciążenie): w tej samej klasie, ta sama nazwa metody,
//        różne parametry (liczba, typ lub kolejność).
//
//        Overriding (przesłonięcie): nadpisanie metody z klasy nadrzędnej w klasie dziedziczącej.
//        Parametry i nazwa muszą być identyczne.

// Przeciążenie:

        void print(int x) {}
        void print(String x) {}

// Przesłonięcie

class A {
    void show() { System.out.println("A"); }
}
class B extends A {
    @Override
    void show() { System.out.println("B"); }
}



//Które z poniższych wywołań są poprawne i dopasują się do przeciążonych metod?

class Kalkulator {
    public int dodaj(int a, int b) {
        return a + b;
    }

    public int dodaj(int a, int b, int c) {
        return a + b + c;
    }
}

   // Które wywołania są poprawne?

        k.dodaj(2, 3); Tak

        k.dodaj(2, 3, 4); Tak

        k.dodaj(2); Nie

        k.dodaj(2, 3, 4, 5); Nie

//Przeciążenie oznacza wiele metod o tej samej nazwie,
// ale różnych sygnaturach (liczba/typ argumentów). Musi istnieć dokładne dopasowanie.

==========================================================================================

//Tablice i operatory warunkowe

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < arr.length / 2; i++) {
        System.out.print(
        arr[i % 3 == 0 ? arr.length - 1 - i : i]
        );
        }


//        arr.length = 9, arr.length/2 = 4, więc 4 iteracje.
//
//        i = 0 → 0 % 3 == 0 → true → arr[8] → 9
//        i = 1 → false → arr[1] → 2
//        i = 2 → false → arr[2] → 3
//        i = 3 → true → arr[5] → 6
//
//       Odp: 9286


==========================================================================================

//Co się stanie, jeśli mamy taką hierarchię klas?

class A {
    A() {
        System.out.println("A");
    }
}

class B extends A {
    B() {
        System.out.println("B");
    }
}

public class Main {
    public static void main(String[] args) {
        new B();
    }
}

// Odp A
//B
//Najpierw wywoływany jest konstruktor klasy nadrzędnej (A), potem klasy pochodnej (B).


==========================================================================================

//        Dane są klasy A, B i C. Klasa B dziedziczy po A, a C po B.
//        Każda z nich ma konstruktor z komunikatem System.out.println().
//        Co zostanie wypisane na ekranie?

class A {
    A() {
        System.out.println("Konstruktor A");
    }
}

class B extends A {
    B() {
        System.out.println("Konstruktor B");
    }
}

class C extends B {
    C() {
        System.out.println("Konstruktor C");
    }
}

public class Main {
    public static void main(String[] args) {
        C obiekt = new C();
    }
}

//        Odp:
//                Konstruktor A
//                Konstruktor B
//                Konstruktor C

//    Przy tworzeniu obiektu klasy pochodnej (C),
//    konstruktory klas nadrzędnych (B i A) wywoływane
//    są automatycznie w kolejności dziedziczenia (od najstarszej klasy do najnowszej).


==========================================================================================

//Czy kod się skompiluje?

class A {
    private void pokaz() {
        System.out.println("A");
    }
}

class B extends A {
    void pokaz() {
        System.out.println("B");
    }
}

//Czy metoda pokaz() z klasy B przesłania metodę z klasy A?

//Odpowiedź: Nie – to NIE jest przesłanianie.
//Metoda pokaz() w klasie A jest private, więc nie jest widoczna w klasie B. W klasie B powstaje nowa,
//niezależna metoda, a nie przesłonięcie (override).


==========================================================================================

//Bloki inicjalizacyjne - Co zostanie wypisane?

class Test {
    {
        System.out.println("Blok zwykły");
    }

    static {
        System.out.println("Blok statyczny");
    }

    Test() {
        System.out.println("Konstruktor");
    }
}

public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        Test t2 = new Test();
    }
}


//        Odp:
//                Blok statyczny
//                Blok zwykły
//                Konstruktor
//                Blok zwykły
//                Konstruktor


==========================================================================================
//Co wypisze ten kod z plikiem?

        FileOutputStream fos = new FileOutputStream("out.bin");
        fos.write(260);
        fos.close();

        FileInputStream fis = new FileInputStream("out.bin");
        System.out.println(fis.read());
        fis.close();

//260 % 256 = 4 → FileOutputStream.write(int) zapisuje tylko 1 bajt (8 bitów) – najmłodsze 8 bitów liczby.
//260 = 00000001 00000100 → zapisywany jest tylko ostatni bajt: 00000100 = 4.





==========================================================================================
//Czy wystąpi wyjątek?

        int[] tab = new int[5];
        System.out.println(tab[5]);

//Indeksy w tablicy zaczynają się od 0. Dla new int[5] poprawne indeksy to 0..4. tab[5]
//przekracza zakres → wyjątek w czasie działania programu.



==========================================================================================
//Zadanie – Jak działa pętla for?

for (int i = 0, i < 3; i++){
    System.out.println("TEST");
        }

//        int i = 0 – zaczynamy liczyć od zera.
//        i < 3 – dopóki i jest mniejsze niż 3, wykonuj to, co jest w {}.
//        i++ – po każdym razie zwiększ i o 1.



==========================================================================================
//Jak działa operator ||? (czyli „lub”)

int b = 5;
int a = 10;

if (a > 3 || b < 5){
    System.out.println("Warunek spełniony");
        }

//        a > 3 to prawda, bo 5 > 3.
//        b < 5 to fałsz, bo 10 nie jest mniejsze od 5.
//        || oznacza: jeśli chociaż jeden warunek jest prawdziwy, to pętla się wykona

==========================================================================================
//operator %

int wynik = 10 % 3;
System.out.printl(wynik);

//% reszta z dzielenia




==========================================================================================
//Tworzenie obiektu 

class Zwierze{ 
    Zwierze(){
        System.out.println("Tworzenie zwierzęcia");
    } 
}

public class Main{
    public static void main(String [] args){
        Zwierze z = new Zwierze();
    }
}

//new Zwierze() tworzymy nowy obiekt
//Tworzymy za pomocą konstruktora



==========================================================================================
//Zmodyfikuj kod pętli tak aby wykorzytał pętle while

int s = 0;
for (int i = 1; i <= 10; i++)
    s = s + 1;

//Modyfikcj

int s = 0;  //zaczynamy od 0
int i = 1;  //zaczynamy od 1

while(i <= 10){     //dopóki i jest mniejsze od lub równe 10 pętla się wykonuje 
    s = s + i;  //dodajemy i do s
    i++;        //zwiększamy i o 1 (czyli i = i +1)
        }



==========================================================================================
//Przedstaw różnicę między pętlami while i do while

public class PetlaWhile{
    public static void main(String [] args){
        int a = 5;
        
        System.out.println("Pętla while");
        while (a < 5){
            System.out.println("Nie wyświetli się bo warunek jest fałszywy");
        }

        System.out.println("Pętla do-while");
        do {
            System.out.println("To się wyświetli nawet gdy warunek jest fałszywy");
        }while (a < 5);
    }
} 





==========================================================================================
//Pokaż zmodyfikowany program, który pokazuje jak pętla mnoży kolejne liczby przez zmienną wrt

public class PetlaMnozenie{
    public static void main(String [] args){
        int wrt = 3; //Liczba przez którą będziemy mnożyć
        int i = 1; //zaczynamy od 1

        while (i <= 10){
            int wynik = i * wrt;
            System.out.println(i + " * " + wrt + " = " + wynik);
            i++;
        }
    }
}




==========================================================================================
//Napisz kod, który wypisuje wszystkie liczby podzielne bez reszty przez 3 i 2 (czyli przez 6) z przedziału od -1500 do 1500.

public class Podzielne{
    public static void main(String[] args) {
        int i = -1500;
        
        while (i <= 1500){
            if (i % 3 == 0 && i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}

==========================================================================================
//Stwórz kompas, który reaguje na klawisze A (obrót w lewo) i D (obrót w prawo), pokazując aktualny kierunek.

public class Kompas{ 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String[] kierunki = {"North", "East", "South", "West"};
        int pozycja = 0;

        while (true){
            System.out.println("-> ");
            char c = in.next().charAt(0);

            if (c == 'A' || c == 'a'){
                pozycja = (pozycja + 3) % 4;
            } else if (c == 'D' || c == 'd') {
                pozycja = (pozycja + 1) % 4;
            }else {
                System.out.println("Koniec");
                break;
            }
            System.out.println(kierunki[pozycja]);
        } 
    }
}


==========================================================================================
//Zadeklaruj tablicę jednowymiarową typu int o rozmiarze 10 elementów

int[] tab = new int[10];


==========================================================================================
//Działanie pętli do-while, warunku while(i < 3) oraz działania bitowego 4 | 1.

public class PetlaBitowa{
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Iteracja: " + 1);
            i++;
        }while (i < 3);

        System.out.println("Wynik operacji bitowej 4 | 1: " + (4 | 1));
    }
}





==========================================================================================
//Typy danych i operacje bitowe

public class BajtyInt{
    public static void main(String[] args) {
        int[] liczby = {123, 500, 1024, 4000};

        for (int n : liczby){
            byte[] bajty = ByteBuffer.allocate(4).putInt(n).array();
            System.out.println("Liczba: " + n + "-> Bajty (od końca): " + Arrays.toString(reverse(bajty)));
        }
    }

    public static byte[] reverse(byte[] bajty){
        for (int i = 0; i < bajty.length /2; i++){
            byte tmp = bajty[i];
            bajty[i] = bajty[bajty.length - 1 - i];
            bajty[bajty.length - 1 - i] = tmp;
        }
        return bajty;
    }
}  


==========================================================================================
//Pokazać działanie konstruktora, wyjątku oraz efekt System.out.println() w konstruktorze.

public class WyjatkiIKonstruktor {
    public static void main(String[] args) {
        try {
            Test t = new Test(); // Konstruktor wyświetli komunikat
            t.dziel(10, 0); // Błąd: dzielenie przez 0
        } catch (ArithmeticException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}

class Test {
    public Test() {
        System.out.println("Konstruktor został wywołany.");
    }

    public void dziel(int a, int b) {
        System.out.println("Wynik: " + (a / b));
    }
}


==========================================================================================
//Zobaczyć działanie polimorfizmu, @Override, overloading vs overriding, dziedziczenie.

class Zwierze {
    public void dajGlos() {
        System.out.println("Zwierzę wydaje dźwięk");
    }

    public void dajGlos(String dodatkowy) { // Overloading
        System.out.println("Zwierzę: " + dodatkowy);
    }
}

class Pies extends Zwierze {
    @Override
    public void dajGlos() {
        System.out.println("Hau hau");
    }
}
public class Polimorfizm {
    public static void main(String[] args) {
        Zwierze z1 = new Zwierze();
        Zwierze z2 = new Pies();

        z1.dajGlos();      
        z2.dajGlos();      
        z1.dajGlos("zzz");  

    }
}





==========================================================================================
//Zainicjalizować tablicę dwuwymiarową, wypisać uporządkowane liczby.

public class Tablica2D {
    public static void main(String[] args) {
        int[][] tablica = {
                {5, 2, 8},
                {3, 1, 6},
                {9, 4, 7}
        };

        System.out.println("Tablica wejściowa:");
        wypisz(tablica);

        int[] plaska = Arrays.stream(tablica)
                .flatMapToInt(Arrays::stream)
                .toArray();
        Arrays.sort(plaska);

        System.out.println("\nLiczby posortowane:");
        System.out.println(Arrays.toString(plaska));
    }
    public static void wypisz(int[][] t) {
        for (int[] rzad : t) {
            for (int el : rzad) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}




==========================================================================================
//Licznik bitów – ile 1 w liczbie binarnej

public class LicznikBitow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();

        int kopia = liczba; 
        int licznik = 0;

        while (liczba != 0) {
            if ((liczba & 1) == 1) {
                licznik++;
            }
            liczba = liczba >>> 1;
        }

        System.out.println("Binarna reprezentacja: " + Integer.toBinaryString(kopia));
        System.out.println("Liczba jedynek: " + licznik);

        scanner.close();
    }
}



==========================================================================================
//Dziedziczenie – kolejność wywołania konstruktorów

class Organizm {
    public Organizm() {
        System.out.println("Konstruktor: Organizm");
    }
}

class Zwierze extends Organizm {
    public Zwierze() {
        System.out.println("Konstruktor: Zwierze");
    }
}

class Pies extends Zwierze {
    public Pies() {
        System.out.println("Konstruktor: Pies");
    }
}

public class DziedziczenieKonstruktory {
    public static void main(String[] args) {
        Pies p = new Pies();
    }
}




==========================================================================================
//interfejsy vs klasy abstrakcyjne

interface Glos {
    void dajGlos();
}

abstract class Zwierze {
    String imie;

    public Zwierze(String imie) {
        this.imie = imie;
    }

    public void przedstawSie() {
        System.out.println("Cześć, jestem " + imie);
    }
}

class Kot extends Zwierze implements Glos {
    public Kot(String imie) {
        super(imie);
    }


    @Override
    public void dajGlos() {
        System.out.println("Miau miau!");
    }
} 

public class InterfejsyAbstrakcyjne {
    public static void main(String[] args) {
        Kot k = new Kot("Puszek");
        k.przedstawSie();  
        k.dajGlos();
    }
}







==========================================================================================
//Zliczanie unikalnych elementów – Set

public class UnikalneImiona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz imiona oddzielone spacją:");
        String[] imiona = scanner.nextLine().split("\\s+");

        Set<String> unikalne = new HashSet<>();
        Set<String> powtorzenia = new HashSet<>();

        for (String imie : imiona) {
            if (!unikalne.add(imie)) {
                powtorzenia.add(imie);
            }
        }

        System.out.println("Liczba unikalnych imion: " + unikalne.size());
        System.out.println("Powtórzone imiona: " + (powtorzenia.isEmpty() ? "brak" : powtorzenia));
        scanner.close();
    }
}






==========================================================================================
//wykorzystanie enum i switch-case

enum StatusZamowienia {
    NOWE,
    W_REALIZACJI,
    WYSŁANE,
    DOSTARCZONE
}

public class SystemZamowienEnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj status zamówienia (NOWE, W_REALIZACJI, WYSŁANE, DOSTARCZONE): ");
        String input = scanner.nextLine().toUpperCase();

        try {
            StatusZamowienia status = StatusZamowienia.valueOf(input);

            switch (status) {
                case NOWE:
                    System.out.println("Zamówienie zostało utworzone.");
                    break;
                case W_REALIZACJI:
                    System.out.println("Zamówienie jest w trakcie realizacji.");
                    break;
                case WYSŁANE:
                    System.out.println("Zamówienie zostało wysłane.");
                    break;
                case DOSTARCZONE:
                    System.out.println("Zamówienie zostało dostarczone do klienta.");
                    break;
            }
             
        } catch (IllegalArgumentException e) {
            System.out.println("Niepoprawny status zamówienia!");
        }

        scanner.close();
    }
}





==========================================================================================
//Własny wyjątek – sprawdzanie wieku użytkownika

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}


public class WlasnyWyjatek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swój wiek: ");
        int wiek = scanner.nextInt();

        try {
            sprawdzWiek(wiek);
            System.out.println("Wiek jest poprawny. Możesz kontynuować.");
        } catch (InvalidAgeException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }

    public static void sprawdzWiek(int wiek) throws InvalidAgeException {
        if (wiek < 18) {
            throw new InvalidAgeException("Musisz mieć co najmniej 18 lat!");
        }
    }
}







==========================================================================================
//Licznik instancji klasy – metody statyczne

class Uzytkownik {
    private static int licznik = 0;
    private String imie;

    public Uzytkownik(String imie) {
        this.imie = imie;
        licznik++;
    }
    public static int ileUzytkownikow() {
        return licznik;
    }
}
    public static int ileUzytkownikow() {
        return licznik;
    }
}





==========================================================================================
//Szukanie największej liczby w tablicy

public class NajwiekszaLiczba {
    public static void main(String[] args) {
        int[] liczby = {12, 7, 34, 56, 2, 89, 24};

        int max = liczby[0];

        for (int i = 1; i < liczby.length; i++) {
            if (liczby[i] > max) {
                max = liczby[i];
            }
        }

        System.out.println("Największa liczba w tablicy to: " + max);
    }
}




==========================================================================================
//Liczba parzysta/nieparzysta z wyjątkiem

public class ParzystoscWyjatek { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();

        try {
            sprawdzParzystosc(liczba);
            System.out.println("Podana liczba jest parzysta.");
        } catch (IllegalArgumentException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }

    public static void sprawdzParzystosc(int liczba) {
        if (liczba % 2 != 0) {
            throw new IllegalArgumentException("Liczba jest nieparzysta!");
        }
    }
}





==========================================================================================
//Kasa w sklepie – prosta symulacja z klasami i metodami

class Produkt {
    String nazwa;
    double cena;

    public Produkt(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public void wypisz() {
        System.out.println(nazwa + " - " + cena + " zł");
    }
}

public class KasaSklepowa {
    public static void main(String[] args) {
        Produkt p1 = new Produkt("Chleb", 4.5);
        Produkt p2 = new Produkt("Masło", 7.3);
        Produkt p3 = new Produkt("Mleko", 3.2);

        double suma = p1.cena + p2.cena + p3.cena;

        p1.wypisz();
        p2.wypisz();
        p3.wypisz();

        System.out.println("Suma do zapłaty: " + suma + " zł");
    }
}





==========================================================================================
//Odwracanie tekstu – manipulacja String i pętle

public class OdwrotnyTekst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj tekst: ");
        String tekst = scanner.nextLine();

        String odwrotny = "";
        for (int i = tekst.length() - 1; i >= 0; i--) {
            odwrotny += tekst.charAt(i);
        }
        System.out.println("Tekst od tyłu: " + odwrotny);
    }
}





==========================================================================================
//Sprawdź, czy tekst jest palindromem

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj tekst: ");
        String tekst = scanner.nextLine().toLowerCase();

        String odwrotny = new StringBuilder(tekst).reverse().toString();

        if (tekst.equals(odwrotny)) {
            System.out.println("To jest palindrom!");
        } else {
            System.out.println("To NIE jest palindrom.");
        }
    }
}





==========================================================================================
//Czy liczba jest doskonała?

public class LiczbaDoskonala {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();

        int sumaDzielnikow = 0;

        for (int i = 1; i <= liczba / 2; i++) {
            if (liczba % i == 0) {
                sumaDzielnikow += i;
            }
        }

        if (sumaDzielnikow == liczba) {
            System.out.println("To jest liczba doskonała!");
        } else {
            System.out.println("To NIE jest liczba doskonała.");
        } 
    }  
}





==========================================================================================
//Usuwanie duplikatów z tablicy liczb całkowitych

public class UsunDuplikaty{
    public static void main(String[] args) {
        int[] dane = {1, 2, 3, 2, 4, 5, 1, 6};

        System.out.println("Unikalne wartości");
        for (int i = 0; i < dane.length; i++ ){
            boolean duplikaty = false;

            for (int j = 0; j < i; j++){
                if (dane[i] == dane[j]){
                    duplikaty = true;
                    break;
                }
            }
            if (!duplikat) {
                System.out.print(dane[i] + " ");
            }
        }
    }
}







==========================================================================================
//Ile razy wykona się pętla do-while, jeśli warunek od razu jest fałszywy?

public class PetlaDoWhile{
    public static void main(String[] args) {
        int licznik = 0;

        do {
            System.out.println("Wykonanie " + licznik);
            licznik++;
        }while (licznik < 0);
    }
}






==========================================================================================
//Suma liczb podzielnych przez 3 i 5 z zakresu 1–100

public class SumaPodzielnych {
    public static void main(String[] args) {
        int suma = 0;
        
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                suma += i;
            }
        }

        System.out.println("Suma liczb podzielnych przez 3 i 5 w zakresie 1–100: " + suma);
    }
}




==========================================================================================
//Rysowanie prostokąta z gwiazdek (*)

public class RysujProstokat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj szerokość: ");
        int szerokosc = scanner.nextInt();

        System.out.print("Podaj wysokość: ");
        int wysokosc = scanner.nextInt();

        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < szerokosc; j++) {
                System.out.print("*");
            }

        }
        System.out.println();   
    }
}
 



==========================================================================================
//Sprawdź, czy liczba jest liczbą pierwszą


public class LiczbaPierwsza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        boolean pierwsza = true;

        if (liczba <= 1) {
            pierwsza = false;
        } else {
            for (int i = 2; i <= Math.sqrt(liczba); i++) {
                if (liczba % i == 0) {
                    pierwsza = false;
                    break;
                }
            }
        }

        if (pierwsza) {
            System.out.println("Liczba " + liczba + " jest pierwsza.");
        } else {
            System.out.println("Liczba " + liczba + " nie jest pierwsza.");
        }
    }
}




==========================================================================================
//Ile cyfr zawiera liczba?

public class LiczbaCyfr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = Math.abs(scanner.nextInt());

        int licznik = 0;
        do {
            liczba /= 10;
            licznik++;
        } while (liczba > 0);

        System.out.println("Liczba składa się z " + licznik + " cyfr.");
    }
}





==========================================================================================
//Utwórz trzy tablice zmiennych typu int o losowych rozmiarach i wypełnij je losowymi wartościami.
// Następnie utwórz tablicę, której elementami będą przygotowane wcześniej tablice.
// Wyświetl wszystkie wylosowane wartości wykorzystując utworzoną tablicę dwuwymiarową.

public class TabliceDwuwymiarowe {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] tab1 = new int[rand.nextInt(5) + 3];
        int[] tab2 = new int[rand.nextInt(5) + 3];
        int[] tab3 = new int[rand.nextInt(5) + 3];

        fillWithRandom(tab1, rand);
        fillWithRandom(tab2, rand);
        fillWithRandom(tab3, rand);

        int[][] wszystkieTablice = { tab1, tab2, tab3 };

        System.out.println("Wartości z tablic dwuwymiarowych:");
        for (int i = 0; i < wszystkieTablice.length; i++) {
            System.out.print("Tablica " + (i + 1) + ": ");
            for (int j = 0; j < wszystkieTablice[i].length; j++) {
                System.out.print(wszystkieTablice[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void fillWithRandom(int[] tab, Random rand) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(100) + 1;
        }
    }
}




==========================================================================================
//Utwórz dwuwymiarową tablicę o rozmiarach 8×8 i wypełnij ją losowymi wartościami z przedziału od 0 do 10.
// Następnie sprawdź, czy na przekątnych tej tablicy (łącznie) występują przynajmniej 3 takie same liczby.

public class Przekatne8x8 {
    public static void main(String[] args) {
        int[][] tablica = new int[8][8];
        Random rand = new Random();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablica[i][j] = rand.nextInt(11);
                System.out.print(tablica[i][j] + "\t");
            }
            System.out.println();
        }

        Map<Integer, Integer> licznik = new HashMap<>();

        for (int i = 0; i < 8; i++) {
            int liczba1 = tablica[i][i];
            int liczba2 = tablica[i][7 - i];

            licznik.put(liczba2, licznik.getOrDefault(liczba2, 0) + 1);
        }
    }
    
    boolean znaleziono = false;
        for (Map.Entry<Integer, Integer> entry : licznik.entrySet()) {
        if (entry.getValue() >= 3) {
            System.out.println("Liczba " + entry.getKey() + " występuje " + entry.getValue() + " razy na przekątnych.");
            znaleziono = true;
        }
    }
        
        if (!znaleziono) {
        System.out.println("Żadna liczba nie występuje co najmniej 3 razy na przekątnych.");
    }
}
}



==========================================================================================
//Utwórz dwuwymiarową tablicę o rozmiarach 8×8 i wypełnij ją losowymi wartościami z przedziału od 0 do 10. 
// Następnie sprawdź, czy na przekątnych tej tablicy (łącznie) występują przynajmniej 3 takie same liczby.

public class PrzekatneTablicy {
    public static void main(String[] args) {
        int[][] tablica = new int[8][8];
        Random rand = new Random();