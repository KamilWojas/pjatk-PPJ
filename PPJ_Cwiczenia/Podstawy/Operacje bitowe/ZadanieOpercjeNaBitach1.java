/*
Zadanie 1: Napisz program, który wykonuje operacje
AND, OR i XOR na liczbach 12(1100) i 7(0111) oraz wypisuje wyniki.
 */

 public class ZadanieOpercjeNaBitach1 {
     public static void main(String[] args){

         int a = 1100;
         int b = 0111;

         //Operacja AND
         int andWynik = 1100 & 0111; //Wynik : 1100 & 0111 = 0100
         System.out.println("AND :" + andWynik);

         //Operacja OR
         int orWynik = 1100 | 0111; //Wynik : 1100 | 0111 = 1111
         System.out.println("OR :" + orWynik);


     }
}





/*
Podstawowe operacje bitowe w Javie:
AND ( &) – Bit jest podłączony na 1 tylko wtedy, gdy oba bity są 1.
OR ( |) – Bit jest podłączony na 1, gdy podstawowy jeden z bitów jest 1.
XOR ( ^) – Bit jest podłączony na 1, gdy dokładnie jeden z bitów jest 1.
NOT ( ~) – Odwraca wszystkie bity (0 zamienia na 1, a 1 na 0).
 */