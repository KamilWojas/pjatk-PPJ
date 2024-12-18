/*
Napisz program, który obliczy i wyświetli różnice między kolejnymi elementami tablicy liczb całkowitych.
Program powinien korzystać z dwóch zagnieżdżonych pętli for.
 */


public class ZadaniePetle {
    public static void main(String[] args) {
        int[] tab = {100, 90, 80, 70}; // Tablica liczb całkowitych

        for (int i = 0; i < tab.length; i++) { // Pętla zewnętrzna
            for (int j = i + 1; j < tab.length; j++) { // Pętla wewnętrzna
                System.out.println("Różnica między tab[" + i + "] i tab[" + j + "]: " + (tab[i] - tab[j]));
            }
        }
    }
}
