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