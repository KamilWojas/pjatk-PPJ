package ZadaniaCwiczenia7;

public class Kółko {
    public static void main(String[] args) {

        int n = 9,
                np = n/2;
        for (int i=-np; i<np; i++){
            for (int j=-np; j<np; j++){
                System.out.println(
                        (i * i) + (j * j) <= (np * np)
                                ? '*' : ' '
                );
            }
            System.out.println();
        }
    }
}
