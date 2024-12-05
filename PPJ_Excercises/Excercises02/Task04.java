public class Task04 {
    public static void main(String[] args) {
        int a1 = 0x6D; // a1 = 109 w dziesiętnym
        int a2 = 0x0D; // zzz: a2 = 13 w dziesiętnym
        int a = a1 & a2; // a = 109 & 13 = 13

        int b1 = 0xA;  // b1 = 10 w dziesiętnym
        int b2 = 0xF;  // xxx: b2 = 15 w dziesiętnym
        int b = b1 | b2; // b = 10 | 15 = 15

        int c1 = 11 << 2; // c1 = 11 * 4 = 44
        int c2 = 6;       // yyy: c2 = 6
        int c = c1 ^ c2;  // c = 44 ^ 6 = 42

        System.out.println(a + " " + b + " " + c);
    }
}
/*
Obliczenia dla a:
a1 = 0x6D = 109 (w systemie dziesiętnym).
a2 = 0x0D = 13 (w systemie dziesiętnym).
Operacja AND (&) między 109 i 13:
W bitach: 01101101 & 00001101 = 00001101.
Wynik: a = 13.

Obliczenia dla b:
b1 = 0xA = 10 (w systemie dziesiętnym).
b2 = 0xF = 15 (w systemie dziesiętnym).
Operacja OR (|) między 10 i 15:
W bitach: 00001010 | 00001111 = 00001111.
Wynik: b = 15.

Obliczenia dla c:
c1 = 11 << 2 = 44 (przesunięcie bitowe w lewo o 2 pozycje to mnożenie przez 4).
c2 = 6.
Operacja XOR (^) między 44 i 6:
W bitach: 00101100 ^ 00000110 = 00101010.
Wynik: c = 42.

 */