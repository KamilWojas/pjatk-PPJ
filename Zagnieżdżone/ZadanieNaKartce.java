package Zagnieżdżone;

public class ZadanieNaKartce {

    public static void main(String[] args) {

        int sum = 100;

        for (int i = 0; i<sum; i++){
            int tmp = i;
            while (tmp != 0){
                sum += tmp % 10;
                        tmp /=10;
            }
        }

    }
}
