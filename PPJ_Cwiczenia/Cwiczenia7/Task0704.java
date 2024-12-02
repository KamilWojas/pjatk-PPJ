package ZadaniaCwiczenia7;

public class Task0704 {
    public static void main(String[] args) {

        int n = 9,
         np = n/2;
        for (int i=-np; i<np; i++){
            for (int j=-np; j<np; j++){
                System.out.println(
                        (i+np >= j && i-np <= j &&
                         -i+np >= j && -i-np <= j)
                        ? '*' : ' '
                );
            }
            System.out.println();
        }
    }
}
