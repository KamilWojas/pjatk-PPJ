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