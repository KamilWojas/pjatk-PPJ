/*
Napisz program, który obliczy różnicę każdego elementu tablicy z sumą wszystkich
pozostałych elementów w tablicy. Wynik dla każdego elementu wyświetl na konsoli.
Wykorzystaj jedną pętlę for.
 */

public class ZadanieTablicaRoznice {
    public static void main(String[] args) {
        int[] tab = {3, 5, 7, 9}; // Tablica liczb całkowitych

        // Obliczanie sumy wszystkich elementów tablicy
        int suma = 0;
        for (int num : tab) { // Pętla foreach
            suma += num;
        }


        // Obliczanie różnic
        for (int i = 0; i < tab.length; i++) {
            int roznica = tab[i] - (suma - tab[i]);
            System.out.println("Różnica dla tab[" + i + "] (" + tab[i] + "): " + roznica);
        }
    }
}

/*
Wynik programu na konsoli

Różnica dla tab[0] (3): -18
Różnica dla tab[1] (5): -14
Różnica dla tab[2] (7): -10
Różnica dla tab[3] (9): -6
 */