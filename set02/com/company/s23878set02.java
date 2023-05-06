package com.company;

public class s23878set02 {
    public static void main(String[] args) {
    }
        public void task01() {

                int liczba = 165;
                System.out.println("Liczba w systemie binarnym: " + Integer.toBinaryString(liczba));
                System.out.println("Liczba w systemie ósemkowym: " + Integer.toOctalString(liczba));
                System.out.println("Liczba w systemie szesnastkowym: " + Integer.toHexString(liczba));
            }

    public void task02(){

            int liczba = 14;
            int przesuniecie1 = 0;
            int przesuniecie2 = 2;
            int przesuniecie3 = 4;

            int wynik1 = liczba >> przesuniecie1;
            int wynik2 = wynik1 << przesuniecie2;
            int wynik3 = wynik2 >> przesuniecie3;

            System.out.println("Wartość 14 po przesunięciu o 0 bitów w prawo: " + wynik1);
            System.out.println("Wartość 14 po przesunięciu o 2 bity w lewo: " + wynik2);
            System.out.println("Wartość 14 po przesunięciu o 4 bity w prawo: " + wynik3);
        }

    public void task03(){
        int liczba = 0b1110011001101101; // literał opisujący liczbę całkowitą

        // wartość reprezentowana przez ostatnie 5 bitów
        int ostatnie5bitow = liczba & 0b11111;
        System.out.println("Wartość reprezentowana przez ostatnie 5 bitów: " + ostatnie5bitow);

        // wartość siódmego bitu
        int siódemyBit = (liczba >> 6) & 1;
        System.out.println("Wartość siódmego bitu: " + siódemyBit);

        // wartości poszczególnych bajtów
        int pierwszyBajt = (liczba >> 24) & 0xFF;
        int drugiBajt = (liczba >> 16) & 0xFF;
        int trzeciBajt = (liczba >> 8) & 0xFF;
        int czwartyBajt = liczba & 0xFF;
        System.out.println("Wartości bajtów: " + pierwszyBajt + " " + drugiBajt + " " + trzeciBajt + " " + czwartyBajt);

        // wartość reprezentowana przez dwa środkowe bajty
        int środkoweBajty = (liczba >> 8) & 0xFFFF;
        System.out.println("Wartość reprezentowana przez dwa środkowe bajty: " + środkoweBajty);
    }

    public void task04(){
        int a1 = 0x6D, a2 = 31, a = a1 & a2, b1 = 0xA, b2 = 5, b = b1 | b2, c1 = 11 << 2, c2 = 6, c = c1 ^ c2;
        System.out.println(a + " " + b + " " + c);
    }
}





