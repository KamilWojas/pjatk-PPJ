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
