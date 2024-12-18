/*
Napisz program, który obliczy sumę wszystkich par
liczb z tablicy. Wykorzystaj do tego dwie zagnieżdżone pętle for.
 */

public class ZadaniePetleSuma {
    public static void main(String[] args) {
        int[] tab = {2, 4, 6, 8}; // Tablica liczb całkowitych

        for (int i = 0; i < tab.length; i++) { // Pętla zewnętrzna
            for (int j = i; j < tab.length; j++) { // Pętla wewnętrzna
                System.out.println("Suma tab[" + i + "] i tab[" + j + "]: " + (tab[i] + tab[j]));
            }
        }
    }
}

/*
Wynik programu na konsoli
Suma tab[0] i tab[0]: 4
Suma tab[0] i tab[1]: 6
Suma tab[0] i tab[2]: 8
Suma tab[0] i tab[3]: 10
Suma tab[1] i tab[1]: 8
Suma tab[1] i tab[2]: 10
Suma tab[1] i tab[3]: 12
Suma tab[2] i tab[2]: 12
Suma tab[2] i tab[3]: 14
Suma tab[3] i tab[3]: 16

Pętla zewnętrzna przechodzi po każdym elemencie tablicy.
Pętla wewnętrzna oblicza sumy bieżącego elementu z wszystkimi następnymi elementami tablicy.
Dzięki temu wyświetlamy sumy dla wszystkich możliwych kombinacji elementów z tablicy (włącznie z elementem dodanym do siebie samego).
 */