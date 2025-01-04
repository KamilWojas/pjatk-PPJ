/*
Zadanie 2: Wykonaj przesunięcie w lewo iw liczbie 8 o 2 bity. Wypisz wyniki.

 */

public class ZadanieOperacjeBitowe2 {
    public static void main(String[] args){

        int liczba = 8; //1000

        //Przesunięcie w lewo
        int przesunLewo = liczba  << 2; //Wynik : 1000 << 2 = 100000
        System.out.println("Przesunięcie w lewo :" + przesunLewo);

        //Przesunięcie w prawo
        int przesunPrawo = liczba >> 2; //Wynik : 1000 >> 2 = 10
        System.out.println("Przesunięcie w prawo :" + przesunPrawo);


    }
}