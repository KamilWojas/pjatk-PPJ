public class OperacjeBitowe {
    public static void main(String[] args){

        int a = 5; //0101 w binarnym
        int b = 3; //0011 w binarmym

        //Operacja AND
        int andWynik = a & b; //Wynik :  0101 & 0011 = 0001 (1 w dziesiętnym)
        System.out.println("AND : " + andWynik);

        //Operacja OR
        int orWynik = a | b; //Wynik : 0101 | 0011 = 0111 (7 w dziesiętnym)
        System.out.println("OR :" + orWynik);

        //Operacja XOR
        int xorWynik = a ^ b; //Wynik : 0101 ^ 0011 = 0110 (6 w dziętnym)
        System.out.println("XOR :" + xorWynik);

        //Operacja NOT
        int notWynik = ~a; //Wynik : ~0101 = 1010
        System.out.println("NOT :" + notWynik);

        //Przesunięcie w lewo
        int przesunLewo = a << 1; //Wynik : 0101 << 1 = 1010
        System.out.println("Przesunięcie w lewo :" + przesunLewo);

        //Przesuń w prawo
        int przesunPrawo = a >> 1; //Wynik : 0101 >> 1 = 0011
        System.out.println("Przesunięcie w prawo :" + przesunPrawo);
        
    }
}


/*
Operacje bitowe manipulują bitami (0 i 1) w liczbach binarnych. W Javie liczby ( int, long, short, byte) są dostępne
w postaci binarnej, więc możemy działać na ich poszczególnych bitach.

Podstawowe operacje bitowe w Javie:
AND ( &) – Bit jest podłączony na 1 tylko wtedy, gdy oba bity są 1.
OR ( |) – Bit jest podłączony na 1, gdy podstawowy jeden z bitów jest 1.
XOR ( ^) – Bit jest podłączony na 1, gdy dokładnie jeden z bitów jest 1.
NOT ( ~) – Odwraca wszystkie bity (0 zamienia na 1, a 1 na 0).
Przesunięcia bitowe:
<<– Przesunięcie w lewo (mnoży przez 2 dla każdego przesunięcia).
>>– Przesunięcie w prawo (dzieli przez 2 dla każdego przesunięcia, następuje znak).
>>>– Przesunięcie w prawo bez zachowania znaku towarowego (uzupełnia bity zerami).

 */

/*
Zadanie 1: Napisz program, który wykonuje operacje AND, OR i XOR na liczbach 12(1100) i 7(0111) oraz wypisuje wyniki.

Zadanie 2: Wykonaj przesunięcie w lewo iw liczbie 8o 2 bity. Wypisz wyniki.

Zadanie 3: Zaimplementuj program, który zamienia miejsce z dziesiętnej na binarną i wypisuje jej wartość w formie binarnej.
 */