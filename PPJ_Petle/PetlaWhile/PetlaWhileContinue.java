package PetlaWhile;

public class PetlaWhileContinue {

    public static void main(String[] args) {

        int  a = 5;
        while (a > 0){ //wchodzi do pętli - zaczynamy od a = 5. 5 jest większe od 0, true. Wchodzimy. Wchpddzimy do środka. 1 krok
            a--; //zmniejszamy wartość o 1 - zmniejszamy 5 o 1 i robi się 4. 2 krok
            if ( a == 2){ //sprawdzamy czy a jest =2. 3 krok -> Sprawdzamy czy 4 jest = 2 - nie jest,
                continue; //przerywa nam obecne przejscie pętli. Przechodzi od razu
                //do kolejnego wykonania tej pętli   5 krok -> więc to nie jest wykonywane
            }
            System.out.println("a = " + a); //6 krok -> drukujemy

        } //7 -> przechodzimy do końca pe†li i sprawdzamy na nowo od 1 wszego kroku
        System.out.println("Koniec");
    }
}
//continue mówi, żeby obecne wykonanie przerwać, ale nie w sensie żeby zakończyć działanie pętli, tylko przejdz znowu na początek.