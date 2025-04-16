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