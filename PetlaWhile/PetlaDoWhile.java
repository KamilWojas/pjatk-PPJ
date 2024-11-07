package PetlaWhile;

public class PetlaDoWhile {
    public static void main(String[] args) {

        int a = 5;

        // pętla działa analogicznie jak pętla while, ale ciało pętli wykona się min raz
        // wydrukuje wynik mimo, że warunek jest fałszywy


        do {
            System.out.println("a = " + a);
            a--;

        } while (a > 6 );
        System.out.println("Koniec");

    }
}
