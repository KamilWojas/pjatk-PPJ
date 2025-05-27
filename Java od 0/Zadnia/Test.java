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

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablica[i][j] = rand.nextInt(11);
            }
        }

        System.out.println("Tablica 8x8:");
        for (int[] wiersz : tablica) {
            for (int liczba : wiersz) {
                System.out.printf("%2d ", liczba);
            }
            System.out.println();
        }

        Map<Integer, Integer> licznik = new HashMap<>();
        for (int i = 0; i < 8; i++) {
            int liczba1 = tablica[i][i];
            int liczba2 = tablica[i][7 - i];

            licznik.put(liczba1, licznik.getOrDefault(liczba1, 0) + 1);
            licznik.put(liczba2, licznik.getOrDefault(liczba2, 0) + 1);
        }

        boolean znaleziono = false;
        for (Map.Entry<Integer, Integer> entry : licznik.entrySet()) {
            if (entry.getValue() >= 3) {
                System.out.println("\nNa przekątnych liczba " + entry.getKey() + " występuje " + entry.getValue() + " razy.");
                znaleziono = true;
            }
        }

        if (!znaleziono) {
            System.out.println("\nNa przekątnych nie znaleziono liczby, która występuje co najmniej 3 razy.");
        }
    }
}   
 





==========================================================================================
//Utwórz bezrezultatową metodę show, przyjmującą parametr typu int,
// której celem będzie wyświetlenie na ekran dostarczonej wartości.
// Działanie utworzonej metody przedstaw w programie.


public class Main {

    ublic static void show(int number) {
        System.out.println("Przekazana wartość to: " + number);
    }

    public static void main(String[] args) {

        show(5);
        show(42);
        show(-3);
    }
}


==========================================================================================
//Napisz metodę isEven(int number), która sprawdza, czy przekazana liczba jest parzysta.
//Wyświetl informację, czy liczba jest parzysta, czy nie.


public class Parzystosc {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int liczba = 7;
        if (isEven(liczba)) {
            System.out.println(liczba + " jest parzysta.");
        } else {
            System.out.println(liczba + " jest nieparzysta.");
        }
    }
}


==========================================================================================
//Stwórz metodę, która przyjmie tablicę int[] i zwróci sumę tylko tych elementów, które są większe niż 10.

public class SumaWiekszych {

    public static int sumaWiekszychNiz10(int[] tablica) {
        int suma = 0;
        for (int liczba : tablica) {
            if (liczba > 10) {
                suma += liczba;
            }
        }
        return suma;
    }
    public static void main(String[] args) {
        int[] dane = {5, 12, 7, 20, 3, 18};
        int wynik = sumaWiekszychNiz10(dane);
        System.out.println("Suma liczb większych niż 10: " + wynik);
    }
}




==========================================================================================
//Dana jest tablica zmiennych typu char przechowująca napis "Ala ma kota". 
// Napisz metodę, która policzy, ile razy wystąpiły znaki składające się na ciąg dostarczony jako argument.


public class LiczenieZnakow {
    public static int policzZnaki(char[] tablica, String wzorzec) {
        int licznik = 0;


        for (char znakZTablicy : tablica) {
            for (char znakZWzorca : wzorzec.toCharArray()) {
                if (znakZTablicy == znakZWzorca) {
                    licznik++;
                    break;
                }
            }
        }

        return licznik;
    }
    public static void main(String[] args) {
        char[] tekst = "Ala ma kota".toCharArray();

        tring szukaneZnaki = "ak";

        int wynik = policzZnaki(tekst, szukaneZnaki);
        System.out.println("Znaleziono " + wynik + " pasujących znaków.");
    }
}






==========================================================================================
//Treść zadania:
//Utwórz i wypełnij losowymi wartościami dwie tablice typu int[],
//Utwórz metodę, która przyjmie obie tablice oraz dodatkowy argument int sterowanie,
//W zależności od wartości sterowanie:
//jeśli < 0 → zwróć tablicę sum elementów na tych samych indeksach (gdzie istnieją pary),
//jeśli > 0 → zwróć tablicę z elementami, które nie mają pary,
//jeśli == 0 → zwróć null.

public class OperacjeNaTablicach {

    public static void main(String[] args) {
        Random rand = new Random();

        int[] tab1 = new int[rand.nextInt(6) + 5]; 
        int[] tab2 = new int[rand.nextInt(6) + 5];

        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = rand.nextInt(100);
        }

        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = rand.nextInt(100);
        }

        System.out.println("Tablica 1: " + Arrays.toString(tab1));
        System.out.println("Tablica 2: " + Arrays.toString(tab2));

        int[] wynik = operujNaTablicach(tab1, tab2, -5);

        if (wynik != null) {
            System.out.println("Wynik: " + Arrays.toString(wynik));
        } else {
            System.out.println("Zwrócono null.");
        }
    }

    public static int[] operujNaTablicach(int[] t1, int[] t2, int sterowanie) {
        int min = Math.min(t1.length, t2.length);
        int max = Math.max(t1.length, t2.length);

        if (sterowanie < 0) {
            int[] suma = new int[min];
            for (int i = 0; i < min; i++) {
                suma[i] = t1[i] + t2[i];
            }
            return suma;
            
        } else if (sterowanie > 0) {
            int[] dluzsza;
            if (t1.length > t2.length) {
                dluzsza = Arrays.copyOfRange(t1, min, t1.length);
            } else {

                dluzsza = Arrays.copyOfRange(t2, min, t2.length);
            }
            return dluzsza;

        } else {
            return null;
        }
    }
}



==========================================================================================
//Utwórz bezrezultatową metodę wypisującą na ekranie kwadrat z naprzemiennie występujących znaków x i o.
//Pierwszy argument metody: rozmiar boku kwadratu,
//Drugi argument: znak, od którego zacząć (x lub o).

public class KwadratXO {

    public static void wypiszKwadrat(int rozmiar, char start) {
        char znak1 = (start == 'x') ? 'x' : 'o';
        char znak2 = (znak1 == 'x') ? 'o' : 'x';

        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print(znak1);
                } else {
                    System.out.print(znak2);
                }
            }
            System.out.println(); 
        }
    } 

    public static void main(String[] args) {

        wypiszKwadrat(5, 'x');
        System.out.println();
        wypiszKwadrat(4, 'o');
    }  
} 
     


==========================================================================================
//Zadeklaruj jednowymiarową tablicę zmiennych typu int o rozmiarze 10 elementów i wypełnij 
// ją losowymi wartościami 0 lub 1.


public class TablicaZeroJeden {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        Random rand = new Random();

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = rand.nextInt(2);

        }

        System.out.println("Tablica: " + Arrays.toString(tablica));
    }
}




==========================================================================================
//Dla każdej nazwy zapisanej w postaci tablicy char[]:
//Sprawdź, czy:
//Zawiera przynajmniej dwie takie same litery (niezależnie od wielkości),
//Suma wartości znaków (ASCII) przekracza 255,
//Zawiera przynajmniej jedną literę 'i',
//Zawiera przynajmniej dwa identyczne znaki (rozróżniając wielkość liter),
//Wypisz nazwy, które spełniają co najmniej 3 z powyższych warunków.


public class SprawdzanieNazw {

    public static void main(String[] args) {
        char[][] tab = {
                {'S', 'a', 'a', 'm', 'u', 'n', 'g'},
                {'N', 'o', 'k', 'i', 'a'},
                {'A', 'p', 'p', 'l', 'e'},
                {'O', 'p', 'p', 'o'},
                {'H', 'u', 'a', 'w', 'e', 'i'},
                {'B', 'l', 'a', 'c', 'k', 'B', 'e', 'r', 'r', 'y'},
                {'S', 'o', 'n', 'y'},
                {'X', 'i', 'a', 'o', 'm', 'i'},
                {'j', 'o', 'l', 'l', 'a'}
        };

        for (char[] nazwa : tab) {
            int warunki = 0;

            Set<Character> unikalneMale = new HashSet<>();
            boolean duplikatBezWielkosci = false;
            for (char c : nazwa) {
                char lower = Character.toLowerCase(c);
                if (!unikalneMale.add(lower)) {
                    duplikatBezWielkosci = true;
                    break;
                }
            }
            if (duplikatBezWielkosci) warunki++;

            int suma = 0;
            for (char c : nazwa) suma += c;
            if (suma > 255) warunki++;

            boolean zawieraI = false;
            for (char c : nazwa) {
                if (c == 'i') {
                    zawieraI = true;
                    break;
                }
            }
            if (zawieraI) warunki++;

            Set<Character> unikalneZRozroznieniem = new HashSet<>();
            boolean duplikat = false;
            for (char c : nazwa) {
                if (!unikalneZRozroznieniem.add(c)) {
                    duplikat = true;
                    break;
                }
            }
            if (duplikat) warunki++;

            if (warunki >= 3) {
                System.out.println(nazwaToString(nazwa));
            }
        }
    }

    public static String nazwaToString(char[] nazwa) {
        StringBuilder sb = new StringBuilder();
        for (char c : nazwa) {
            sb.append(c);
        }
        return sb.toString();
    }
}



==========================================================================================
//Utwórz dwuwymiarową tablicę typu int o wymiarach 10×10, wypełnij 
//ją losowymi liczbami i posortuj rosnąco każdy wiersz tej tablicy.

public class SortowanieWierszyTablicy {
    public static void main(String[] args) {
        int[][] tablica = new int[10][10];
        Random rand = new Random();

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                tablica[i][j] = rand.nextInt(100);
            }
        }

        System.out.println("Tablica przed sortowaniem:");
        wyswietl(tablica);

        for (int[] wiersz : tablica) {
            Arrays.sort(wiersz);
        }

        System.out.println("\nTablica po sortowaniu wierszy:");
        wyswietl(tablica);
    }

    public static void wyswietl(int[][] tablica) {
        for (int[] wiersz : tablica) {
            for (int liczba : wiersz) {
                System.out.printf("%3d ", liczba);
            }
            System.out.println();
        }
    }
}



==========================================================================================

char[][] chars = new char['z' - 'a']['z' - 'a'];

        for (int i = 0; i < chars.length; i++) {
            char c = 'a';
        for (int j = 0; j < chars.length; j++, c++) {
         chars[i][j] = c;
            }
        }

        for (int i = 0, step = 1; i < chars.length; step = (step << 1) % chars[i].length, i++) {
        System.out.println(chars[i][step]);
        }



==========================================================================================
//Zlicza ile zer i jedynek znajduje się w tablicy 1D z poprzedniego zadania, 
// w której losowo wstawiane były tylko 0 i 1.

public class LicznikZerIJedynek {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        Random rand = new Random();

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = rand.nextInt(2);
        }

        System.out.println("Tablica: " + Arrays.toString(tablica));

        int licznikZer = 0;
        int licznikJedynek = 0;

        for (int liczba : tablica) {
            if (liczba == 0) {
                licznikZer++;
            } else if (liczba == 1) {
                licznikJedynek++;
            }
        }

        System.out.println("Liczba zer: " + licznikZer);
        System.out.println("Liczba jedynek: " + licznikJedynek);
    } 
}
 



==========================================================================================
//Definicja klasy Osoba z publicznymi polami:

public class Osoba {
    public String imie;
    public String nazwisko;
    public int rokUrodzenia;
}


//Użycie klasy – tworzenie obiektu i przypisanie danych:
public class Main { 
    public static void main(String[] args) {

        Osoba osoba = new Osoba();

        osoba.imie = "Jan";
        osoba.nazwisko = "Kowalski";
        osoba.rokUrodzenia = 1990;

        System.out.println("Imię: " + osoba.imie);
        System.out.println("Nazwisko: " + osoba.nazwisko);
        System.out.println("Rok urodzenia: " + osoba.rokUrodzenia);
    }
}
        
        
        
==========================================================================================

public class Osoba {
    public String imie;
    public String nazwisko;
    public int rokUrodzenia;

    public Osoba(String imie, String nazwisko, int rokUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public void show() {
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Rok urodzenia: " + rokUrodzenia);
    }
}

public class Main {
    public static void main(String[] args) {

        Osoba osoba = new Osoba("Anna", "Nowak", 1985);

        osoba.show();
    }
}



==========================================================================================
//Dana jest tablica typu char[] zawierająca losowe znaki z przedziału 'A' do 'Z'.
//Napisz program, który tworzy nową tablicę — lustrzane odbicie tej pierwszej.

public class LustroTablicy {
    public static void main(String[] args) {
        Random rand = new Random();
        int rozmiar = 10;

        char[] oryginal = new char[rozmiar];
        for (int i = 0; i < rozmiar; i++) {
            oryginal[i] = (char) ('A' + rand.nextInt(26));
        }

        char[] lustro = new char[rozmiar];
        for (int i = 0; i < rozmiar; i++) {
            lustro[i] = oryginal[rozmiar - 1 - i];
        }

        System.out.println("Tablica oryginalna:        " + Arrays.toString(oryginal));
        System.out.println("Tablica lustrzana (mirror): " + Arrays.toString(lustro));
    }
}



==========================================================================================
//Zadeklaruj tablicę double[10], wypełnioną zerami,
//Wypełnij ją losowymi liczbami,
//Wyświetl:
//Całą tablicę,
//Tylko elementy o parzystym indeksie,
//Tylko te elementy, które po rzutowaniu na int są nieparzyste.

public class TablicaDoubleZadanie {
    public static void main(String[] args) {
        double[] tablica = new double[10];
        Random rand = new Random();

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = rand.nextDouble() * 100;
        }

        System.out.println("Cała tablica:");
        for (double liczba : tablica) {
            System.out.printf("%.2f ", liczba);
        }
        System.out.println("\n");

        System.out.println("Elementy o parzystym indeksie:");
        for (int i = 0; i < tablica.length; i += 2) {
            System.out.printf("Index %d: %.2f%n", i, tablica[i]);
        }
        System.out.println();

        System.out.println("Elementy, które po konwersji do int są nieparzyste:");
        for (double liczba : tablica) {
            if (((int) liczba) % 2 != 0) {
                System.out.printf("%.2f (int: %d)%n", liczba, (int) liczba);
            }
        }
    }
}   




==========================================================================================
//Wykorzystując tablicę slowa,
//Wypisuje zdanie:
//Ala ma kota a kot ma Ale

public class ZdanieZTabeli {
    public static void main(String[] args) {
        String[] slowa = { "Ala", "kota", "na", "ma", "a", "kot", "Ale" };

        String wynik = slowa[0] + " " + slowa[3] + " " + slowa[1] + " " +
                slowa[4] + " " + slowa[5] + " " + slowa[3] + " " + slowa[6];

        System.out.println(wynik);
    }
}



==========================================================================================
//Utwórz klasę MethodCurrier z przeciążonymi metodami:
//setValue(int x)
//setValue(float x)
//Wywołaj te metody z literałami typu: int, float, char, byte.

public class MethodCurrier {

    public void setValue(int x) {
        System.out.println("Wywołano setValue(int): " + x);
    }

    public void setValue(float x) {
        System.out.println("Wywołano setValue(float): " + x);
    }

    public static void main(String[] args) {
        MethodCurrier mc = new MethodCurrier();

        int i = 42;
        float f = 42.42f;
        char c = 'A';   
        byte b = 10;

        mc.setValue(i);
        mc.setValue(f);
        mc.setValue(c);\mc.setValue(b); 
    }
}  
        
        
        
        
==========================================================================================
//Dana jest jednowymiarowa tablica typu char zawierająca losowe znaki z zakresu 'A' do 'Z'.
//Napisz program, który:
//
//Tworzy drugą tablicę o tym samym rozmiarze,
//
//Wypełnia ją tak, aby stanowiła lustrzane odbicie pierwszej.

public class LustroTablicyChar {
    public static void main(String[] args) {
        int rozmiar = 10;
        char[] oryginal = new char[rozmiar];
        char[] lustro = new char[rozmiar];

        Random rand = new Random();

        for (int i = 0; i < rozmiar; i++) {
            oryginal[i] = (char) ('A' + rand.nextInt(26));
        }

        for (int i = 0; i < rozmiar; i++) {
            lustro[i] = oryginal[rozmiar - 1 - i];
        }

        System.out.println("Oryginalna tablica: " + Arrays.toString(oryginal));
        System.out.println("Lustrzane odbicie:  " + Arrays.toString(lustro));
    }
} 
        
        
==========================================================================================

public class ZliczanieZerIJedynek {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        Random rand = new Random();

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = rand.nextInt(2); // 0 lub 1
        }

        System.out.println("Tablica: " + Arrays.toString(tablica));

        int liczbaZer = 0;
        int liczbaJedynek = 0;

        for (int liczba : tablica) {
            if (liczba == 0) {
                liczbaZer++;
            } else if (liczba == 1) {
                liczbaJedynek++;
            }
        }

        System.out.println("Liczba zer: " + liczbaZer);
        System.out.println("Liczba jedynek: " + liczbaJedynek);
    }
}
        
        
        
==========================================================================================
//Utwórz klasę Kwadrat z prywatnym polem bok,
//
//Zainicjalizuj to pole w konstruktorze,
//
//Dodaj metodę show(), która:
//
//wypisze pole powierzchni kwadratu,
//
//wypisze objętość sześcianu utworzonego na jego podstawie,
//
//Pokaż przykład użycia klasy.

public class Kwadrat {
    private double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }
    public void show() {
        double pole = bok * bok;
        double objetosc = bok * bok * bok;

        System.out.println("Bok kwadratu: " + bok);
        System.out.println("Pole powierzchni kwadratu: " + pole);
        System.out.println("Objętość sześcianu: " + objetosc);
    }
}

public class Main {
    public static void main(String[] args) {
        Kwadrat k = new Kwadrat(5.0);
        k.show();
    }
}
        
        
        
        
==========================================================================================
//Utwórz klasę Walec z prywatnymi polami promien i wysokosc,
//
//Zainicjalizuj je w konstruktorze,
//
//Dodaj metodę show(), która:
//
//wypisuje pole powierzchni podstawy: π * r²,
//
//wypisuje objętość walca: π * r² * h,
//
//Pokaż przykład użycia klasy.


public class Walec {
    private double promien;
    private double wysokosc;

    public Walec(double promien, double wysokosc) {
        this.promien = promien;
        this.wysokosc = wysokosc;
    }

    public void show() {
        double polePodstawy = Math.PI * promien * promien;
        double objetosc = polePodstawy * wysokosc;

        System.out.printf("Promień: %.2f\n", promien);
        System.out.printf("Wysokość: %.2f\n", wysokosc);
        System.out.printf("Pole podstawy: %.2f\n", polePodstawy);
        System.out.printf("Objętość walca: %.2f\n", objetosc);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Walec walec = new Walec(3.0, 10.0);
        walec.show();
    }
} 



==========================================================================================
public class Prostokat {
    private double a;
    private double b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double polePowierzchni() {
        return a * b;
    }

    public void show() {
        System.out.printf("Pole prostokąta: %.2f\n", polePowierzchni());
    }
}

public class Prostopadloscian extends Prostokat {
    private double wysokosc;

    public Prostopadloscian(double a, double b, double h) {
        super(a, b);
        this.wysokosc = h;
    }

    public double objetosc() {
        return polePowierzchni() * wysokosc;
    }

    public void show() {
        System.out.printf("Pole podstawy: %.2f\n", polePowierzchni());
        System.out.printf("Objętość prostopadłościanu: %.2f\n", objetosc());
    }
}

public class Trojkat {
    private double bok;

    public Trojkat(double bok) {
        this.bok = bok;
    }
    public double polePowierzchni() {
        return (Math.sqrt(3) / 4) * bok * bok;
    }
    public void show() {
        System.out.printf("Pole trójkąta równobocznego: %.2f\n", polePowierzchni());
    }
}

public class Ostroslup extends Trojkat {
    private double wysokosc;

    public Ostroslup(double bok, double wysokosc) {
        super(bok);
        this.wysokosc = wysokosc;
    }

    public double objetosc() {
        return (polePowierzchni() * wysokosc) / 3;
    }

    public void show() {
        System.out.printf("Pole podstawy: %.2f\n", polePowierzchni());
        System.out.printf("Objętość ostrosłupa: %.2f\n", objetosc());
    }
}

public class Graniastoslup extends Trojkat {
    private double wysokosc;

    public Graniastoslup(double bok, double wysokosc) {
        super(bok);
        this.wysokosc = wysokosc;
    }

    public double objetosc() {
        return polePowierzchni() * wysokosc;
    }

    public void show() {
        System.out.printf("Pole podstawy: %.2f\n", polePowierzchni());
        System.out.printf("Objętość graniastosłupa: %.2f\n", objetosc());
    }
}

public class Main {
    public static void main(String[] args) {
        Prostokat p = new Prostokat(4, 5);
        p.show();

        Prostopadloscian pp = new Prostopadloscian(4, 5, 3);
        pp.show();

        Trojkat t = new Trojkat(6);
        t.show();

        Ostroslup o = new Ostroslup(6, 10);
        o.show();

        Graniastoslup g = new Graniastoslup(6, 10);
        g.show();
    }
}




==========================================================================================
//Osoba ma prywatne pole String imie,
//
//Spawacz dziedziczy po Osoba, ma pole int stazPracy,
//
//Obie klasy posiadają metodę String wyswietl(),
//
//Klasa Spawacz używa super.wyswietl() do rozszerzenia informacji z klasy bazowej.


public class Osoba {
    private String imie;

    public Osoba(String imie) {
        this.imie = imie;
    }

    public String wyswietl() {
        return "Imię: " + imie;
    }
}

public class Spawacz extends Osoba {
    private int stazPracy;

    public Spawacz(String imie, int stazPracy) {
        super(imie);
        this.stazPracy = stazPracy;
    }

    @Override
    public String wyswietl() {
        return super.wyswietl() + ", Staż pracy: " + stazPracy + " lat";
    }
}

public class Main {
    public static void main(String[] args) {

        Spawacz s = new Spawacz("Jan", 12);
        System.out.println(s.wyswietl());
    } 
}





==========================================================================================
public class Cplx {
    private double re; 
    private double im;

    public Cplx(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Cplx add(Cplx other) {
        return new Cplx(this.re + other.re, this.im + other.im);
    }

    public Cplx sub(Cplx other) {
        return new Cplx(this.re - other.re, this.im - other.im);
    }

    public Cplx mul(Cplx other) {
        double real = this.re * other.re - this.im * other.im;
        double imag = this.re * other.im + this.im * other.re;
        return new Cplx(real, imag);
    }

    public void inc() {
        this.re += 1;
    }

    public void show() {
        System.out.printf("%.2f %c %.2fi\n", re, (im >= 0 ? '+' : '-'), Math.abs(im));
    }
}

public class Main {
    public static void main(String[] args) {

        Cplx z1 = new Cplx(4, 5);
        Cplx z2 = new Cplx(-2, 3);
        Cplx z3 = new Cplx(1, -7);
        
        System.out.print("z1 = "); z1.show();
        System.out.print("z2 = "); z2.show();
        System.out.print("z3 = "); z3.show();

        System.out.print("\nz1 + z2 = "); z1.add(z2).show();
        System.out.print("z1 - z3 = "); z1.sub(z3).show();
        System.out.print("z2 * z3 = "); z2.mul(z3).show();

        z1.inc();
        System.out.print("\nz1 po inkrementacji części rzeczywistej: ");
        z1.show();
    }
}



==========================================================================================
public class Drzewo {
    boolean wiecznieZielone;
    int wysokosc;
    String przekrojDrzewa;

    public Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa) {
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
    }

    public String toString() {
        return "Drzewo [" + (wiecznieZielone ? "wiecznie zielone" : "liściaste") +
                ", wysokość: " + wysokosc +
                ", przekrój: " + przekrojDrzewa + "]";
    }
}

public class DrzewoIglaste extends Drzewo {
    int iloscIgiel;
    double dlugoscSzczytki;

    public DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa,
                         int iloscIgiel, double dlugoscSzczytki) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.iloscIgiel = iloscIgiel;
        this.dlugoscSzczytki = dlugoscSzczytki;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", DrzewoIglaste [ilość igieł: " + iloscIgiel +
                ", długość szczytki: " + dlugoscSzczytki + "]";
    }
}

public class DrzewoLisciaste extends Drzewo {
    String ksztaltLiscia;

    public DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa,
                           String ksztaltLiscia) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.ksztaltLiscia = ksztaltLiscia;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", DrzewoLisciaste [kształt liścia: " + ksztaltLiscia + "]";
    }
}

public class DrzewoOwocowe extends DrzewoLisciaste {
    String nazwaOwoca;

    public DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa,
                         String ksztaltLiscia, String nazwaOwoca) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa, ksztaltLiscia);
        this.nazwaOwoca = nazwaOwoca;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", DrzewoOwocowe [nazwa owocu: " + nazwaOwoca + "]";
    }
}

public class LasDemo {
    public static void main(String[] args) {
        Drzewo[] las = new Drzewo[4];

        las[0] = new DrzewoIglaste(true, 30, "stożkowy", 100000, 15.0);
        las[1] = new DrzewoLisciaste(false, 20, "walcowaty", "sercowaty");
        las[2] = new DrzewoOwocowe(false, 12, "stożkowy", "eliptyczny", "jabłko");
        las[3] = new Drzewo(false, 15, "kulisty");

        for (Drzewo drzewo : las) {
            System.out.println(drzewo.toString());
        }
    }
}




==========================================================================================
public class Owoc {
    private String nazwa;
    private double masa;

    public Owoc(String nazwa) {
        this.nazwa = nazwa;
        
        this.masa = 100 + new Random().nextInt(151); 
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getMasa() {
        return masa;
    }
}